package by.htp.itacademy.service.impl;

import java.util.List;

import by.htp.itacademy.dao.DAOException;
import by.htp.itacademy.dao.DAOProvider;
import by.htp.itacademy.dao.NewsDAO;
import by.htp.itacademy.entity.News;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;
import by.htp.itacademy.service.validation.Validation;

public class NewsServiceImpl implements NewsService{

	private DAOProvider provider = DAOProvider.getInstance();
	private NewsDAO newsDAO = provider.getNewsdao();
	
	@Override
	public void save(News news) throws ServiceException {
		try {
			if(Validation.isCorrect(news)) {
			newsDAO.save(news);
			}else {
				throw new ServiceException("Invalid news lenght");
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void update(News news) throws ServiceException {
		try {
			newsDAO.update(news);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void delete(int id) throws ServiceException {
		try {
			newsDAO.delete(id);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}	
	}

	@Override
	public News find(int id) throws ServiceException {
		News news;
		try {
			news = newsDAO.find(id);
			return news;
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public List<News> findAll() throws ServiceException {
		List<News> listNews;
		try {
			listNews = newsDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return listNews;
	}	
}

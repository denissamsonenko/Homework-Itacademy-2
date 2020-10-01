package by.htp.itacademy.service.impl;

import java.util.List;

import by.htp.itacademy.dao.DAOException;
import by.htp.itacademy.dao.DAOProvider;
import by.htp.itacademy.dao.NewsDAO;
import by.htp.itacademy.entity.News;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;

public class NewsServiceImpl implements NewsService{

	private DAOProvider provider = DAOProvider.getInstance();
	private NewsDAO newsDAO = provider.getNewsdao();
	
	@Override
	public void save(News news) throws ServiceException {
		try {
			newsDAO.save(news);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void update(News news, int id) throws ServiceException {
		try {
			newsDAO.update(news, id);
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
	public void find(int id) throws ServiceException {
		try {
			newsDAO.find(id);
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

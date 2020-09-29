package by.htp.itacademy.service.impl;

import java.util.List;

import by.htp.itacademy.dao.DAOException;
import by.htp.itacademy.dao.DAOProvider;
import by.htp.itacademy.dao.NewsDAO;
import by.htp.itacademy.entity.News;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;

public class NewsServiceImpl implements NewsService{
	private boolean value;

	@Override
	public void saveNews(News news) throws ServiceException {
		
		DAOProvider daoProvider = DAOProvider.getInstance();
		NewsDAO newsDao = daoProvider.getNewsdao(); 		
		
		try {
			newsDao.save(news);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}		
	}

	@Override
	public boolean newsExists(News news) throws ServiceException {
		
		DAOProvider daoProvider = DAOProvider.getInstance();
		NewsDAO newsDao = daoProvider.getNewsdao(); 
		
		List <News> list = null;
		try {
			list = newsDao.findAll();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	
		for (News news2 : list) {
			if(news2.getTitle().equals(news.getTitle())||
					news2.getBrief().equals(news.getBrief())||
					news2.getContent().equals(news.getContent())) { 
				value = true;
			}else value =false;			
		}return value;		
	}
}

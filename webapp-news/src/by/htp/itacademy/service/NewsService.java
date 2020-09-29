package by.htp.itacademy.service;

import by.htp.itacademy.entity.News;

public interface NewsService {
	
	void saveNews(News news) throws ServiceException;
	boolean newsExists(News news) throws ServiceException;
	
}

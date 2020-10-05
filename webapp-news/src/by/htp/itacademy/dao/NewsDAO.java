package by.htp.itacademy.dao;


import by.htp.itacademy.entity.News;

public interface NewsDAO extends CrudDAO<News>{
	void save(News news) throws DAOException;
	void update(News news) throws DAOException;
	
}

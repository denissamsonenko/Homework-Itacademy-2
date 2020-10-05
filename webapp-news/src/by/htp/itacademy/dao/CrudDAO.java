package by.htp.itacademy.dao;

import java.util.List;
import by.htp.itacademy.entity.News;

public interface CrudDAO<T> {
	
	void save(T model) throws DAOException;
	void update(T model) throws DAOException;
	void delete(int id) throws DAOException;
	News find(int id) throws DAOException;
	
	List<T> findAll() throws DAOException;
}

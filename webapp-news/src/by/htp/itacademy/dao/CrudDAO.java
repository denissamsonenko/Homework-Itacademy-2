package by.htp.itacademy.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDAO<T> {
	
	void save(T model) throws DAOException;
	void update(T model, Integer id) throws DAOException;
	void delete(Integer id) throws DAOException;
	Optional<T> find(Integer id) throws DAOException;
	
	List<T> findAll() throws DAOException;
}

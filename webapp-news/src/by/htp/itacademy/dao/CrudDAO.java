package by.htp.itacademy.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDAO<T> {
	
	void save(T model) throws DAOException;
	void update(T model, int id) throws DAOException;
	void delete(int id) throws DAOException;
	Optional<T> find(int id) throws DAOException;
	
	List<T> findAll() throws DAOException;
}

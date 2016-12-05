package DAO.Interface;

import java.util.List;

import DB.DAO;

public abstract class CRUD<T> extends DAO {
	
	public abstract boolean add( T t );
	public abstract boolean delete( int Id );
	public abstract boolean update( T t );
	public abstract List<T> getAll();
	public abstract T getById( int Id );

}

package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DAO.Interface.CRUD;
import Metier.Beans.Admin;
import Metier.Beans.Commercial;

public class DaoCommercial extends CRUD<Commercial>{

	@Override
	public boolean add(Commercial com) {
		// TODO Auto-generated method stub
		try {
			String query = "insert into commercial (nom,prenom,email,password) values (?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1,com.getNom()  );
			preparedStatement.setString(2,com.getPrenom());
			preparedStatement.setString(3,com.getEmail());
			preparedStatement.setString(4,com.getPassword());
			preparedStatement.execute();
			preparedStatement.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}	
	}

	@Override
	public boolean delete(int Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Commercial t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Commercial> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commercial getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}

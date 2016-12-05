package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DAO.Interface.CRUD;
import Metier.Beans.Admin;
import Metier.Beans.Voiture;

public class DaoAdmin extends CRUD<Admin> {

	@Override
	public boolean add(Admin admin) {
		try {
			String query = "insert into admin (nom,prenom,email,password) values (?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1,admin.getNom()  );
			preparedStatement.setString(2,admin.getPrenom());
			preparedStatement.setString(3,admin.getEmail());
			preparedStatement.setString(4,admin.getPassword());
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
	public boolean update(Admin t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

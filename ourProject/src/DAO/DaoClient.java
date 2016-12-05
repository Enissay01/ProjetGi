package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.Interface.CRUD;
import Metier.Beans.Client;

public class DaoClient extends CRUD<Client>{

	@Override
	public boolean add(Client cl) {
		try {
			String query = "insert into client (nom,prenom,email,password,tel,cin,permis,codeBanque) values (?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1,cl.getNom()  );
			preparedStatement.setString(2,cl.getPrenom());
			preparedStatement.setString(3,cl.getEmail());
			preparedStatement.setString(4,cl.getPassword());
			preparedStatement.setString( 5,cl.getTel());
			preparedStatement.setString(6,cl.getCin());
			preparedStatement.setString(7,cl.getPermis());
			preparedStatement.setString(8,cl.getCodeBanc());
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
		try {
			String query = "delete from client where id=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, Id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Client t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		List<Client> clients = new ArrayList<>();
		try {
			Statement statement = (Statement) conn.createStatement();
			ResultSet resultSet = statement.executeQuery( "select * from client" );
			while( resultSet.next() ) {
				Client client =new Client();
				client.setId(resultSet.getInt( "id" ));
				client.setNom(resultSet.getString( "nom" ));
				client.setPrenom(resultSet.getString("prenom"));
				client.setEmail(resultSet.getString("email"));
				client.setPassword(resultSet.getString("password"));
				client.setTel(resultSet.getString("tel"));
				client.setCin(resultSet.getString("cin"));
				client.setPermis(resultSet.getString("permis"));
				client.setCodeBanc(resultSet.getString("codebanque"));
				
				clients.add(client);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return clients;

	}

	@Override
	public Client getById(int Id) {
		// TODO Auto-generated method stub
		Client client =new Client();
		try {
			String query = "select * from client where id=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setInt(1, Id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) {
				client.setId(resultSet.getInt( "id" ));
				client.setNom(resultSet.getString( "nom" ));
				client.setPrenom(resultSet.getString("prenom"));
				client.setEmail(resultSet.getString("email"));
				client.setPassword(resultSet.getString("password"));
				client.setTel(resultSet.getString("tel"));
				client.setCin(resultSet.getString("cin"));
				client.setPermis(resultSet.getString("permis"));
				client.setCodeBanc(resultSet.getString("codebanque"));
				}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return client;
	}

}

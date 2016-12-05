package DB;

import java.sql.Connection;

public  abstract class DAO {

	protected Connection conn;
	 
	
	protected DAO()
	{
		conn = DBUtil.getConnection();
	}
	

	
	
}

package connectionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class ConnectionManager {
	Connection con=null;
	public Connection establishConncetion() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/INVENTORY","Prakash","Prakash2002@");
		return con;
	}
	public void closeConnection() throws SQLException
	{
		con.close();
		
	}
}


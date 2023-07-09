package dao;
import model.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import  java.sql.SQLException;
import connectionManager.ConnectionManager;

public class LoginDAO {
	public boolean validate(Login login) throws  ClassNotFoundException,SQLException
	{
		String username=login.getUSERNAME();
		String password=login.getPASSWORD();
		
		ConnectionManager conn=new ConnectionManager();
		Connection con=conn.establishConncetion();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM LOGIN");
		
		while(rs.next())
		{
			if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD")))
					{
				
				conn.closeConnection();
				return true;
				
			}
		}
		conn.closeConnection();
		return false;
		
		
		
	}

}

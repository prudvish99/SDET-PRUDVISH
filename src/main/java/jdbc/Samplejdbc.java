package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.FindStatement;

public class Samplejdbc
{
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Driver driverRef=new Driver();
		
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection("jdbc:mysql:3306/prudvish","root","root");
	Statement stat = con.createStatement();
	ResultSet result=stat.executeQuery("select * from testing");
	while(result.next())
	{
		System.out.println(result.getString(1));
	}
	con.close();
	}
	}



package sakila.util;

import java.sql.*;

public class DBUtil {

	

	public static Connection getConnection()throws Exception{	
		final String DB_ADDR = "jdbc:mariadb://localhost:3306/sakila";
		final String DB_ID = "root";
		final String DB_PW = "java1004";
		final Connection conn = DriverManager.getConnection(DB_ADDR,DB_ID,DB_PW);	
		return conn;
	}

}

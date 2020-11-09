package prJavalin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PRConnectionUtil {
	
	private Connection conn;
	
	public Connection createConnection() throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?", "postgres", "R3v@tur3");
		
		return conn;
		
	}
	

}

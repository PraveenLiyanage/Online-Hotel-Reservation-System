package booking;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	
	private static String url = "jdbc:mysql://localhost:3306/database1";
	private static String user = "root";
	private static String password = "ashan123";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Succcessful");
	    }
		
		catch(Exception e){
			System.out.println("Unsuccessful");	
		}
		
		return con;
	
}
}

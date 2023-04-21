package pack1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pack1.DB;

public class functions {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
    public static List<custom> validate(String name1, String password1){
    	
    	ArrayList<custom> cus = new ArrayList<custom>();
    	
    	try {
    		
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from mytable where name='"+name1+"' and password='"+password1+"'";
    		rs = stmt.executeQuery(sql);
    		
    		if(rs.next()) {
    			int id2 = rs.getInt(1);
    			String name2 = rs.getString(2);
    			String password2 = rs.getString(3);
    			String phone2 = rs.getString(4);
    			String email2 = rs.getString(5);
    			
    			custom c = new custom(id2,name2,password2,phone2,email2);
    			cus.add(c);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return cus;
    }
    
    public static boolean insertCustom(String name3, String password3, String phone3, String email3) {
		
    	boolean isSuccess = false;
    	
    	try {
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 = "insert into mytable values(0, '"+name3+"', '"+password3+"', '"+phone3+"', '"+email3+"')";
    		int rs = stmt.executeUpdate(sql2);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	return false;
    	
    }
    
    public static boolean updateCustomer(String id5, String name5, String password5, String phone5, String email5) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="update mytable set name='"+name5+"', password='"+password5+"', phone='"+phone5+"', email='"+email5+"' where id='"+id5+"'";
    		int rs = stmt.executeUpdate(sql2);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
	
 public static boolean deleteCustomer(String id5) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="DELETE FROM mytable WHERE id='"+id5+"' ";
    		int rs = stmt.executeUpdate(sql2);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
	
}

package vacancies;

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
	
    public static List<vacancies> validate(String vid){
    	
    	ArrayList<vacancies> cus = new ArrayList<vacancies>();
    	
    	try {
    		
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from vacancies where  vacancies_id='"+vid+"'";
    		rs = stmt.executeQuery(sql);
    		
    		if(rs.next()) {
    			int id = rs.getInt(1);
    			String type = rs.getString(2);
    			String price = rs.getString(3);
    			String availabale = rs.getString(4);
    			String location = rs.getString(5);
    			
    			vacancies v = new vacancies(id,type,price,availabale,location);
    			cus.add(v);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return cus;
    }
    
    public static boolean insertVacancies(String name, String price, String availabel, String location) {
		
    	boolean isSuccess = false;
    	
    	try {
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 = "insert into vacancies values(0, '"+name+"', '"+price+"', '"+availabel+"', '"+location+"')";
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
    
    public static boolean UpdateVacancies(String id, String types , String prise, String availabe, String location ) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="update vacancies set vacancies_type='"+types+"', price='"+prise+"', available='"+availabe+"', location='"+location+"' where vacancies_id='"+id+"'";
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
	
 public static boolean deletevacancies(String id5) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="DELETE FROM vacancies WHERE vacancies_id='"+id5+"' ";
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

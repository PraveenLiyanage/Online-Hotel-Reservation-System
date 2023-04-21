package booking;

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
	
    public static List<booking> validate(String nic){
    	
    	ArrayList<booking> cus = new ArrayList<booking>();
    	
    	try {
    		
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from booking where nic_number='"+nic+"'";
    		rs = stmt.executeQuery(sql);
    		
    		if(rs.next()) {
    			int id = rs.getInt(1);
    			String name = rs.getString(2);
    			String nic_number = rs.getString(3);
    			String booking_type = rs.getString(4);
    			String booking_date = rs.getString(5);
    			String vacnt_id = rs.getString(6);
    			
    			booking b = new booking(id,name,nic_number,booking_type,booking_date,vacnt_id);
    			cus.add(b);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return cus;
    }
    
    public static boolean insertBooking(String name, String nic, String type, String date,String idnumber) {
		
    	boolean isSuccess = false;
    	
    	try {
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 = "INSERT INTO booking(`booking_id`,`name`,`nic_number`,`booking_type`,`booking_date`,`vacant_id_number`) VALUES (0,'"+name+"', '"+nic+"', '"+type+"', '"+date+"','"+idnumber+"')";
    		 
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
    
    public static boolean updateBooking(String id,String name, String nic, String type, String date,String idnumber) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="update booking set name='"+name+"', nic_number='"+nic+"', booking_type='"+type+"', booking_date='"+date+"' , vacant_id_number='"+idnumber+"' where booking_id='"+id+"'";
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
	
 public static boolean deleteBooking(String id5) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="DELETE FROM booking WHERE booking_id='"+id5+"' ";
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

package feedback;

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
	
    public static List<feedback> validate(String email){
    	
    	ArrayList<feedback> cus = new ArrayList<feedback>();
    	
    	try {
    		
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from feedback where email ='"+email+"'";
    		rs = stmt.executeQuery(sql);
    		
    		if(rs.next()) {
    			int feedback_id = rs.getInt(1);
    			String feedback = rs.getString(2);
    			String email2 = rs.getString(3);
    			String name = rs.getString(4);
    			
    			
    			feedback f = new feedback(feedback_id,feedback,email2,name);
    			cus.add(f);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return cus;
    }
    
    public static boolean insertFeedback(String name, String email, String feedbck) {
		
    	boolean isSuccess = false;
    	
    	try {
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 = "insert into feedback values(0, '"+feedbck+"', '"+email+"', '"+name+"')";
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
    
    public static boolean updateFeedback(String id, String name, String email, String feescak) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="update feedback set  feedback='"+feescak+"', email='"+email+"', name='"+name+"' where feedback_id='"+id+"'";
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
	
 public static boolean deleteFeedback (String id) {
    	
    	
    	boolean isSuccess = false;
    	try{
    		con = DB.getConnection();
    		stmt = con.createStatement();
    		String sql2 ="DELETE FROM feedback WHERE feedback_id='"+id+"' ";
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

package booking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update_booking
 */
@WebServlet("/update_booking")
public class update_booking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("ID");
		String name = request.getParameter("NAME");
		String nic = request.getParameter("NIC");
		String type = request.getParameter("TYPE");	
		String date = request.getParameter("DATE");
		String id_number = request.getParameter("V_ID");
		
		boolean isTrue;
		
		isTrue = functions.updateBooking(id,name, nic, type, date,id_number);
		
		if(isTrue == false) {
			RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("home.jsp");
			dis2.forward(request, response);
		}	
	}

}

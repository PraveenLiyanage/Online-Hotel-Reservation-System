package feedback;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update_feedback
 */
@WebServlet("/update_feedback")
public class update_feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("ID");
		String name = request.getParameter("feed");
		String email = request.getParameter("email");
		String feedback = request.getParameter("name");	
		 
		
		boolean isTrue;
		
		isTrue = functions.updateFeedback( id,name, email, feedback );
		
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

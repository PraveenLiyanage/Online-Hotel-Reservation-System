package vacancies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete_vacancies
 */
@WebServlet("/delete_vacancies")
public class delete_vacancies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String ID = request.getParameter("ID");
		
		
		boolean isTrue;
		
		isTrue = functions.deletevacancies(ID);
		
		if(isTrue == false) {
			RequestDispatcher dis = request.getRequestDispatcher("home_admin.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("home_admin.jsp");
			dis2.forward(request, response);
		}
	}

}

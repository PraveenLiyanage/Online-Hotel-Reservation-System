package vacancies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class add_vacancies
 */
@WebServlet("/add_vacancies")
public class add_vacancies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String prise = request.getParameter("price");
		String availabel = request.getParameter("available");	
		String location = request.getParameter("location");
		
		
		boolean isTrue;
		
		isTrue = functions.insertVacancies(name, prise, availabel, location);
		
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

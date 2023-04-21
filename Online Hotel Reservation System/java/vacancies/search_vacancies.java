package vacancies;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class search_vacancies
 */
@WebServlet("/search_vacancies")
public class search_vacancies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vid = request.getParameter("v_id");
		
		
		try {
			List<vacancies> vacantDetail = functions.validate(vid);
			request.setAttribute("vacantDetail",vacantDetail);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("vacancies_account.jsp");
		dis.forward(request, response);		
	}

}

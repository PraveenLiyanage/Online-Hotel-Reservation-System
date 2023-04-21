package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/regServlet")
public class regServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public regServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name1 = request.getParameter("name");
		String password1 = request.getParameter("pass");
		String phone1 = request.getParameter("phone");
		String email1 = request.getParameter("email");		
		
		boolean isTrue;
		
		isTrue = functions.insertCustom(name1, password1, phone1, email1);
		
		if(isTrue == false) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}

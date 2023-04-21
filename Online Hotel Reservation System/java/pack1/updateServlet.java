package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public updateServlet() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id4 = request.getParameter("cid");
		String name4 = request.getParameter("name");
		String password4 = request.getParameter("password");
		String phone4 = request.getParameter("phone");
		String email4 = request.getParameter("email");
		
		boolean isTrue;
		
		isTrue = functions.updateCustomer(id4, name4, password4, phone4, email4);
		
		if(isTrue == true) {
			RequestDispatcher dis1 = request.getRequestDispatcher("login.jsp");
			dis1.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}

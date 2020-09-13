package ServletsClasses;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = addUser(request, response);
		request.setAttribute("user",user);
		
		request.getRequestDispatcher("/viewProfile.jsp").forward(request, response);;
		
	}
	
	private User addUser(HttpServletRequest request, HttpServletResponse response) {
		User user = new User();;
		user.setName(request.getParameter("UserName"));
		user.setSurname(request.getParameter("UserSurname"));
		user.setEmail(request.getParameter("email"));
		return user;
	}

}

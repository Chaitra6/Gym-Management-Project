package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import dao.UserDao;
import model.Admin;
import model.User;

/**
 * Servlet implementation class UserLoginController
 */
@WebServlet("/userlogin")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/userLoginView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email"); //gets email from jsp page
		String password = request.getParameter("password");
		
		User user = new User();
		
		user.setEmail(email);
		user.setPassword(password);
		
		UserDao userdao = new UserDao();
		
		try {
			boolean validateAdmin = userdao.loginUser(user);	
			if(validateAdmin) {
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/userView.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("message", "Login Unsuccessful");
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/userLoginView.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

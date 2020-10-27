package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogic.ValidateAdmin;
import dao.AdminDao;

import model.Admin;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns= {"/adminlogin"})
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/adminLoginView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email"); //gets email from jsp page
		String password = request.getParameter("password");
		
		Admin admin =  new Admin();
		
		admin.setEmail(email);
		admin.setPassword(password);
		
	
		ValidateAdmin va = new ValidateAdmin();
		
		
			boolean validateAdmin;
			try {
				validateAdmin = va.validate(admin);
				if(validateAdmin) {
					
					RequestDispatcher rd = this.getServletContext().getRequestDispatcher("./WEB-INF/views/adminCRUDView.jsp");
					rd.forward(request, response);
				}
				else {
					request.setAttribute("message", "Login Unsuccessful");
					RequestDispatcher rd = this.getServletContext().getRequestDispatcher("./WEB-INF/views/adminLoginView.jsp");
					rd.forward(request, response);
				
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 
	}

}

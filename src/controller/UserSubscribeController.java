package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class UserSignUpController
 */
@WebServlet("/UserSubsController")
public class UserSubscribeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSubscribeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate date = LocalDate.now();
		request.setAttribute("subDate", date);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/userSubsView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email"); //gets email from jsp page
		System.out.println(email);
		
		String password = request.getParameter("password");
		System.out.println("Password Entered");
		
		int subPrice = Integer.parseInt(request.getParameter("price"));
		System.out.println(subPrice);

		LocalDate subdate = LocalDate.now();
		System.out.println(subdate);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate expdate = LocalDate.parse(request.getParameter("expdate"), formatter);
		System.out.println(expdate);
		
	
		User user = new User();
		
		user.setEmail(email);
		user.setPassword(password);
		user.setPrice(subPrice);
		user.setSubs_date(subdate);
		user.setSubs_exp_date(expdate);
		
		UserDao userdao = new UserDao();
		
		int checkUser = userdao.subscribeUser(user);
	
		if(checkUser!=0)
		{
						
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			
			//request.setAttribute("message", "Registration Successful");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/userView.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message", "Registration Unsuccessful");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/userSubsView.jsp");
			rd.forward(request, response);
		}
	
	
	
	}

}

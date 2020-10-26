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

import dao.AdminDao;

import model.User;

/**
 * Servlet implementation class EditUserController
 */
@WebServlet("/EditUserController")
public class EditUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditUserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LocalDate date = LocalDate.now();
		request.setAttribute("subDate", date);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/editUserView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entering Update User");
		System.out.println("Entering do post");

		int userId = Integer.parseInt(request.getParameter("userId"));
		System.out.println(userId);
		int subPrice = Integer.parseInt(request.getParameter("price"));
		System.out.println(subPrice);

		LocalDate subdate = LocalDate.now();
		System.out.println(subdate);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate expdate = LocalDate.parse(request.getParameter("expdate"), formatter);
		System.out.println(expdate);

		User user = new User();

		user.setUserId(userId);
		user.setPrice(subPrice);
		user.setSubs_date(subdate);
		user.setSubs_exp_date(expdate);

		AdminDao admindao = new AdminDao();
		try {
			admindao.updateUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("allusers");

	}

}

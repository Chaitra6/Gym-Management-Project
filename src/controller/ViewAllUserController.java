package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import model.User;

/**
 * Servlet implementation class ViewAllUserController
 */
@WebServlet("/allusers")
public class ViewAllUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("View All users");
		System.out.println("Getting all User Details");
		AdminDao admindao = new AdminDao();
		List<User> listUser = admindao.selectAllUsers();
		for(User userlist:listUser) {
			System.out.println(userlist.getUserId());
			System.out.println(userlist.getEmail());
			System.out.println(userlist.getPrice());
			System.out.println(userlist.getSubs_date());
			System.out.println(userlist.getSubs_exp_date());
		}
		request.setAttribute("listUser", listUser);
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/allUsersView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

package dao;

import java.sql.SQLException;
//import java.util.List;
import java.util.List;

import model.Admin;
import model.User;



public interface AdminDaoInderface {
    boolean loginAdmin(Admin admin) throws Exception;
    int insertUser(User user) throws SQLException;
    //User selectBlog(int userId);
	List<User> selectAllUsers();
	void deleteUser(int userId) throws SQLException;
	void updateUser(User user) throws SQLException, Exception;
  
}

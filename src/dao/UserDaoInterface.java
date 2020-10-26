package dao;

//import java.sql.SQLException;

import model.User;

public interface UserDaoInterface {
	int subscribeUser(User user) ;
	User selectUser(int userId);
	boolean loginUser(User user);
}

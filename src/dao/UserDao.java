package dao;

//import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import model.User;
import utility.HibernateConnectionManager;

public class UserDao implements UserDaoInterface{
	

	private SessionFactory sf = HibernateConnectionManager.getSessionFactory();

	@Override
	public int subscribeUser(User user) {
		Session session = this.sf.openSession();
		Transaction transaction = session.beginTransaction();
		if (session.save(user) != null) {
			transaction.commit();
			session.close();
			return 1;
		} else
			return 0;
		
		
	}

	@Override
	public User selectUser(int userId) {
		Session session = this.sf.openSession();
        User user = session.get(User.class, userId);
        session.close();
        return user;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean loginUser(User user) {
		Session session = this.sf.openSession();
		Transaction transaction = null;
		try {
			transaction = session.getTransaction();
			transaction.begin();
			Query query = session.createQuery(
					"from USER where email='" + user.getEmail() + "' password='" + user.getPassword() + "'");

			user = (User) query.uniqueResult();

			transaction.commit();
			session.close();
			return true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				session.close();
			}
			e.printStackTrace();
		}
		return false;
	}

}

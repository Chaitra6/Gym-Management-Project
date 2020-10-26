package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Admin;
import model.User;
import utility.HibernateConnectionManager;

public class AdminDao implements AdminDaoInderface {

	private SessionFactory sf = HibernateConnectionManager.getSessionFactory();

	//@SuppressWarnings("deprecation")
	@Override
	public boolean loginAdmin(Admin admin) throws Exception {
		Session session = this.sf.openSession();
		Transaction transaction = null;
		try {
			transaction = session.getTransaction();
			transaction.begin();
			// Query query = session.createQuery("from USER_LOGIN where email='"
			// +user.getEmail()+"' and password='"+user.get+"' ");
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery(
					"from ADMIN where email='" + admin.getEmail() + "' password='" + admin.getPassword() + "'");

			admin = (Admin) query.uniqueResult();

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

	@Override
	public int insertUser(User user) throws SQLException {
		Session session = this.sf.openSession();
		Transaction transaction = session.beginTransaction();
		if (session.save(user) != null) {
			transaction.commit();
			session.close();
			return 1;
		} else
			return 0;

	}

	//@SuppressWarnings("deprecation")
	@Override
	public List<User> selectAllUsers() {
		Session session = this.sf.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> root = query.from(User.class);
		query.select(root);
		Query<User> q = session.createQuery(query);
		List<User> listUser = q.getResultList();
		return listUser;
	}

	@Override
	public void deleteUser(int userId) throws SQLException {
		Session session = this.sf.openSession();
		Transaction transaction = session.beginTransaction();
		User user = session.get(User.class, userId);
		session.delete(user);
		transaction.commit();
		session.close();

	}

	@Override
	public void updateUser(User user) throws SQLException, Exception {
		Session session = this.sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
		session.close();

	}

}

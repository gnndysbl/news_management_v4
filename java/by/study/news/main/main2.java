package by.study.news.main;

import java.util.Date;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import by.study.news.bean.User;
import by.study.news.dao.UserDAO;
import by.study.news.dao.connection.ConnectionPool;
import by.study.news.dao.connection.ConnectionPoolException;
import by.study.news.dao.exception.DAOException;
import by.study.news.dao.factory.DAOFactory;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ConnectionPool.getInstance().initPoolData();
		} catch (ConnectionPoolException e) {
			throw new RuntimeException(e);
		}
		
		
		final UserDAO userDAO = DAOFactory.getInstance().getUserDAO();
		try {
			
			//userDAO.activate(31);
			//System.out.println(userDAO.getById(131));

			System.out.println(userDAO.getById(150));
			User user = userDAO.getById(150);
			user.setLogin("");
			userDAO.update(user);
			System.out.println(userDAO.getById(150));
			
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ConnectionPool.getInstance().dispose();
		} catch (ConnectionPoolException e) {
			throw new RuntimeException(e);
		}

	}
}

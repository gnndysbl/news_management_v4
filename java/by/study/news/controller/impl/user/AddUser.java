package by.study.news.controller.impl.user;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import by.study.news.bean.User;
import by.study.news.bean.UserStatus;
import by.study.news.controller.Command;
import by.study.news.dao.UserDAO;
import by.study.news.dao.exception.DAOException;
import by.study.news.dao.factory.DAOFactory;
import by.study.news.service.UserService;
import by.study.news.service.exception.ServiceException;
import by.study.news.service.factory.ServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddUser implements Command {

	private UserService userService = ServiceFactory.getInstance().getUserService();

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		User user = new User(	request.getParameter("name"),
								request.getParameter("lastName"),
								request.getParameter("login"),
								request.getParameter("email"),
								request.getParameter("password")
				);
		
		
		user.setDate(new Date());
		user.setStatus(UserStatus.ACTIVE);
		
		try {
			userService.registration(user);
			request.setAttribute("message", user.getLogin());
			// request.getRequestDispatcher("index.jsp").forward(request, response);
			response.sendRedirect("index.jsp");

		} catch (ServiceException e) {
			e.getMessage();
			e.printStackTrace();

			request.setAttribute("error", e.getMessage());
			// request.getRequestDispatcher("WEB-INF/jsp/registration.jsp").forward(request,
			// response);
			response.sendRedirect("controller?command=go_to_registration_page");

		}
	}
}

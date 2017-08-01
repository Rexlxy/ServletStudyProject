package com.java1234.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java1234.dao.UserDao;
import com.java1234.model.User;
import com.java1234.util.DbUtil;
public class RegisterServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DbUtil dbutil = new DbUtil();
	UserDao userDao = new UserDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = (String) req.getParameter("newUserName");
		String password = (String) req.getParameter("newPassword");
		User newUser = new User(userName, password);
		try {
			userDao.registerUser(dbutil.getConnection(), newUser);
			System.out.println("×¢²á³É¹¦£¡£¡");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("×¢²áÊ§°Ü");
			e.printStackTrace();
		}
		resp.sendRedirect("login.jsp");
	}

}

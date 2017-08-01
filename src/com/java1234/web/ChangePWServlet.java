package com.java1234.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java1234.dao.UserDao;
import com.java1234.model.User;
import com.java1234.util.DbUtil;
public class ChangePWServlet extends HttpServlet{

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
		String newPassword = (String) req.getParameter("newPassword");
		HttpSession session = req.getSession();
		User currentUser = (User) session.getAttribute("currentUser");
		User preUser = new User(currentUser.getUserName(), currentUser.getPassword());
		currentUser.setPassword(newPassword);
		
		try {
			userDao.updateUser(dbutil.getConnection(), preUser, currentUser);
			System.out.println("更新密码成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("更新密码失败");
			e.printStackTrace();
		}
		req.getRequestDispatcher("/logout").forward(req,resp);

	}

}

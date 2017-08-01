package com.java1234.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java1234.dao.UserDao;
import com.java1234.model.User;
import com.java1234.util.DbUtil;


public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DbUtil dbutil = new DbUtil();
	UserDao userDao = new UserDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String userName = req.getParameter("userName");
			String password = req.getParameter("password");
			Connection con = null;
			try {
				con = dbutil.getConnection();
				User user = new User(userName, password);
				User currentUser = userDao.login(con, user);
				if(currentUser==null){
					System.out.println("不是用户");
					req.setAttribute("error1","Incorrect user name or password11" );
					req.setAttribute("userName", userName);
					req.setAttribute("password", "");
					req.getRequestDispatcher("login.jsp").forward(req, resp);
				} else {
					System.out.println("是已注册用户");
					HttpSession session = req.getSession();
					session.setAttribute("currentUser", currentUser);
					resp.sendRedirect("main.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroyed!!");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init!!");
	}
	
	

}

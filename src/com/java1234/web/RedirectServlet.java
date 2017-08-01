package com.java1234.web;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RedirectServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("requestKey", "request value");
		HttpSession session = req.getSession();
		session.setAttribute("sessionKey", "session value");
		ServletContext application = this.getServletContext();
		application.setAttribute("applicationKey", "application value");
		resp.sendRedirect("target.jsp");
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

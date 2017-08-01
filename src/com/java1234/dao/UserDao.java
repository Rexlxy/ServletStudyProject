package com.java1234.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java1234.model.User;


public class UserDao {

	public User login(Connection con, User user)throws Exception{
		User resultUser = null;
		String sql = "select * from users where name=? and passWord=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			resultUser = new User();
			resultUser.setUserName(rs.getString("name"));
			resultUser.setPassword(rs.getString("passWord"));
		}
		con.close();
		return resultUser;
	}
	
	public void registerUser(Connection con, User user)throws Exception{
		String sql = "insert into users (id,name,passWord) values(NULL,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	}
	
	public void updateUser(Connection con, User preUser, User curUser)throws Exception{
		String sql = "update users set name=?,passWord=? where name=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, curUser.getUserName());
		pstmt.setString(2, curUser.getPassword());
		pstmt.setString(3, preUser.getUserName());
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	}

}

package com.dao;

import com.Bean.RegisterBean;
import com.dbConncetion.DbConncetion;
import java.sql.*;

public class RegisterDao{
	 
	
	public String registerUser(RegisterBean rbean) throws SQLException{
		
		//RegisterBean rbean = new RegisterBean();
		DbConncetion dbconnection = new DbConncetion();
		 
		
	 String userName= null;
	 String email =null ; 
	 String fullName = null;
	 String password = null; 
	 
	 Connection con = null;
	 PreparedStatement prepareStmt = null; 
			 
	 userName = rbean.getUserName();
	 email = rbean.getEmail();
	 fullName = rbean.getFullName();
	 password = rbean.getPassword();
	 
	 try {
		 con = dbconnection.connection();
		 prepareStmt = con.prepareStatement("insert into users  values("+"\""+rbean.getUserName()+"\""+","+"\""+rbean.getEmail()+"\""+","+"\""+rbean.getFullName()+"\""+","+"\""+rbean.getPassword()+"\""+")");
		 
		/* prepareStmt.setString(1,fullName);
		 prepareStmt.setString(2,"alskld@gmail.com");
		 prepareStmt.setString(3,userName);
		 prepareStmt.setString(4,password);*/
		 
		 int i = prepareStmt.executeUpdate();
		 
		 if(i != 0){
			 return "sucssecful";
		 }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally{
		 con.close();
	 }
	 
	 return "something wrong";
	}
}
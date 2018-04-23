package com.dbConncetion;

import java.sql.*;


public class DbConncetion {
	
	 public  Connection connection(){
		 
		 Connection  conne= null;
		 
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				conne = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false","root","1234");
				return conne;
			}catch(Exception e){
				e.printStackTrace();
			}
			return conne;
			
		 
		 
		 
		 
}
 


}

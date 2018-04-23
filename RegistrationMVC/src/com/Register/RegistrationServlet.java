package com.Register;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.RegisterBean;
import com.dao.RegisterDao;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationPath")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public RegistrationServlet(){}

	 
	 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userName,email,fullName,password;
		
		userName = request.getParameter("userName");
		fullName = request.getParameter("fullName");
		email = request.getParameter("email");
		password = request.getParameter("password");
		
		RegisterBean registeredUser = new RegisterBean();
		
		registeredUser.setEmail(email);
		registeredUser.setFullName(fullName);
		registeredUser.setPassword(password);
		registeredUser.setUserName(userName);
		
		RegisterDao rdao = new RegisterDao();
		
		String result = null;
		try {
			result = rdao.registerUser(registeredUser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result.equals("sucssecful")){
			request.getRequestDispatcher("/Home.jsp").forward(request,response);
		}else{
			request.setAttribute("errMessage", result);
			request.getRequestDispatcher("/Registration.jsp").forward(request,response);
		}



		 
	}

}

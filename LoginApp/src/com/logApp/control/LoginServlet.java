package com.logApp.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;


import  com.Details.user.*;

import com.logApp.BusinessLogic.AuthenticationService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("Password");
		
		AuthenticationService service = new AuthenticationService();
		boolean result = service.authentication(userId, password);
		
		User user1 = (User) service.getUserDetails(userId);
		request.setAttribute("user1",user1);
		if(result){
			
		//	response.sendRedirect("Greetings.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Greetings.jsp");
			dispatcher.forward(request, response);
			return;
		}else{
			response.sendRedirect("Login.jsp");
			return;
		}
		
		
	}

}

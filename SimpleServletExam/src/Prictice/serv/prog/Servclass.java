package Prictice.serv.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(description = "A simple servlet for saying hello", urlPatterns = { "/Servclasspath" },initParams = {@WebInitParam(name ="defaultuser",value = "manojkumar")})
public class Servclass extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		System.out.println("hello world");
		
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		if(userName != "" & userName != null){
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		out.println("request parameter has username" + userName);
		out.println("session parameter has username" + session.getAttribute("savedUserName"));
		out.println("context parameter has username" +  context.getAttribute("savedUserName"));
		//out.println("the initial parameters" + this.getServletConfig().getInitParameter("defaultuser"));
		 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		System.out.println("hello world");
		
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		 
		if(userName != "" & userName != null){
			session.setAttribute("savedUserName", userName);
		 
		}
		
		out.println("request parameter has username" + userName);
		out.println("session parameter has username" +  session.getAttribute("savedUserName"));
 
	 
		 
	}

}

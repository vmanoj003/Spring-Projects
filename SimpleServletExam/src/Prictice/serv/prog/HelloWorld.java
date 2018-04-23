package Prictice.serv.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(description = "A simple servlet for saying hello", urlPatterns = { "/HelloWorldPath" },initParams = {@WebInitParam(name ="defaultuser",value = "manojkumar")})
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	public String message;
	public void init() throws ServletException{
		
		 message = "hey, how are you doing?";
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		System.out.println("hello world");
		PrintWriter p = response.getWriter();
		p.println("hello World" + "<h2>"+ message +"</h2>");
		//response.getWriter().append("Served at: ").append(request.getContext());
		p.println("the initial parameters" + this.getServletConfig().getInitParameter("defaultuser"));
		 
	}
	
	public void destroy(){}

}

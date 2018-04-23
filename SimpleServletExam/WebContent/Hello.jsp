<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>simple JSP</title>
</head>
<body>
Hello! <br/>
<% out.println("you\'r ip is"+ request.getRemoteAddr());%>
<br/>
<%! int a =15,b=15; %>
<%! int c = a+b; %>
<% out.println("the sum of numbers we entered is:"+c); %>
<p>today date is :<%= (java.time.LocalDateTime.now().toString()) %></p>
 <%-- <p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p> --%>
 
 <% String userName = request.getParameter("userName");
 	if(userName != null & userName != ""){
 		
 		session.setAttribute("sessionUserName", userName);
 		//application.setAttribute("applicationUserName",userName);
 		pageContext.setAttribute("pageContextUserName",userName);
 		pageContext.setAttribute("applicationUserName", userName, pageContext.APPLICATION_SCOPE);
 		 
 	}
 	Object pu = pageContext.findAttribute("userName");
 %>
 
 <br/>
 the request userName is:<%= userName %>
 <br/>
 the session userName is :<%= session.getAttribute("sessionUserName") %>
 <br/>
 the application userName is : <%= application.getAttribute("applicationUserName") %>
 <br/>
 the pageContext userName is : <%= pageContext.getAttribute("pageContextUserName") %>
 <br/>
 the pagefind Context is: <%= pu %>
</body>
</html>
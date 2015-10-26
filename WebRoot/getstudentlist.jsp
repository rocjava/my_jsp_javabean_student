<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="com.javabean.*,java.util.List" %>

<%
	request.setCharacterEncoding("utf-8");
	String action = request.getParameter("action");
	System.out.println(action);
	if(action.equals("list")){
		DBUser db = new DBUser(this.getServletContext());
		List list = db.getStudents();
		session.setAttribute("students",list);
		response.sendRedirect("studentlist.jsp");
	}else if(action.equals("listbyname")){
		
	}else{
	
	}
 %>

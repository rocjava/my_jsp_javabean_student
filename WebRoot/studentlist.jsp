<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="java.util.List,com.javabean.*" %>
<% List list = (List)session.getAttribute("students");%>
<html>
  <head>
  <title>学生信息列表</title>
  </head>
  
  <body>
	<table border=1 align=center  style="border-collapse:collapse">
	
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>专业</td>
			<td>爱好</td>
			<td>住址</td>
		</tr>
		
			<%
			if(list!=null){
			
			for(int i=0;i<list.size();i++){
				Student student = (Student)list.get(i);
											%>
			<tr>
			<td><%= student.getSsno()%></td>
			<td><%= student.getSsname()%></td>
			<td><%= student.getSssex()%></td>
			<td><%= student.getSsage()%></td>
			<td><%= student.getSsmajor()%></td>
			<td><%= student.getSsfav()%></td>
			<td><%= student.getSsaddress()%></td>
			
			
			</tr>
			<% 
				} 
			
			}
			%>
	</table>
	<p align=center><a href="index.jsp">返回主页</a></p>
  </body>
</html>

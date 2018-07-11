
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "java.text.SimpleDateFormat" %>
<%@page import= "java.util.Date" %>
<%!
	int a = 4, b=5;
%>
<% 
	int c = a+b;
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>main</title>
	<link rel="stylesheet" href="css/style.css" />
</head>
<body>
<%=new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date()) %>
	<table class="margin-auto">
		<tr class="height-150">
			<th colspan="2">
			<font size="20em">
			GMS
			</font>
			</th>		
		</tr>
		<tr class="height-400">
			<td>
			<img src="img/home/test.jpg" alt=""
			class="image-size"/>
			</td>
			<td>
			<ul>
				<li><a href="jsp/login/userLoginForm.jsp">사용자로그인</a></li>
				<li><a href="jsp/login/admin_login.jsp">관리자로그인</a></li>
				<li><%=c %></li>
			</ul>			
			</td>
		</tr>
		<tr class="height-150">
			<td colspan="2">
			<font size="10em">주소</font>			
			</td>			
		</tr>
	</table>


</body>
</html>
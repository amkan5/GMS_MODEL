<%@page import="repository.MemberDAOImpl"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" 
		import ="service.*"
		import ="domain.*"
%>
<!-- "oracle.jdbc.driver.OracleDriver"
"jdbc:oracle:thin:@localhost:1521:xe"
"KAN"
"1253" -->
<%
	String userid= request.getParameter("userid");
	String password = request.getParameter("password");
	MemberBean m = new MemberBean();
	m.setMemId(request.getParameter("userid"));
	m.setPassword(request.getParameter("password"));
	if(MemberServiceImpl.getInstance().loginB(m)){ //true이면
		%>
		<h3> 성공 </h3>
<%-- 		<h3> 사용자가 입력한 ID : <%= m.getMemId() %> </h3>
		 <h3>사용자가 입력한 Pass : <%= m.getPassword() %> </h3> --%>
		<%
		System.out.println(MemberDAOImpl.getInstance().login(m).toString());
	}else{
		%>
		 <h3> id나 비번이 틀립니다. </h3>
		<%
	} 
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>

</body>
</html>
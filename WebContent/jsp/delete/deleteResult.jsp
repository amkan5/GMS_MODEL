<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="service.MemberServiceImpl"%>
<%@ page import = "domain.*" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>deleteResult</title>
</head>
<body>
	<% MemberBean mem = new MemberBean(); 
	mem.setMemId(request.getParameter("userId"));
	mem.setPassword(request.getParameter("Pass"));
	MemberServiceImpl.getInstance().delteMember(mem);
%>
	<a href="../home/userLoginForm.jsp">로그인하러가기</a>
</body>
</html>
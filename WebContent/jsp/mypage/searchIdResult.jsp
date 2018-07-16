<%@page import="service.MemberServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "domain.*" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
	MemberBean m = MemberServiceImpl.getInstance().selectOne(
			request.getParameter("userid"));
%>
<h3>아이디 : <%= m.getMemId() %> </h3>
<h3>이름 : <%= m.getName() %> </h3>
<h3>나이 : <%= m.getAge() %> </h3>
<h3>팀: <%= m.getTeamId() %> </h3>

</body>
</html>
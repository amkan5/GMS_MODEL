<%@page import="service.ProjectTeamServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="service.MemberServiceImpl" %>
<%@ page import = "domain.*" %>
<%@ page import = "java.util.*" %>
<%! String team = ""; %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
List<MemberBean> lst = MemberServiceImpl.
getInstance().
selectSome(
		request.getParameter("teamid")
		);
%>
<table class = "tbl">
  <tr>
   <th>이름</th>
   <th>아이디</th>
   <th>팀아이디</th>
 <tr>
 <%
for(MemberBean m : lst){
	%>  <tr width=100px>
    <td > <%= m.getName() %></td>
    <td > <%= m.getMemId() %> </td>
    <td > <%= m.getTeamId() %> </td>
    </tr>
    <%			
	}
	%>
</body>
</html>
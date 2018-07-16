<%@page import="service.MemberServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "domain.*" %>

<!doctype html>
<html lang="en">
<head>
	<style> td{width:100px}
	</style>
	<meta charset="UTF-8" />
	<title>memberList</title>
</head>
<body>
	<%
	List<MemberBean> lst = MemberServiceImpl
	.getInstance()
	.list();

%>
<table class = "tbl">
  <tr>
   <th>이름</th>
   <th>아이디</th>
   <th>팀아이디</th>
 <tr>
 <%
for(int i=0;i<lst.size();i++){
	%>  <tr width=100px>
    <td > <%= lst.get(i).getName() %></td>
    <td > <%= lst.get(i).getMemId() %> </td>
    <td > <%= lst.get(i).getTeamId() %> </td>
    </tr>
    <%			
	}
	%>
</table>
</body>
</html>


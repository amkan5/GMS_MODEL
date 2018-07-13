<%@page import="service.MemberServiceImpl"%>
<%@page import="service.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "domain.*" %>
   <% 
    MemberBean mem = new MemberBean();
    mem.setMemId(request.getParameter("userid"));
    mem.setPassword(request.getParameter("password"));
    mem.setName(request.getParameter("name"));
    mem.setSsn(request.getParameter("ssn")); 
    MemberServiceImpl.getInstance().createMember(mem);
   	%>
   	<button><a href="userLoginForm.jsp">로그인하러가기</a></button>
   	<%
    
   %>
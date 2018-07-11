<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>user-login</title>
</head>
<body>
	<div class="margin-200-auto text-align width-200 border">
	<h2 class="text-align">사용자 로그인</h2>	
		<form action="userLoginResult.jsp">
			ID <br>
			<input type="text" name="userid" value="ID입력"><br>
			Pass <br>
			<input type="text" name="password" value="비번입력" ><br>
			<input type="submit" value="제출">
		</form><br>
		<button><a href="../../main.jsp">돌아가기</a></button>
	</div>
</body>
</html>
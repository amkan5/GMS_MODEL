<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
</head>
<body>
	<div class="margin-200-auto text-align width-200 border">
	<h2 class="text-align">회원가입</h2>	
		<form action="joinResult.jsp">
			ID <br>
			<input type="text" name="userid" value="ID입력"><br>
			Pass <br>
			<input type="text" name="password" value="비번입력" ><br>
			이름 <br>
			<input type="text" name="name" value="" ><br>
			주민번호<br>
			<input type="text" name="ssn" value="" ><br>
			<input type="submit" value="제출">
		</form><br>
		<button><a href="../../main.jsp">돌아가기</a></button>
	</div>
</body>
</html>
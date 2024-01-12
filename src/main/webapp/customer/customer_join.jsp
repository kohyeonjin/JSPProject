<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center" class="div_center">
		<h3>회원가입 클론코딩</h3>
		<hr>
		<form action="joinForm.customer" method="post" name="reg_form">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="id" required pattern="[A-Za-z0-9]{5,}">
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="name" required>
					</td>
				</tr>
				<tr>
					<td>나이</td>
					<td>
						<input type="number" name="age" required>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" name="pw" required>
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="text" name="email" placeholder="ex) asdasd@naver.com" required>
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
						<input type="text" name="address">
					</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>
						<input type="text" name="phone" required>
					</td>
				</tr>
			</table>	
		<input type="submit" value="회원가입" class="btn btn-default">
		<input type="button" value="취소" class="btn btn-default" onclick="location.href ='/JSPProject/index.jsp'">  
		
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style>
	.div_center {
		margin-bottom: 20px;
		margin-top:20px;
		padding: 30px 15px;
		
	}
</style>


</head>
<body>
		
		<div align="center" class="div_center">
		<h3>US CVG*</h3>
		<hr>
		<p>
		${sessionScope.customerid } (${sessionScope.name })님 환영 합니다.
		</p>

		<a href="update.customer">[회원 정보 변경]</a>&nbsp;&nbsp;

		<a href="delete.customer">[회원 탈퇴]</a>
		</div>
		
		


</body>
</html>
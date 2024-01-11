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
	<form action="updateForm.customer" method="post" >
		<h3>회원정보 수정를 수정합니다</h3>
		<hr>
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="id" value="${requestScope.vo.getCustomerId() }" readonly>
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="name" value="${requestScope.vo.getName()}">
				</td>
				
			</tr>

			<tr>
				<td>이메일</td>
				<td>
					<input type="text" name="email" value="${requestScope.vo.getEmail()} " placeholder="ex) abc@def.com">
				</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>
					<input type="text" name="address" value="${requestScope.vo.getAddress()}" placeholder="ex) OO시 OO구">
				</td>
			</tr>
			<tr>
			
			
		</table>
		<br>
		
		<input type="submit" value="수정" class="btn btn-default" onclick="">&nbsp;&nbsp;
		<input type="button" value="취소" class="btn btn-default" onclick="">    
		
	</form>	
	</div>



	
</body>
</html>
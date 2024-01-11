<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<div align="center">
		<h2>현재 비밀번호를 입력하세요</h2>
		<hr>
	
		<Form action="deleteForm.customer" method="post">
			아이디:<input type="text" name="id">
			비밀번호:<input type="password" name="pw">
			<input type="submit" value="회원탈퇴" class="btn btn-default">
			
		</Form>
	</div>
		${msg}
		
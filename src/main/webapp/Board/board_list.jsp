<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container">
		<h3>후기 게시판</h3>

		<table class="table table-bordered" border="1">
			<thead>
				<tr>
					<th>글 번호</th>
					<th>작성자</th>
					<th>제목</th>
					<th>날짜</th>
				</tr>
			</thead>
			
				<c:forEach var="i" items="${list }">
				<tr>
					<td>${i.boardid }</td>
					<td>${i.boardcustomerid } </td>
					<td><a href="content.board?boardid=${i.boardid }">${i.boardtitle }</a></td>
					<td>${i.boarddate }</td>
				</tr>
				</c:forEach>
			<tbody>
			
			</tbody>
			
			<tbody>
				<tr>
					<td colspan="5" align="right">
						<form action="" class="form-inline" >
						  <div class="form-group">
							<input type="button" value="글 작성" class="btn btn-default" onclick="location.href='write.board';">
						  </div>
						</form> 
					</td>
				</tr>
			</tbody>
		
		</table>
	</div>


</body>
</html>



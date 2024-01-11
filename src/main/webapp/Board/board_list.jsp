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
		
		<a href="delete.board">삭제</a>
		
		<table class="table table-bordered" border="1">
			<thead>
			
				<tr>
					<th>글 번호</th>
					<th>작성자</th>
					<th>제목</th>
					<th>날짜</th>
					<th>삭제</th>
				</tr>
			</thead>
			
				<c:forEach var="i" items="${list }">
				<tr>
					<td>${i.boardid }</td>
					<td>${i.boardcustomerid }</td>
					<td>${i.boardtitle }</td>
					<td>${i.boarddate }</td>
					<td><a href="delete.board">삭제</a></td>
				</tr>
				</c:forEach>
			<tbody>
			
			</tbody>
			
			<tbody>
				<tr>
					<td colspan="5" align="right">
						<form action="" class="form-inline" >
						  <div class="form-group">
						    <input type="text" name="search" placeholder="제목검색" class="form-control" >
						  	<input type="submit" value="검색" class="btn btn-default">
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





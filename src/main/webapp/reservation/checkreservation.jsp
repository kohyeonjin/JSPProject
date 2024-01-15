<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div align="center">
		<h3>나의 예매내역</h3>
		<table border="1">
		<tr>
			<td>예매번호:</td>
			<td>${reservation.reservationId }</td>
		</tr>
		<tr>
			<td>예매날짜:</td>
			<td>${reservation.reservationdate }</td>
		</tr>
		<tr>
			<td>예매아이디:</td>
			<td>${reservation.res_cus_id }</td>
		</tr>
		<tr>
			<td>상영시간:</td>
			<td>
			<c:choose>
			<c:when test="${reservation.res_show_id eq 1}">
				서울의봄 10시30분~12시00분
			</c:when>
			<c:when test="${reservation.res_show_id eq 2}">
				서울의봄 13시30분~15시00분
			</c:when>
			<c:when test="${reservation.res_show_id eq 3}">
				서울의봄 18시00분~19시30분
			</c:when>
			<c:when test="${reservation.res_show_id eq 4}">
				노량 10시30분~12시00분
			</c:when>
			<c:when test="${reservation.res_show_id eq 5}">
				노량 13시30분~15시00분
			</c:when>
			<c:when test="${reservation.res_show_id eq 6}">
				노량 18시00분~19시30분
			</c:when>
			<c:when test="${reservation.res_show_id eq 7}">
				짱구는못말려 10시30분~12시00분
			</c:when>
			<c:when test="${reservation.res_show_id eq 8}">
				짱구는못말려 13시30분~15시00분
			</c:when>
			<c:when test="${reservation.res_show_id eq 9}">
				짱구는못말려 18시00분~19시30분
			</c:when>
			</c:choose>
			</td>
		</tr>
		<tr>
			<td>좌석:</td>
			<td>
			<c:forEach var="seat" items="${list }">
				${seat }
			</c:forEach>
			</td>
		</tr>
		<tr>
			<td></td>
			<td><a href="../index.jsp">홈으로</a>
		</tr>
		</table>
		</div>
	

</body>
</html>
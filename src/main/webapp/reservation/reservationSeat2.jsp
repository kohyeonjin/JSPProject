<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	ArrayList<String> list = new ArrayList<>();

	if(application.getAttribute("list2") != null){
		list = (ArrayList<String>)application.getAttribute("list2");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h3>좌석 예약</h3>
	<h4>좌석을 선택한 다음 예매 버튼을 누르세요</h4>
	<hr>
	<b>스크린</b><br>
	

	<form action="seatok2.reservation" name ="seat">
	<% for(char c = 'A'; c<='Z'; c++){%>
			<small><%=c %></small>
			&nbsp;
		<% }%>
		<br>
		
		<%for(int i=1; i<=6; i++){ %>
			<%=i %>
			<%for(char c='A'; c<='Z';c++){%>
				<input type="checkbox" name="seat" value="<%=i%>-<%=c%>" <%=list.contains(i+"-"+c) ? "disabled" : ""%>>
			<%} %>
		
		<br>
			<%if(i==3){ %>
				<br>
			<%} %>
		<%} %>
	<input type="hidden" name ="movie" value=${movie }>
	<input type="hidden" name ="time" value=${time }>
	<input type="submit" value="예매하기">
	<input type="button" onclick="location.href='../customer/customer_reservation.jsp';" value="취소하기">
	</form>
	
	
	</div>
	
	
</body>
</html>
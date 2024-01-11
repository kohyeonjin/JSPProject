<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	
	  	String [] arr = request.getParameterValues("seat");
	
		List<String> list9 = new ArrayList<>();
	
		if(application.getAttribute("list9") != null){
		list9 = (ArrayList)application.getAttribute("list9");
		}
		
		ArrayList<String> temp = new ArrayList<>();
    	
		for(String s : arr){
    		if(list9.contains(s)){
    			break;
    		}else {
    			temp.add(s);
    		}
    	}
		
    	if(temp.size() == arr.length){
    		list9.addAll(temp);
    	}
    	
    	
    	application.setAttribute("list9", list9);
%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h3> 예매성공</h3>
	
	<h5>예약한 좌석</h5>
	
	<%for(String s : arr){%>
		[<%=s %>]
	<%} %>

	<br>
	
	<a href="../index.jsp">홈으로</a>
	</div>
	
</body>
</html>
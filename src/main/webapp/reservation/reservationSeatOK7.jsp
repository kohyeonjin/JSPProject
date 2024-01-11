<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	
	  	String [] arr = request.getParameterValues("seat");
	
		List<String> list7 = new ArrayList<>();
	
		if(application.getAttribute("list7") != null){
		list7 = (ArrayList)application.getAttribute("list7");
		}
		
		ArrayList<String> temp = new ArrayList<>();
    	
		for(String s : arr){
    		if(list7.contains(s)){
    			break;
    		}else {
    			temp.add(s);
    		}
    	}
		
    	if(temp.size() == arr.length){
    		list7.addAll(temp);
    	}
    	
    	
    	application.setAttribute("list7", list7);
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 입력폼</title>
</head>
<body>
    <h2 align="center"><font color="red">US CVG*</font></h2>
    <table border="2" width=300 bordercolor="white" cellspacing="3"
        bordercolor="gray" align="center">
        <form action="loginForm.customer" method="post">
            
            <tr>
                <td align="center">아이디 </td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td align="center">비밀번호 </td>
                <td><input type="password" name="pass"></td>
            <tr>
                <td align="center" colspan=100><input type="submit" value="로그인" onclick=></td>
                   
                <tr>
                   
    </table>
    ${msg }
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<head>

    <meta charset="UTF-8" >
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <style>
        body{
            background-color: rgb(231, 231, 231);
           
        }
         .logo{
            opacity: 40%;
            position:absolute;
            right:50px;
            bottom:50px;
            width: 50%;  
        }
         .box{
            background-color: black;
            width: auto;
            height: 430px;
            padding:150px;
            padding-top:10px;
            margin:1px;
            border: 1px dashed #F59B7A;
            background-color:black; 
               
        }
        .container > li {
    /* border:1px solid yellow; */
    list-style:none;
    font-size: 10px;
   
    
}
a {
    text-decoration:none;
    color:white;
}
 .container{
    border-radius: 9px;
    background-color:black;
    display:flex;
    height:20px;
    justify-content: space-between;
    padding:12px 15px;
    position:static;
    border:black; 
 
    
}
    .container>li:hover{
    background-color: black;
    color: black;
    border-radius: 4px;
}
section>img{
    
    width:20%;
    height:15%;
}
section{
    width:auto; 
    
}
  .box2{
border-radius: 9px;
background-color: black;
opacity:80%;
border:1px dotted #99CEB5;
position:absolute;
width: 560px;
height:300px;
top: 126.5px;
left:240.5px;
bottom:50.5px;
right:40.5px;
display:flex;
padding:12px; 
} 
 input[type=button]{
    background-color:gray;
    border: black;
    color:white; 

}
 .preview{
    
    width:150%;
    height:20%;
    font-size: 13px;
    color:#99CEB5; 
}
.preview2{

 position:absolute;
top: 150.5px;
left:13.5px;
bottom:40.5px;
right:34.5px;
} 

    </style>
</head>
<body>
   <h2 style="text-align:center; font-size: 30px; color: red;">US CVG*</h2>
    <div class="box">
        <nav><!--의미(시맨틱)가 있는 태그-->
            <ul class="container">
             <a href="${pageContext.request.contextPath}/index.jsp">HOME</a> 
			<a href="${pageContext.request.contextPath}/customer/reservation.customer">예매</a>
			<a href= "${pageContext.request.contextPath}/customer/login.customer">로그인</a>
			<a href= "${pageContext.request.contextPath}/customer/join.customer">회원가입</a>
             
            </ul>
            </nav>
            
    </div>
   
   

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gym_management</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">
</head>
<body>
<nav>
		 <img id="logo" src="./assets/logo.jpg" alt="logo"/>
		 <ul>
		 <li><a href="${pageContext.request.contextPath}/userlogin">User Login </a></li>
		  <li><a href="${pageContext.request.contextPath}/adminlogin">Admin Login </a></li>
		  <li><a href="${pageContext.request.contextPath}/UserSubsController">Subscribe </a></li>	
		 		
		 </ul>
   </nav>
    
<div class="body1">
	
	<div class="image">
		<img src="./assests/gymscheme.png" alt="logo" width="900px" height="700px"/>
	</div>	
	<div class="buttons">
		<a href="${pageContext.request.contextPath}/AddUserController"><button class=button1 type="submit">Add user</button></a>
		<a href="${pageContext.request.contextPath}/DeleteUserController"><button class=button1 type="submit">Delete user</button></a>
		<a href="${pageContext.request.contextPath}/EditUserController"><button class=button1 type="submit">Edit user</button></a>
		<a href="${pageContext.request.contextPath}/allusers"><button class=button1 type="submit">View all the user</button></a>
		
	</div>
</div>
</body>
</html>
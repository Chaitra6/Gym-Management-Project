<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gym_management</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
</head>
<body>
<nav>
		 <img id="logo" src="./assets/logo.jpg" alt="logo"/>
		  <div class="heading">GYM-MANAGEMENT</div>
		 <ul>
		 <li><a href="${pageContext.request.contextPath}/userlogin">User Login </a></li>
		  <li><a href="${pageContext.request.contextPath}/adminlogin">Admin Login </a></li>
		
		 </ul>
   </nav>
<div class="body1">
	
		
	<div class="user">
		
	<div class="login-form">
	<div class="title">MEMBER SUBSCRIPTION FORM</div>
		<form action="${pageContext.request.contextPath }/UserSubsController" method="post">
			
			<input type="text" name="email" placeholder="EMAIL"id="email"><br>
			
			<input type="password" name="password" placeholder="PASSWORD" id="password"><br>
			<div class="password-hint">Must consist of atleast 8 characters, a symbol, an upper and a lowercase letter
            </div>
			
			<input type="text" name="price" placeholder="SUBSCRIPTION PRICE" id="price"><br>
		
			<input type="text" name="subscribed_date" placeholder="${subDate}" id="subscribed_date"><br>
		
			<input type="text" name="expdate" placeholder="SUBSCRIBE EXP DATE" id="expdate"><br>
			${message}
			<button class="button" type="submit">SUBSCRIBE</button>
		</form>
	</div>
	</div>
</div>
</body>
</html>
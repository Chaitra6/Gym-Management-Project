<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gym_Management</title>
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
	
	<div class="image">
		<img src="./assests/" alt="logo" width="700px" height="700px"/>
	</div>	
	<div class="user">
		Edit User
	<div class="login-form">
		<form action="${pageContext.request.contextPath }/" method="post">
			
			<input type="text" name="userId" placeholder="USER-ID"id="userId"><br>
			
			<input type="number" name="price"placeholder="SUBSCRIPTION PRICE" id="subscription_price"><br>
			
			<input type="date" name="subdate" placeholder="SUBSCRIBTION DATE" id="subdate">${subDate}<br>
				
			<input type="date" name="expdate" placeholder="SUBSCRIBE EXP DATE" id="expdate"><br>
			<button class="button" type="submit">EDIT</button>
		</form>
	</div>
	</div>
</div>

</body>
</html>
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
		 <ul>
		 <li><a href="${pageContext.request.contextPath}/userlogin">User Login </a></li>
		  <li><a href="${pageContext.request.contextPath}/adminlogin">Admin Login </a></li>
		
		 </ul>
   </nav>
<div class="body1">
	
	<div class="image">
		<img src="./assests/gym.jpg" alt="logo" width="700px" height="700px"/>
	</div>	
	<div class="user">
		User_Subscription Form
	<div class="login-form">
		<form action="${pageContext.request.contextPath }/UserSubsController" method="post">
			
			<input type="text" name="email" placeholder="EMAIL"id="email"><br>
			
			<input type="password" name="password" placeholder="PASSWORD" id="Passsword"><br>
			<div class="password-hint">Must consist of atleast 8 characters, a symbol, an upper and a lowercase letter
            </div>
			
			<input type="subscription_price" name="subPrice"placeholder="SUBSCRIPTION PRICE" id="subscription_price"><br>
		
			<input type="subscribed_date" name="subscribed_date" id="subscribed_date">${subDate}<br>
		
			<input type="subscribe_exp_date" name="expdate" placeholder="SUBSCRIBE EXP DATE" id="subscribe_exp_date"><br>
			${message}
			<button class="button" type="submit">SUBSCRIBE</button>
		</form>
	</div>
	</div>
</div>
</body>
</html>
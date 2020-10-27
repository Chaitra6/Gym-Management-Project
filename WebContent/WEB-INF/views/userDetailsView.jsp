<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		 <li><a href="${pageContext.request.contextPath}/signup">Sign Up </a></li>		
		 </ul>
   </nav>
   
    <div class="title">Gym-Member-Details</div>
   
   
	
	<table style="width:100%">
	 <tr>
	    <th>Member-ID</th>
	    <th>Member-Email</th>
	    <th>Subscription-Price</th>
	    <th>Subs-Date</th>
	    <th>Subs-Exp-Date</th>
	  </tr>
	  <tr var="user" items="${userDetails}>
	    <td><c:out value="${user.getUserId()}"  /></td>
	    <td><c:out value="${user.getEmail()}"  /></td>
	    <td><c:out value="${user.getPrice()}"  /></td>
	    <td><c:out value="${user.getSubs_date()}"  /></td>
	    <td><c:out value="${user.getSubs_exp_date()}"  /></td>   
	  </tr> 	  
	</table> 


</body>
</html>
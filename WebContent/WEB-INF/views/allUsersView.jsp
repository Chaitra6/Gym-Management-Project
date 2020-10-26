<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gym-Management</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
</head>
<body >
	<nav>
		 <img id="logo" src="./assets/logo.jpg" alt="logo"/>
		 <ul>
		 <li><a href="${pageContext.request.contextPath}/adminCRUDView">BACK</a></li>
		 <li><a href="${pageContext.request.contextPath}/userlogin">User Login </a></li>
		  <li><a href="${pageContext.request.contextPath}/adminlogin">Admin Login </a></li>
		 <li><a href="${pageContext.request.contextPath}/UserSubsController">Subscribe </a></li>		
		 </ul>
   </nav>
   
   <div class="title">Gym-Members-List</div>
   
   <div class="body-div2">
	
	<table style="width:100%">
	 <tr>
	    <th>Member-ID</th>
	    <th>Member-Email</th>
	    <th>Subscription-Price</th>
	    <th>Subs-Date</th>
	    <th>Subs-Exp-Date</th>
	  </tr>
	 <c:forEach var="user" items="${listUser}"> 
	  <tr>
	    <td><c:out value="${user.getUserId()}"  /></td>
	    <td><c:out value="${user.getEmail()}"  /></td>
	    <td><c:out value="${user.getPrice()}"  /></td>
	    <td><c:out value="${user.getSubs_date()}"  /></td>
	    <td><c:out value="${user.getSubs_exp_date()}"  /></td>   
	  </tr>
	 </c:forEach> 	  
	</table> 


	</div>
</body>
</html>



















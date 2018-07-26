<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des Clients</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Gym Workout Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
<link type="text/css" rel="stylesheet" href="css/cm-overlay.css" /><!-- //overlay-->
<link rel="stylesheet" href="css/owl.carousel.css" type="text/css" media="all"/> <!-- Owl-Carousel-CSS -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--fonts-->
<link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,900" rel="stylesheet">
<!--//fonts-->
</head>
<body>
<form action="client" method="Post">
<div class="modal-body login-page "> 
<div class="login-top sign-top">

<div class="agileits-login">

<div class="wthree-text">
<div>Ajouter
		
		<input type="text" name="nom" placeholder="nom" />
		<input type="text" name="add" placeholder="add" />
		<input type="text" name="tel" placeholder="tel" />
		<input type="submit" value="Ajouter" name="action"> </div> <br>
		<div>Supprimer
		<input type="text" name="Code Client" placeholder="Code Client" />
		<input type="submit" value="Supprimer" name="action"></div> <br>
		
		<br>
		<div>Afficher Tout 
		<input type="submit" value="Afficher" name="action">
		<br><br>
		<table border="1" style="width:100%">
  <tr>
    <th style="color:white ; align=center">Code Client</th>
    <th style="color:white ; align=center">Nom</th> 
    <th style="color:white ; align=center">Addresse</th>
    <th style="color:white ; align=center">Num tel</th>
    
  </tr>
  <c:forEach items="${clients}" var="c">
  <tr>
    <td style="color:white ; align=center">${c.id}</td>
    <td style="color:white ; align=center">${c.nom}</td>
    <td style="color:white ; align=center">${c.address}</td> 
    <td style="color:white ; align=center">${c.tel}</td> 
   
    
   
  </tr>
  
  </c:forEach>
 </table> </div>		
</div>
</div>
</div>
		
		
</div>	
</form>
</body>
</html>
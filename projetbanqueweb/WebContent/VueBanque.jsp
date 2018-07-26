<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des Comptes</title>
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
<form action="controleur" method="Post">
<div class="modal-body login-page "> 
<div class="login-top sign-top">

<div class="agileits-login">

<div class="wthree-text">
<div>Ajouter
		
		<input type="text" name="Solde" placeholder="Solde" />
		<input type="submit" value="Ajouter" name="action"> </div> <br>
		<div>Consulter/Supprimer
		<input type="text" name="Code Compte" placeholder="Code Compte" />
		<input type="submit" value="Supprimer" name="action"></div> <br>
		<div>Transaction
		<input type="text" name="Num Compte" placeholder="Num Compte" />
		<input type="text" name="Montant" placeholder="Montant" />
		<input type="submit" value="Verser" name="action"> 
		<input type="submit" value="Retirer" name="action">  </div>
		<div>Transferer
		<input type="text" name="Num Compte expediteur" placeholder="Num Compte expediteur" />
		<input type="text" name="Num Compte emmeteur" placeholder="Num Compte emmeteur" />
		<input type="text" name="montant à transferer" placeholder="montant à transferer" />
		<input type="submit" value="transferer" name="action"> 
		  </div>
		<br>
		<div>Afficher Tout 
		<input type="submit" value="Afficher" name="action">
		<br><br>
		<table border="1" style="width:100%">
  <tr>
    <th style="color:white ; align=center">Code Compte</th>
    <th style="color:white ; align=center">Date Creation</th> 
    <th style="color:white ; align=center">Solde</th>
    
  </tr>
  <c:forEach items="${comptes}" var="c">
  <tr>
    <td style="color:white ; align=center">${c.code}</td>
    <td style="color:white ; align=center">${c.datecreat}</td>
    <td style="color:white ; align=center">${c.solde}</td> 
    
   
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
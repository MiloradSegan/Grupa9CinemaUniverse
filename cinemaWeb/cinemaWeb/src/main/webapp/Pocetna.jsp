<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pocetna</title>
</head>
<body BACKGROUND="bg2.jpg"></body>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: ;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #CCCCCC;
}

.active {
    background-color: #4CAF50;
}
</style>
<body>
<ul>
  <li><a class="active">Home</a></li>
  <li><a href="logIn.jsp">LogIn</a></li>
  <li><a href="registracijaKorisnika.jsp">Registracija</a></li>
  <li><a href="<c:url value="/prikazRepertoaraGost"></c:url>">Guest login</a></li>
</ul>
</body>

<body>
	<font size="5" color="white">OVDE TREBA REPERTOAR NAJGLEDANIJI</font>
</body>
</html>
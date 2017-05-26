<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body BACKGROUND="bg2.jpg"/>
<style>
table {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    
}

td {
    float: center;
}

td a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

td a:hover:not(.active) {
    background-color: #CCCCCC;
}

.active {
    background-color: #4CAF50;
}
</style>
<body>
<table>
  <tr><td><a class="active">Korisnik panel</a></td></tr>
  <tr><td><a href="prikazSale.jsp">Pretraga po sali</a></td></tr>
  <tr><td><a href=brMesta.jsp">Pretraga po mestima</a></td></tr>
  <tr><td><a href="pretragaPoDatumu.jsp">Pretraga po datumu</a></td></tr>
  <tr><td><a href="pretragaTip.jsp">Pretraga po tipu</a></td></tr>
  <tr><td><a href="pretraga.jsp">Pretraga po nazivu</a></td></tr>
  <tr><td><a href="prikazVremena.jsp">Pretraga po vremenu</a></td></tr>
  <tr><td><a href="prikazZanra.jsp">Pretraga po zanru</a></td></tr>
  <tr><td><a href="prodajaKarte.jsp">Prodaja karte</a></td></tr>  
  <tr><td><a href="<c:url value="/logOutServlet"></c:url>">Log out</a></td></tr>
   
</table>
</html>
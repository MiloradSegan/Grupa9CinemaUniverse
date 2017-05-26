<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pretraga Naziv</title>
</head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
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
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
<body>
<ul>
  <li><a href="Pocetna.jsp">Pocetna</a></li>
  <li><a class="active" href="#pretraga">Pretraga</a></li>
  <li><a href="prikaziRepertoara.jsp">Rezervacija</a></li>
  
</ul>
</body>
<body BACKGROUND="bg2.jpg"></body>
<body>
	<form method="get" action="/cinemaWeb/pretragaTipS">
	<th><p><font size="5" color="white">Pretraga repertoara po tipu: </font></p></th> <input type="text" name="tip">
	<input type="submit" value="pretrazi"> 	
	<center><table border="5" cellpadding="5">
	 <thead>
	  <td><font size="5" color="white"> Film</font> </td> 
	  <td><font size="5" color="white"> Dan</font> </td> 
	  <td><font size="5" color="white"> Sala</font> </td>
	  <td><font size="5" color="white"> Tip projekcije </font> </td>
	 </thead>			
	<c:if test="${!empty rep}">	
		<c:forEach items="${rep}" var="r">		
			<tr>
			 <td><font size="4" color="white"><c:out value="${r.film9.naziv}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.dan}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.sala}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.tipprojekcije}" ></font></c:out></td>
			</tr>
		</c:forEach>		
	</c:if>
	</table></center>
</form>
</body>
</html>
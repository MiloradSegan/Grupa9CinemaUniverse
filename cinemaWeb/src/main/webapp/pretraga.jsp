<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pretraga Naziv</title>
</head>
<body BACKGROUND="bg2.jpg"/>
<style>
input[type=button], input[type=submit], input[type=reset] {
    background-color: #CC0000;
    border: none;
    color: white;
    padding: 8px 16px;
    text-decoration: blink;
    margin: 4px 2px;
    cursor: pointer;
}
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
  <li><a href="radnikPanel.jsp">Korisnik pocetna</a></li>
  <li><a href="prikazSale.jsp">Pretraga po sali</a></li>
  <li><a href=brMesta.jsp">Pretraga po mestima</a></li>
  <li><a href="pretragaPoDatumu.jsp">Pretraga po datumu</a></li>
  <li><a href="pretragaTip.jsp">Pretraga po tipu</a></li>
  <li><a class="active" href="pretraga.jsp">Pretraga po nazivu</a></li>
  <li><a href="prikazVremena.jsp">Pretraga po vremenu</a></li>
  <li><a href="prikazZanra.jsp">Pretraga po zanru</a></li>
  <li><a href="prodajaKarte.jsp">Prodaja karte</a></li>
   
</ul>

<body>
	<form method="get" action="/cinemaWeb/pretragaNazivServlet">
	
	<font size="5" color="white">Unesite naziv filma:</font> <input type="text" name="naziv" ><input type="submit" value="pretrazi"> 
	<center><table style="width:100%" border="5" cellpadding="5">
	<caption><font size="5" color="white">Pretrega filma po nazivu: </font><caption>
	 <thead>
	  <td><font size="5" color="white"> Naziv</font> </td>
	  <td><font size="5" color="white"> Trailer</font> </td>
	  <td><font size="5" color="white"> Opis filma </font> </td>
	  <td><font size="5" color="white"> Zanr</font> </td>
	  <td><font size="5" color="white"> Glumci</font> </td>
	  <td><font size="5" color="white"> Slika</font> </td>
	  <td><font size="5" color="white"> Reditelj</font> </td>
	 </thead>			
	<c:if test="${!empty rep}">	
		<c:forEach items="${rep}" var="r">		
			<tr>
			 <td><font size="4" color="white"><c:out value="${r.naziv}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.trailer}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.opis}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.zanr}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.glumci}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.slika}" ></font></c:out></td>
			 <td><font size="4" color="white"><c:out value="${r.reditelj}" ></font></c:out></td>
			</tr>
		</c:forEach>		
	</c:if>
	</table></center>
</form>

</body>
</html>
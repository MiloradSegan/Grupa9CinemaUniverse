<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
  <li><a href="brMesta.jsp">Pretraga po mestima</a></li>
  <li><a class="active" href="pretragaPoDatumu.jsp">Pretraga po datumu</a></li>
  <li><a href="pretragaTip.jsp">Pretraga po tipu</a></li>
  <li><a href="pretraga.jsp">Pretraga po nazivu</a></li>
  <li><a href="prikazVremena.jsp">Pretraga po vremenu</a></li>
  <li><a href="prikazZanra.jsp">Pretraga po zanru</a></li>
  <li><a href="prodajaKarte.jsp">Prodaja karte</a></li>
   
</ul>
<body>
<form method="get" action="/cinemaWeb/pretragaDatumaServlet">
<font size="5" color="white">Unesite datum od:</font><input type="text" name="dat">
<font size="5" color="white">Unesite datum do:</font><input type="text" name="datum">
<input type="submit" value="pretrazi">
<center><table style="width:100%" border="5" cellpadding="5">
	<caption><font size="5" color="white">Projekcije u odabranom periodu</font></caption>
            <tr>
                    <th><font size="5" color="white">Naziv filma</font></th>
                    <th><font size="5" color="white">Tip projekcije</font></th>
                    <th><font size="5" color="white">Datum proekcije</font></th>
                    <th><font size="5" color="white">Vreme</font></th>
                    <th><font size="5" color="white">Sala</font></th>
                    <th><font size="5" color="white">Br mesta </font></th>
                    <th><font size="5" color="white">Cena karte</font></th>
                </tr>
            <c:forEach items="${rep}" var="p">
            
            <tr>		
				<td><font size="5" color="white"><c:out value="${p.film9.naziv}" /></font></td>
	  		  	<td><font size="5" color="white"><c:out value="${p.tipprojekcije}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.datumpro}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.vreme}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.sala}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.mesta}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.cena}" /></font></td>
			</tr>
			</c:forEach>
</table></center>
</form>
</body>
</html>
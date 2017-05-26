<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <li><a href="pretragaPoDatumu.jsp">Pretraga po datumu</a></li>
  <li><a href="pretragaTip.jsp">Pretraga po tipu</a></li>
  <li><a href="pretraga.jsp">Pretraga po nazivu</a></li>
  <li><a href="prikazVremena.jsp">Pretraga po vremenu</a></li>
  <li><a href="prikazZanra.jsp">Pretraga po zanru</a></li>
  <li><a class="active" href="prodajaKarte.jsp">Prodaja karte</a></li>
   
</ul>
<body>
	<form action="/cinemaWeb/prodajaKarteServlet" method="get">
	
	
	<table style="width:100%" border="5" cellpadding="5">
 	<caption><font size="5" color="white">Sve projekcije</font></caption>
	<thead>
                <tr>
                    <th><font size="5" color="white">Naziv filma</font></th>
                    <th><font size="5" color="white">Tip projekcije</font></th>
                    <th><font size="5" color="white">Datum proekcije</font></th>
                    <th><font size="5" color="white">Vreme proekcije</font></th>
                    <th><font size="5" color="white">Sala</font></th>
                    <th><font size="5" color="white">Br mesta </font></th>
                    <th><font size="5" color="white">Cena karte</font></th>
                </tr>      
         </thead>
         <tbody>
	<c:forEach items="${rep}" var="s" >
	    
	    <tr>
	    <td><font size="5" color="white"><c:out value="${s.film9.naziv}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.tipprojekcije}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.datumpro}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.vreme}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.sala}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.mesta}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.cena}" /></font></td>
	    <td><a href="<c:url value="/prodajKartu">
	    <c:param name="id" value="${s.idrep}"/>
	    </c:url>">Prodaja</a></td>
		</tr>
	
	</c:forEach>
	
	</tbody>
</table>	
	<input type="submit" value="pretrazi">
	</form>
</body>


</html>
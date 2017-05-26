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
   <li><a href="korisnikPocetna.jsp">Korisnik pocetna</a></li>
   <li><a href="<c:url value="/prikazRepertoara"></c:url>">Prikaz svih projekcija</a></li>
   <li><a href="prikazfilmova.jsp">Komentarisi film</a></li>
  <li><a class="active">Pregled rezervacija</a><li>
  
</ul>
</body>
<body>
<form action="/cinemaWeb/pregledRezervacija" method="get">
	
	
	<table style="width:100%" border="5" cellpadding="5">
  <caption><font size="5" color="white">Pregled rezervacija</font></caption>
	<thead>
                <tr>
                    <th><font size="5" color="white">Naziv filma</font></th>
                    <th><font size="5" color="white">Datum proekcije</font></th>
                    <th><font size="5" color="white">Vreme proekcije</font></th>
                    <th><font size="5" color="white">Sala</font></th>
                    <th><font size="5" color="white">Br mesta</font></th>
                </tr>          
         </thead>
         <tbody>
	<c:forEach items="${rez}" var="r" >
	    <tr>
	    <td><font size="5" color="white"><c:out value="${r.repertoar9.film9.naziv}" /></font></a></td>
	    <td><font size="5" color="white"><c:out value="${r.repertoar9.datumpro}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${r.repertoar9.vreme}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${r.repertoar9.sala}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${r.mestarez}" /></font></td>
		</tr>
	
	</c:forEach>
	
	</tbody>
</table>	
	
	</form>
</body>
</html>
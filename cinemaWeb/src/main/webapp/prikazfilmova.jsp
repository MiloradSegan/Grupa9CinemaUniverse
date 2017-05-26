<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     <jsp:useBean id="now" class="java.util.Date" />
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:useBean id="filmoviBean" class="beans.sviFilmoviBean" scope="session"/>
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
  <li><a class="active">Komentarisi film</a></li>
  <li><a href="<c:url value="/pregledRezervacija"></c:url>">Pregled rezervacija</a><li>
  
</ul>
</body>
<body>

<form action="\cinemaWeb\sacuvajKomentarServlet" method="post">
<table>
    <tr>
    <td><font size="5" color="white"> Odaberite film:</font></td>
    <td>
	<select name="nazivi" style="width: 150px;">
	        <option></option>
			<c:forEach var="izd" items="${filmoviBean.nazivi}" >
				<option>${izd}</option>		
			</c:forEach>			
	</select>
	</td>
    </tr>
    <tr>
    <td><font size="5" color="white"> Vas komentar:</font></td>
<td> <input type="text" name="komentar" ></td>
</tr>
</table>
<input type="submit" value="Sacuvaj komentar">
</form>
<font size="5" color="white">${poruka}</font>
</body>
</html>
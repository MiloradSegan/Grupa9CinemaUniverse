<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/cinemaWeb/prikazRepertoara" method="get">
	
	
	<table style="width:100%">
  <caption>Sve projekcije</caption>
	<thead>
                <tr>
                    <th>Naziv filma</th>
                    <th>Tip projekcije</th>
                    <th>Datum proekcije</th>
                    <th>Vreme proekcije</th>
                    <th>Sala</th>
                    <th>Broj mesta</th>
                    <th>Cena karte</th>
                </tr>
                
                    
                
         </thead>
         <tbody>
	<c:forEach items="${rep}" var="s" >
	
	    <tr>
	    <td>
	    <a href="<c:url value="/prikazDetaljaFilma">
	    <c:param name="idfil" value="${s.film9.idfil}"/>
	    </c:url>"><c:out value="${s.film9.naziv}" /></a></td>
	    <td><c:out value="${s.tipprojekcije}" /></td>
	    <td><c:out value="${s.datumpro}" /></td>
	    <td><c:out value="${s.vreme}" /></td>
	    <td><c:out value="${s.sala}" /></td>
	    <td><c:out value="${s.mesta}" /></td>
	    <td><c:out value="${s.cena}" /></td>
		</tr>
	
	</c:forEach>
	
	</tbody>
</table>	
	<input type="submit" value="Prikazi">
	</form>
</body>

</html>
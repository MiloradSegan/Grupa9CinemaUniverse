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
<body>
<form action="/cinemaWeb/prikazRepertoaraGost" method="get">
	
	
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
                    <th><font size="5" color="white">Ocena</font></th>
                </tr>      
                                
         	</thead>
         <tbody>
	<c:forEach items="${rep}" var="s" >
	    <tr>
	    <td>
	    
	    <a href="<c:url value="/prikazDetaljaServlet">
	    <font size="5" color="white"><c:param name="idfil" value="${s.film9.idfil}"/></font>
	    </c:url>"><font size="5" color="white"><c:out value="${s.film9.naziv}" /></font></a></td>
	    <td><font size="5" color="white"><c:out value="${s.tipprojekcije}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.datumpro}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.vreme}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.sala}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.mesta}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.cena}" /></font></td>
	    <td><font size="5" color="white"><c:out value="${s.film9.ocena}" /></font></td>
		</tr>
	    
	
	</c:forEach>
	 
	</tbody>
</table>	
	
	</form>
	</body>

</html>
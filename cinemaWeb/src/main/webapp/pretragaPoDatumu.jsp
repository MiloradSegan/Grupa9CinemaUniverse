<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/cinemaWeb/pretragaPoDatumuServlet">
Unesite datum od:<input type="text" name="dat">
Unesite datum do:<input type="text" name="datum">
<input type="submit" value="pretrazi">
<center><table>
<caption>Projekcije u odabranom periodu</caption>
            <tr>
                    <th>Naziv filma</th>
                    <th>Tip projekcije</th>
                    <th>Datum proekcije</th>
                    <th>Vreme</th>
                    <th>Sala</th>
                    <th>Br mesta </th>
                    <th>Cena karte</th>
                </tr>
            <c:forEach items="${rep}" var="p">
            
            <tr>		
			<td><c:out value="${p.film9.naziv}" /></td>
	    <td><c:out value="${p.tipprojekcije}" /></td>
	    <td><c:out value="${p.datumpro}" /></td>
	    <td><c:out value="${p.vreme}" /></td>
	    <td><c:out value="${p.sala}" /></td>
	    <td><c:out value="${p.mesta}" /></td>
	    <td><c:out value="${p.cena}" /></td>
		</tr>
</c:forEach>
</table></center>
</form>
</body>
</html>
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
<form method="get" action="/cinemaWeb/brMestaServlet">
Unesite broj karata: <input type="text" name="br"><input type="submit" value="pretrazi">
<center><table>
            <c:forEach items="${rep}" var="b">
            <caption>Projekcije sa dovoljno slobodnih mesta</caption>
            <tr>
                    <th>Naziv filma</th>
                    <th>Tip projekcije</th>
                    <th>Datum proekcije</th>
                    <th>Vreme proekcije</th>
                    <th>Sala</th>
                    <th>Br mesta </th>
                    <th>Cena karte</th>
                </tr>
            <tr>		
			<td><c:out value="${b.film9.naziv}" /></td>
	    <td><c:out value="${b.tipprojekcije}" /></td>
	    <td><c:out value="${b.datumpro}" /></td>
	    <td><c:out value="${b.vreme}" /></td>
	    <td><c:out value="${b.sala}" /></td>
	    <td><c:out value="${b.mesta}" /></td>
	    <td><c:out value="${b.cena}" /></td>
		</tr>
</c:forEach>
</table></center>
	</form>
</body>
</html>
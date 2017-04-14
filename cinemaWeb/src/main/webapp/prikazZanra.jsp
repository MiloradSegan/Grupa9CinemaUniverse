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
<form method="get" action="/cinemaWeb/prikazZanraServlet">
Unesite zanr filma: <input type="text" name="zanr"><input type="submit" value="pretrazi">
<center><table>

<caption>Projekcije za odabrani zanr</caption>
            <tr>
                    <th>Naziv filma</th>
                    <th>Tip projekcije</th>
                    <th>Datum proekcije</th>
                    <th>Vreme proekcije</th>
                    <th>Sala</th>
                    <th>Br mesta </th>
                    <th>Cena karte</th>
                </tr>

            <c:forEach items="${rep}" var="z">
            
            <tr>		
			<td><c:out value="${z.film9.naziv}" /></td>
	    <td><c:out value="${z.tipprojekcije}" /></td>
	    <td><c:out value="${z.datumpro}" /></td>
	    <td><c:out value="${z.vreme}" /></td>
	    <td><c:out value="${z.sala}" /></td>
	    <td><c:out value="${z.mesta}" /></td>
	    <td><c:out value="${z.cena}" /></td>
		</tr>
</c:forEach>
</table></center>
	</form>
</body>
</html>
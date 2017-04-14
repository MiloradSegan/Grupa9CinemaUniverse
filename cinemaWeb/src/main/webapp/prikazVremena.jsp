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
<form method="get" action="/cinemaWeb/prikazVremenaServlet">
Unesite vreme projekcije: <input type="text" name="vreme"><input type="submit" value="pretrazi">
<center><table>



            <c:forEach items="${rep}" var="v">
            <caption>Projekcije za odabrano vreme</caption>
            <tr>
                    <th>Naziv filma</th>
                    <th>Tip projekcije</th>
                    <th>Datum proekcije</th>
                    <th>Sala</th>
                    <th>Br mesta </th>
                    <th>Cena karte</th>
                </tr>
            <tr>		
			<td><c:out value="${v.film9.naziv}" /></td>
	    <td><c:out value="${v.tipprojekcije}" /></td>
	    <td><c:out value="${v.datumpro}" /></td>
	    <td><c:out value="${v.sala}" /></td>
	    <td><c:out value="${v.mesta}" /></td>
	    <td><c:out value="${v.cena}" /></td>
		</tr>
</c:forEach>
</table></center>
	</form>
</body>
</html>
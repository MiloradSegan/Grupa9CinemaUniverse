<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<form method="get" action="/cinemaWeb/prikazSale">
Unesite salu: <input type="text" name="sa"><input type="submit" value="pretrazi">
<center><table>



            <c:forEach items="${sale}" var="s">
            <caption>Projekcije za odabranu salu</caption>
            <tr>
                    <th>Naziv filma</th>
                    <th>Tip projekcije</th>
                    <th>Datum proekcije</th>
                    <th>Vreme proekcije</th>
                    <th>Br mesta </th>
                    <th>Cena karte</th>
                </tr>
            <tr>		
			<td><c:out value="${s.film9.naziv}" /></td>
	    <td><c:out value="${s.tipprojekcije}" /></td>
	    <td><c:out value="${s.datumpro}" /></td>
	    <td><c:out value="${s.vreme}" /></td>
	    <td><c:out value="${s.mesta}" /></td>
	    <td><c:out value="${s.cena}" /></td>
		</tr>
</c:forEach>
</table></center>
	</form>
</body>
</html>
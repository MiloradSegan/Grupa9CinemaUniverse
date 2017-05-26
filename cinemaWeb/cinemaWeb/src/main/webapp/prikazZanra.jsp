<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body BACKGROUND="bg2.jpg"/>
<body>
<form method="get" action="/cinemaWeb/pretragaZanraServlet">
<font size="5" color="white">Unesite zanr filma:</font> <input type="text" name="zanr"><input type="submit" value="pretrazi">
<center><table style="width:100%" border="5" cellpadding="5">

		<caption><font size="5" color="white">Projekcije za odabrani zanr</font></caption>
            <tr>
                    <th><font size="5" color="white">Naziv filma</font></th>
                    <th><font size="5" color="white">Tip projekcije</font></th>
                    <th><font size="5" color="white">Datum proekcije</font></th>
                    <th><font size="5" color="white">Vreme proekcije</font></th>
                    <th><font size="5" color="white">Sala</font></th>
                    <th><font size="5" color="white">Br mesta</font> </th>
                    <th><font size="5" color="white">Cena karte</font></th>
                </tr>

            <c:forEach items="${rep}" var="z">
            
            <tr>		
			<td><font size="5" color="white"><c:out value="${z.film9.naziv}" /></font></td>
	    	<td><font size="5" color="white"><c:out value="${z.tipprojekcije}" /></font></td>
	    	<td><font size="5" color="white"><c:out value="${z.datumpro}" /></font></td>
	    	<td><font size="5" color="white"><c:out value="${z.vreme}" /></font></td>
	    	<td><font size="5" color="white"><c:out value="${z.sala}" /></font></td>
	    	<td><font size="5" color="white"><c:out value="${z.mesta}" /></font></td>
	    	<td><font size="5" color="white"><c:out value="${z.cena}" /></font></td>
		</tr>
</c:forEach>
</table></center>
	</form>
</body>
</html>
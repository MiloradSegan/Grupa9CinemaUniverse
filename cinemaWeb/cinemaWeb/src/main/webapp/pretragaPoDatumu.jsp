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
<form method="get" action="/cinemaWeb/pretragaDatumaServlet">
<font size="5" color="white">Unesite datum od:</font><input type="text" name="dat">
<font size="5" color="white">Unesite datum do:</font><input type="text" name="datum">
<input type="submit" value="pretrazi">
<center><table style="width:100%" border="5" cellpadding="5">
	<caption><font size="5" color="white">Projekcije u odabranom periodu</font></caption>
            <tr>
                    <th><font size="5" color="white">Naziv filma</font></th>
                    <th><font size="5" color="white">Tip projekcije</font></th>
                    <th><font size="5" color="white">Datum proekcije</font></th>
                    <th><font size="5" color="white">Vreme</font></th>
                    <th><font size="5" color="white">Sala</font></th>
                    <th><font size="5" color="white">Br mesta </font></th>
                    <th><font size="5" color="white">Cena karte</font></th>
                </tr>
            <c:forEach items="${rep}" var="p">
            
            <tr>		
				<td><font size="5" color="white"><c:out value="${p.film9.naziv}" /></font></td>
	  		  	<td><font size="5" color="white"><c:out value="${p.tipprojekcije}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.datumpro}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.vreme}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.sala}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.mesta}" /></font></td>
	    		<td><font size="5" color="white"><c:out value="${p.cena}" /></font></td>
			</tr>
			</c:forEach>
</table></center>
</form>
</body>
</html>
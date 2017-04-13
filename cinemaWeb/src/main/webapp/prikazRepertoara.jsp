<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Repertoar</title>
</head>
<body BACKGROUND="bg2.jpg"/>
<body>
	<form method="get" action="/cinemaWeb/prikazRepertoar2" >
	<th><p><font size="7" color="white">Najaktuelniji repertoar</font></p></th>
	<input type="submit" value="Prikazi">
	<center><table> 
     <tbody>
         <thead><td><font size="5" color="white">Film  </font></td><td><font size="5" color="white">Dan projekcije  </font></td><td><font size="5" color="white">Sala  </font></td><td><font size="5" color="white">Mesta  </font></td><td><font size="5" color="white">Cena  </font><td><font size="5" color="white">Tip  </font></td></td></thead>
	   <c:forEach items="${rep}" var="s" >
		 <tr><td><font size="4" color="white"><c:out value="${s.film9.naziv}" ></font></c:out></td>  <td><font size="4" color="white"><c:out value="${s.dan}"></c:out></font></td> <td><font size="4" color="white"><c:out value="${s.sala}"></c:out></font></td> <td><font size="4" color="white"><c:out value="${s.mesta}"></c:out></font></td> <td><font size="4" color="white"><c:out value="${s.cena}"></c:out></font></td> <td><font size="4" color="white"><c:out value="${s.tipprojekcije}"></c:out></font></td></tr>
	  </c:forEach>
	 </tbody>
</table></center>
	
	</form>
</body>

</html>
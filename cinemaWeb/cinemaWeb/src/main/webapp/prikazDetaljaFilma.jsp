<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="jquery.rating.css">
        <script src="jquery.js"></script>
        <script src="jquery.rating.js"></script>
</head>
<body BACKGROUND="bg2.jpg"/>

<body>
 <center><table border="5" cellpadding="5">
  <caption><font size="5" color="white">Detalji filma</font></caption>
              
		<tr>
		   <th><font size="5" color="white">Glumci filma</font></th>
			<td><font size="5" color="white">${f.glumci}</font></td>
	    </tr>
	    <tr>
	    <th><font size="5" color="white">Opis</font></th>		
			<td><font size="5" color="white">${f.opis}</font></td>
		</tr>
		<tr>
		<th><font size="5" color="white">Komentari</font></th>	
			<td><c:forEach items="${kom}" var="k" >
			<font size="5" color="white"><c:out value="${k.datum}"/></font>
			<font size="5" color="white"><c:out value="${k.korisnik9.usernamekor}"/></font>
			<font size="5" color="white"><c:out value="${k.tekst}"/></font>
			</c:forEach></td>
		</tr>
		<tr>
		<th><font size="5" color="white">Slika</font></th>	
			<td>${f.slika}</td>
		</tr>
		 <tr>
    		<td> <center><font size="5" color="white">Oceni film</font></center></td>
    <td>
	 <form action="\cinemaWeb\ocenaFilmaServlet" method="post">
            <input type="radio" name="rating" value="1" class="star">
            <input type="radio" name="rating" value="2" class="star">
            <input type="radio" name="rating" value="3" class="star">
            <input type="radio" name="rating" value="4" class="star">
            <input type="radio" name="rating" value="5" class="star">
            <input type="submit"  value="Glasaj">
        </form>
	</td>
    </tr>
</table></center>

</body>
</html>
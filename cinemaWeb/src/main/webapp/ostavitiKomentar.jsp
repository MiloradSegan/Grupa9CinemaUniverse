<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     <jsp:useBean id="now" class="java.util.Date" />
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<jsp:useBean id="filmoviBean" class="beans.sviFilmoviBean" scope="session"/>
<form action="\cinemaWeb\allMoviesServlet" method="post">
<table>
    <tr>
    <td> Odaberite film:</td>
    <td>
	<select name="nazivi" style="width: 150px;">
	        <option></option>
			<c:forEach var="izd" items="${filmoviBean.nazivi}" >
				<option>${izd}</option>		
			</c:forEach>			
	</select>
	</td>
    </tr>
    <tr>
    <td> Vas komentar:</td>
<td> <input type="text" name="komentar" ></td>
</tr>
</table>
<input type="submit" value="Sacuvaj komentar">
</form>
</body>
</html>
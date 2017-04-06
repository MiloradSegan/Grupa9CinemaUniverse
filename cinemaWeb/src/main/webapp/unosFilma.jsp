<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unos filma</title>
</head>
<body>
	<form action="\cinemaWeb\unosFilmaServlet2" method="post" >
		<table>
			<tr>
				<td>Naziv</td>
				<td><input name="naziv" type="text"></td>
			</tr>
			<tr>
				<td>Opis</td>
				<td><input name="opis" type="text"></td>
			</tr>
			<tr>
				<td>Zanr</td>
				<td><input name="zanr" type="text"></td>
			</tr>
			<tr>
				<td>Glumci</td>
				<td><input name="glumci" type="text"></td>
			</tr>
			<tr>
				<td>Reditelj</td>
				<td><input name="reditelj" type="text"></td>
			</tr>
			<tr>
			    <td>Slika</td>
                <td><input id="slika" type="file"/></td>
		    </tr>
		    <tr>
				<td>Trailer</td>
				<td><input name="trailer" type="text"></td>
			</tr>
		</table>
		<input type="submit" value="Sacuvaj">
	</form>
 <form action = "Pocetna.jsp">
<input type="submit" value="Pocetna strana">
</form>
${poruka}
</body>
</html>
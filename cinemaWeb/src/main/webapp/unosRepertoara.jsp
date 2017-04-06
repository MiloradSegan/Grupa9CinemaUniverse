<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unos repertoara</title>
</head>
<title>Insert title here</title>
</head>
<body>
	<form action="\cinemaWeb\unosRepertoara" method="post">
		<table>
			<tr>
				<td>Cena</td>
				<td><input name="cena" type="text"></td>
			</tr>
			<tr>
				<td>Dan</td>
				<td><input name="dan" type="text"></td>
			</tr>
			<tr>
				<td>Broj mesta</td>
				<td><input name="mesta" type="text"></td>
			</tr>
			<tr>
				<td>Sala</td>
				<td><input name="sala" type="text"></td>
			</tr>
			<tr>
				<td>Id Filma</td>
				<td><input name="idfilm" type="text"></td>
			</tr>
			<tr>
				<td>Tip projekcije</td>
				<td><input name="tip" type="text"></td>
			</tr>
		</table>
		<input type="submit" value="Snimi repertoar">
	</form>
	 <form action = "Pocetna.jsp">
<input type="submit" value="Pocetna strana">
</form>
	${poruka}
</body>
</html>
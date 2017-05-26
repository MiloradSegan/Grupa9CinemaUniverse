<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registracija</title>
</head>
<body BACKGROUND="bg2.jpg"/>
<body>
	<form action="\cinemaWeb\registracijaServlet" method="post"  >
		<table>
		    <tr>
		    <td><font size="5" color="white">Unesite vase podatke</font></td>
		    </tr>
			<tr>
				<td><font size="5" color="white">Ime</font></td>
				<td><input name="ime" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Prezime</font></td>
				<td><input name="prezime" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Username</font></td>
				<td><input name="user" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Password</font></td>
				<td><input name="pass" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Email</font></td>
				<td><input name="email" type="text"></td>
			</tr>
		</table>
		<input type="submit" value="Sacuvaj">
		<a href="logIn.jsp">
<input type="button" value="Log in">
</a>
	</form>
<font size="5" color="white">${poruka}</font>
</body>
</html>
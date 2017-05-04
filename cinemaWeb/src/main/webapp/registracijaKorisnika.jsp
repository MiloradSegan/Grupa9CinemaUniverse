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
<body>
	<form action="\cinemaWeb\registracija" method="post"  >
		<table>
		    Unesite vase podatke
			<tr>
				<td>Ime</td>
				<td><input name="ime" type="text"></td>
			</tr>
			<tr>
				<td>Prezime</td>
				<td><input name="prezime" type="text"></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input name="user" type="text"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="pass" type="text"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input name="email" type="text"></td>
			</tr>
		</table>
		<input type="submit" value="Sacuvaj">
	</form>
${poruka}
</body>
</html>
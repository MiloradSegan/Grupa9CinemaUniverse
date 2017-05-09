<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/cinemaWeb/logIn" method=get>
    <p><strong>Unesite User Name: </strong>
    <input type="text" name="user" size="25">
    <p><p><strong>Unesite Password: </strong>
    <input type="password" size="15" name="pass">
    <p><p>
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
    <a href="registracijaKorisnika.jsp">Registruj se</a>
</form>
</body>
</html>
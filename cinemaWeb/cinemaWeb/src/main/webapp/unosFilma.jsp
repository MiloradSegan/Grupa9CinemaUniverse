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
<body BACKGROUND="bg2.jpg"/>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #CCCCCC;
}

.active {
    background-color: #4CAF50;
}
</style>
<body>
<ul>
  
  <li><a href="adminPanel.jsp">Admin pocetna</a></li>
  <li><a class="active">Unos novog filma</a></li>
</ul>
</body>
<body>

	<form action="\cinemaWeb\unosFilmaServlet1" method="post" enctype="multipart/form-data" >
		<table>
			<tr>
				<td><font size="5" color="white">Naziv</font></td>
				<td><input name="naziv" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Opis</font></td>
				<td><input name="opis" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Zanr</font></td>
				<td><input name="zanr" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Glumci</font></td>
				<td><input name="glumci" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Reditelj</font></td>
				<td><input name="reditelj" type="text"></td>
			</tr>
			<tr>
			    <td><font size="5" color="white">Slika</font></td>
                <td><input id="slika" type="file"/></td>
		    </tr>
		    <tr>
				<td><font size="5" color="white">Trailer</font></td>
				<td><input name="trailer" type="text"></td>
			</tr>
		</table>
		<input type="submit" value="Sacuvaj">
	</form>
<font size="5" color="white">${poruka}</font>

</body>
</html>
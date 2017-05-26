<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="filmoviBean" class="beans.sviFilmoviBean" scope="session"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unos repertoara</title>
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
  <li><a class="active">Unos novog repertoara</a></li>
</ul>
</body>
<body>
	<form action="\cinemaWeb\unosRepertoara" method="post">
		<table>
			<tr>
				<td><font size="5" color="white">Cena</font></td>
				<td><input name="cena" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Dan</font></td>
				<td><input name="dan" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Broj mesta</font></td>
				<td><input name="mesta" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Sala</font></td>
				<td><input name="sala" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Film</font></td>
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
				<td><font size="5" color="white">Tip projekcije</font></td>
				<td><input name="tip" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Vreme</font></td>
				<td><input name="vreme" type="text"></td>
			</tr>
			<tr>
				<td><font size="5" color="white">Datum projekcije</font></td>
				<td><input name="datumpro" type="text"></td>
			</tr>
			
		</table>
		<input type="submit" value="Snimi repertoar">
	</form>
	<font size="5" color="white">${poruka}</font>
</body>
</html>
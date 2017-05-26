<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body BACKGROUND="bg2.jpg"/>
<body>

<form action="\cinemaWeb\prodajKartu" method="post">
<table>
<tr>
    
    <td> <font size="5" color="white">Unesite broj karata za prodaju</font></td>
     <td> <input type="text" name="brm" ></td>  
    </tr>
    <tr>
    
</table>
<input type="submit" value="Prodaj">
</form>
<font size="5" color="white">${poruka}</font>
</body>
</html>
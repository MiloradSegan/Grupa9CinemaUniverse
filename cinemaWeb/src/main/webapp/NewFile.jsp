<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body BACKGROUND="bg2.jpg"/>
<body>
<form method="get" action="/cinemaWeb/prikazVremena">
<table>
	<tr>
		<td>
			<font size="5" color="white">Pretrega po vremenu</font>
		</td>
	</tr>
	<tr>
		<td>
			<input type="text" name="vreme">
		</td>
	</tr>
		<c:forEach items="${rep}" var="r">		
			<tr>
			 <td><c:out value="${r.idrep}" /></td>         
			</tr>
		</c:forEach>
</table>
</form>
</body>
</html>
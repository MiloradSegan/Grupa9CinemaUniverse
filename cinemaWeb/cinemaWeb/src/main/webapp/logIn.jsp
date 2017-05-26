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
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: ;
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
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
<body>
<ul>
 <li><a href="Pocetna.jsp">Home</a></li>
  <li><a class="active" href="logIn.jsp">LogIn</a></li>
</ul>
</body>
<body>
<form action="/cinemaWeb/logInServlet" method="get">
    <table>

		<tr>
			<td>
 				<strong><font size="5" color="white">Unesite User Name:</font> </strong>
    			<input type="text" name="user" size="25">
			</td>
		</tr>
		<tr>
			<td>
 				<strong><font size="5" color="white">Unesite Password:</font> </strong>
   				<input type="password" size="15" name="pass">
   		 				
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Submit">
			</td>
		</tr>
		<tr>
			<td>
				<input type="reset" value="Reset">
			</td>
		</tr>
 
	</table>
	
</form>
${poruka}
</body>
</html>
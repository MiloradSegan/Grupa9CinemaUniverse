<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  <li><a class="active">Pregled profita</a></li>
</ul>
</body>
<body>
<form method="get" action="/cinemaWeb/prikazProfitaServlet">
<font size="5" color="white">Unesite datum od:</font><input type="text" name="dat">
<font size="5" color="white">Unesite datum do:</font><input type="text" name="datum">

<input type="submit" value="pretrazi">
</form>
<font size="5" color="white">${poruka}</font>

</body>
</html>
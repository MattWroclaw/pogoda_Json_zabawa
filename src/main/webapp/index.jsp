<%@ page import="weather.App" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Temperatura w danym mieście</title>
</head>
<body>

<form method="get" action="pogoda">
    <label for = "region"> Wybierz miasto:</label>
    <input id="region" type="text" name="miasto" placeholder="Wrocław" >
    <input type="submit" value="Wyslij">

</form>

<%
    out.print("Temperatura we Wrocławiu: ");
    out.print(App.tempMiasto("wroclaw"));
    String m = request.getParameter("miasto");
%>

<br><br><br>

Temperatura w <%= m%> wynosi:
<br>
<jsp:useBean id="tempera" type="weather.TemperaturaPomocnicza" scope="request"/>
<jsp:getProperty name="tempera" property="tempAux"/>


</body>
</html>

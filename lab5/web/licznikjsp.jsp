<%-- 
    Document   : licznikjsp
    Created on : 2020-04-05, 17:47:15
    Author     : kacperel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Licznik</title>
    </head>
    <body>
        <h1>Hello🖖!</h1>
        <h1>Odwiedziłęś strone już : ${ile} razy!</h1>
        <%@page session="true" %>
       <h1>Odwiedziłęś strone już : ${sessionScope["licznik"]} razy!</h1>
    </body>
</html>

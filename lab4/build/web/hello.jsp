<%-- 
    Document   : hello
    Created on : 2020-03-29, 22:28:30
    Author     : kacperel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <h1>Witaj, ${osoba.firstName} 
            ${osoba.lastName} 
               <a href="mailto:${osoba.emailAddress}">${osoba.emailAddress} </a>
        </h1>
           <!--//biboletka JSTL chroni nas meidzy innymi przed atakami xss-->  
           <c:forEach items="${dniTygodnia}" var="dzien">
    <p>
        ${dzien}
    </p>
</c:forEach>
           
   
    </body>
</html>
<%-- 
    Document   : personList
    Created on : 2020-03-29, 22:56:02
    Author     : kacperel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Witaj, ${osoba.firstName}  </h1>
        <span>${imie}</span>
        <span>${osoba1}</span>
        
    
    <tabe>
         <table border="1" bgcolor="#ceebe7">
            
          <tr  >
    <th>Imię</th>
    <th>Nazwisko</th>
    <th>E-mail</th>
  </tr>
            
        <c:forEach items="${ososby}" var="osoba">   
            <tr>           
            <td> ${osoba.firstName}</td> <td> ${osoba.lastName}</td>     <td> ${osoba.emailAddress}</td>          
            </tr>    
        </c:forEach>
    </tabe>
     


    </body>
</html>

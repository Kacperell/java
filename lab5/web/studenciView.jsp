<%-- 
    Document   : studenciView
    Created on : 2020-04-05, 18:49:14
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
        <h1>Hello studenci!</h1>
       
     
         <table border="1" bgcolor="#ceebe7">      
          <tr >
            <th>Imię</th>
            <th>Nazwisko</th>
            <th>E-mail</th>
          </tr>        
        <c:forEach items="${studenci}" var="osoba">   
            <tr>           
            <td> ${osoba.firstName}</td> <td> ${osoba.lastName}</td>     <td> ${osoba.emailAddress}</td>          
            </tr>    
        </c:forEach>         
    </tabe>
    
            
            <form action='/lab5/dodajStudenta' method='post'>
                <div>  Dodaj studenta </div>
            <div>   Imie  <input required type='text' name='imie'> </div>
         <div> Nazwisko  <input required type='text' name='nazwisko'></div>
        <div>  Email  <input required type='text' name='email'></div>
          <div>  <input type='submit'></div>
</form>
  
    </body>
      <style>
       
    
    </style>
</html>

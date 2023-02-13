<%-- 
    Document   : index
    Created on : Dec 17, 2022, 12:35:53 PM
    Author     : lincoln
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lincoln Asteroids</title>
    </head>
    <body>
        <h1>Lincoln's Database Application</h1>
        <form action ="BuildAsteroids" method="GET">
            Type: <input type ="text" name="AT" size="10" />
            Designation: <input type="text" name="AD" size="10" />
            <input type ="submit" value="Submit" />
    </body>
</html>

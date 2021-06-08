<%-- 
    Document   : incomingCustomMilling
    Created on : Apr 1, 2021, 11:26:59 AM
    Author     : paurash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INCOMING CUSTOM MILLING</title>
    <style>
        .d1{
            background-color:lightgrey;
            border: 4px solid aqua;
            margin: auto;
            padding: 20px;
            width: 600px;
            height:600px;
            align-self: center;
            text-align: center;
        }
        </style>
    </head>
    <body style="background-color:lightskyblue">
        <div class="d1">
            <form action="registerCM" method="post">
            <h1 style="color: red">Incoming Custom Milling</h1>
            <hr style="color:black">
            <table width="80%" style="margin: auto">
                <tr><td>MILLING ID</td><td><input type="text" name="mid"></td></tr>
                <tr><td>ORDER NAME</td><td><input type="text" name="ordername"></td></tr>
                <tr><td>BAGS</td><td><input type="text" name="bags"></td></tr>
                <tr><td>DATE</td><td><input type="text" name="date"></td></tr>
                <tr><td>VEHICAL NO</td><td><input type="text" name="vnumber"></td></tr>
                <tr><td>DRIVER NAME</td><td><input type="text" name="dname"></td></tr>
            </table><br><br><br>
            <div style="border:2px solid black">
                <br>
            <input type="submit" value="SAVE" style="color:red; width:80%;background-color:lightskyblue;height:20% "><br><br>
            <input type="button" value="UPDATE" style="color:red; width:80%;background-color:lightskyblue;height:20% "><br><br>
            <input type="button" value="DELETE" style="color:red; width:80%;background-color:lightskyblue;height:20% "><br><br>
            <input type="button" value="SEARCH" style="color:red; width:80%;background-color:lightskyblue;height:20% ">
            <br><br>
            <h2><a href="mainPage.jsp">Go to Home Page</a></h2>
            </div>
            </div>
    </body>
</html>
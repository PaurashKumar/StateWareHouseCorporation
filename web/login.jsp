<%-- 
    Document   : login
    Created on : Mar 31, 2021, 11:46:31 AM
    Author     : paurash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> Login Page </title>
<style>
Body {
  font-family: Calibri, Helvetica, sans-serif;
  background-color: orange;
}
button {
       background-color: #4CAF50;
       width: 100%;
        color: orange;
        padding: 15px;
        margin: 10px 0px;
        border: none;
        cursor: pointer;
         }
 form {
        border: 3px solid #f1f1f1;
    }
 input[type=text], input[type=password] {
        width: 100%;
        margin: 8px 0;
        padding: 12px 20px;
        display: inline-block;
        border: 2px solid green;
        box-sizing: border-box;
    }
 button:hover {
        opacity: 0.7;
    }
  .cancelbtn {
        width: auto;
        padding: 10px 18px;
        margin: 10px 5px;
    }
 .container{
        padding: 25px;
        background-color: lightblue;
}
</style>
</head>
<body>
    <center> <h1>Login Here</h1> </center>
    <form>
        <div class="container">
            <label>Username : </label>
            <input type="text" id="i1" placeholder="Enter Username" name="username" required>
            <label>Password : </label>
            <input type="password" id="i2" placeholder="Enter Password" name="password" required>
            <button type="submit"><a href="mainPage.jsp">Login</a></button>
            <input type="checkbox" checked="checked"> Remember me
            <button type="button" class="cancelbtn"> Cancel</button>
            Forgot <a href="#"> password? </a>
        </div>
    </form>
</body>
</html>


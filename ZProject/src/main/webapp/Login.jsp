<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.container{
background-color : Silver;
width: 400px;
height: 400px;
margin-left: 40%;
margin-top: 100px;
}
label{
color: blue;
margin-left: 30px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "background-color: SaddleBrown;">

<div class = "container">
<form action="Login" method = "post">
<center>
<h1 style = "color: RoyalBlue; font-family: Brush Script MT
, cursive; ">WELCOME</h1>
<h1 style = "color: RoyalBlue;"> BLACK WORLD</h1>
<h2 style = "color: SlateBlue;">LOGIN</h2></center>
<label>User Name  : </label>
<input type ="text" placeholder = " enter username " name = "username" style = "margin-left: 25px;"/><br><br>
<label>Password :</label>
<input type = "text" placeholder = "enter password" name = "password" style = "margin-left: 35px;"/><br><br>
<a href = "web"style = "margin-left: 50px;">forgot password ?</a><br><br>
<input type = "submit" value = "Login" style ="color: Red; margin-left: 70px; font-size:20px;"/ >
<input type = "reset" vlaue = " Clear All" name= "reset" style ="color:Navy; margin-left: 70px;font-size: 20px;"/><br><br>
<label style = "margin-left: 30px;">New to login page </label><a href = "Register" style = "margin-left: 30px;" >Register</a>


</form>
</div>
</body>
</html>
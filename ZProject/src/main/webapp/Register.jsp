<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.container{

background-color: orange;
width: 600px;
height: 850px;
margin-left: 350px;
margin-top: 80px;
}
label{
color: blue;
margin-left: 30px;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "background-color: SpringGreen;">
<div class = "container">
<form action="Register" method = "post">
<center><br><br>
<h1 style = "color: red;"> REGISTRATION</h1>
<h2>Personal Details</h2>
</center>
<label>First Name</label>
<input style = "margin-left: 30px;"type = "text" placeholder = "first name"name = "firstname"/><br><br>
<label>Last Name</label>
<input style = "margin-left: 30px;" type = "text" placeholder = "last name" name = "lastname"/><br><br>
<label>Father Name </label>
<input style = "margin-left: 30px;" type = "text" name = "fathername"/><br><br>
<label>Mother Name </label>
<input style = "margin-left: 30px" type ="text" name = "mothername" /><br><br>
<label>Gender</label>
<input type ="radio" name = "gender" value = "male"/> Male
<input type = "radio" name = "gender" value = "female"/>Female<br><br>
<label>Date Of Birth </label>
<input type ="date" name = "dob" style ="margin-left: 20px"/><br><br>
<label>Phone Number</label>
<input type = "text" style = "margin-left: 20px;" name = "number" placeholder = "Phone Number"/><br><br>
<label>Email</label>
<input style = "margin-left: 20px;" type = "text" name = "email" placeholder = "Email"/> <br><br>
<label>Adhar Card Number</label>
<input type ="text" placeholder ="adhar card number" name ="adhar"style ="margin-left: 20px" /><br><br>
<label>Adress</label><br>
<textarea rows="5" cols="50" style = "margin-left: 100px;" name = "adress"></textarea><br><br>
<label>Photo</label>
<input type ="file" name = photo;/> <br><br>
<label>Payment</label>
<input type ="radio" name = "payment" value = "payment"/> UPI<br><br>
<label>Password</label>
<input type = "password" name = "password" placeholder = "enter password"/><br><br><br><br>
<center>
<input type = "submit" value = "Register" style ="margin-left: 20px"/>
<input type ="reset" value = "Clear" style ="margin-left: 30px"/></center>

</form>
</div>
</body>
</html>
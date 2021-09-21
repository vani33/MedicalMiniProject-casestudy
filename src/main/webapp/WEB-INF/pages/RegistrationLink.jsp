<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Registration Form</title>

<!-- //<script type="text/javascript" src="ValidationForm.js"/></script> -->

<!-- <script>

function validateForm(){

 var vendorId=document.myForm.vendorId.value;

 var password=document.myForm.password.value;

 var contactNo=document.myForm.contactNo.value;

 if(vendorId == null||vendorId == ""){

 alert("VendorId cant be blank");

 return false;

 }

 else if(password.length<8){

  alert("password must be atleast 8 characters");

  return false;



 }else(contactNo.length<10){

  alert("ContactNo must be 10 characters");

  return false;



 }



 }



</script> -->

</head>

<body>

	<form action="Insert" method="post">

		FirstName: <input type="text" name="firstName" required><br>

		LastName: <input type="text" name="lastName" required><br>

		Age: <input type="number" name="age" required><br>

		Gender: <input type="radio" name="gender" value="male" checked
			required>male<br> <input type="radio" name="gender"
			value="female">female<br> ContactNo: <input
			type="number" name="contactNo" maxlength="10" required><br>

		VendorId: <input type="text" name="vendorId" required><br>

		Password: <input type="password" name="password" maxlength="8"
			required><br> <input type="submit" value="Register">

	</form>



</body>

</html>
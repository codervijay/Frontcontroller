<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="pink">
<form action="processOrder">
	<div align="center">
		<h1 align="center">${myWebTitle}</h1>
		<hr>
		<label for="item_name">Enter the Food :</label> 
		<input name="foodType" type="text" placeholder="Enter the foodtype" id="item_name"></input> 
		<input type="submit" value="Order now"></input>
	</div>
	</form>
</body>
</html>
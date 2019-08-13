<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div align ="center">
		<h1>Product Details</h1>
		
		</br></br></br>
		
		<table>
			<tr>
				<td> Category id :</td>
				<td> ${categoryObj.categoryId}</td>
			</tr>
			<tr>
				<td> Category Name :</td>
				<td> ${categoryObj.categoryName}</td>
			</tr>
			<tr>
				<td> Category Description :</td>
				<td> ${categoryObj.categoryDescription}</td>
			</tr>
		</table>
	
		</div>
</body>
</html>
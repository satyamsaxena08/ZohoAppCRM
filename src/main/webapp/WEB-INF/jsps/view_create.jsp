<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
		<h2>Create Leads</h2>
		
		<form action="saveLeads"  method="post">
		<pre>
		Fist Name<input type="text" name="firstName" />
		Last Name<input type="text" name="lastName" >
		Email <input type="text" name="email" >
		Mobile <input type="text" name="mobile" />
		
		Source: <select name="source">
				    <option value="news paper">New's Paper</option>
				    <option value="online">Online</option>
				    <option value="webinar">Webinar</option>
				    <option value="radio">Radio</option>
				</select>
				<input type="submit" value="save">
		
		</pre>
		</form>

</body>
</html>
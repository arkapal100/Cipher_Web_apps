<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First JSP</title>
</head>
<body>

	<h1>Hello World</h1>
	
	<%
		String msg = "<h2>Welcome to java server pages</h2>";
		out.print(msg);

	%>

</body>
</html>
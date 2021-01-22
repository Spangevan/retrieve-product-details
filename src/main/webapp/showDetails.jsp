<%@page import="com.hcl.web.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Product p1 = (Product)request.getAttribute("product");

	out.println(p1);


%>

</body>
</html>
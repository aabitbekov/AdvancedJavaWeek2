<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="ServletsClasses.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProFile</title>
</head>
<body>
<%
   User user = (User) request.getAttribute("user");
%>
  
  <h1>ProFile</h1>
  <h2>Id:<%=user.getUserID() %></h2>
  <h2>Name:<%=user.getName() %></h2>
  <h2>Surname:<%=user.getSurname() %></h2>
  <h2>email:<%=user.getEmail() %></h2>
  
     
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file = "JSPFile/Rstyle.jsp" %>
<body>
<form method="post" action="UserServlet">
  <div class="cont">
    <div class="form sign-in">
      <h2>Register</h2>
      <label>
        <span>Email Address</span>
        <input type="email" name="email" placeholder="email">
      </label>
      <label>
        <span>Name</span>
        <input type="text" name="UserName" placeholder="Name">
      </label>
      <label>
        <span>Surname</span>
        <input type="text" name="UserSurname" placeholder="Surname">
      </label><br><br>
      <input type="submit" >
      <br><br>
      <p class="forgot-pass">Forgot Password ?</p>
    </div>
</body>
</html>
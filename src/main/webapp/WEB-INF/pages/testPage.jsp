<%@ page language="java"
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime"%>
<html>
<body style="margin:20px;">
JSP page
<p> Page Created:  <%= LocalDateTime.now()%></p>
<a href='/student'>Get Student</a>
</body>
</html>

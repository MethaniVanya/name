<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String uname=request.getParameter("inputname");
String pwd=request.getParameter("password");
String age=request.getParameter("age");
out.print("welcome "+uname);
session.setAttribute("sname",uname);
session.setAttribute("spassword",pwd);
session.setAttribute("sage",age);
%>
<a href="output.jsp">check output page here</a>
</body>
</html>
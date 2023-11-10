<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
	String login="";
	if (session.isNew()){
		session.setAttribute("login","홍길동");
	}
	else{
		login = (String)session.getAttribute("login");
		session.removeAttribute("login");
	} 
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Session Test</title>
	</head>	
	<body>
	<%=login %>
	</body>
</html>
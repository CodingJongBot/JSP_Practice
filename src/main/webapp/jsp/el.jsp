<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
		session.setAttribute("msg","EL Test");
		request.setAttribute("a", 10);
	
		String name1 = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Session Test</title>
	</head>	
	<body>
	<%=name1 %>
	<h3>${ param.name }</h3>
	<h3>${ sessionScope.msg }</h3>
	<h3>${ a }</h3>
	<h3>${ a +10}</h3>
	<h3>\${a +10}=${ a +10}</h3>
	<h3>${a>0 ? 'A':'B'}</h3>
	</body>
</html>

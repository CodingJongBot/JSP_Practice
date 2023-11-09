<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
	String result1 = (String)request.getAttribute("result");
%>
    <!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Jong's Calculator</title>
	</head>
	
	<body>
	<h1>Jong's Calculator</h1>
	<form name="form1" action="../CalcServlet2" method="post">
		<input type="number" name="num1" size="5" required>		
		<!-- select[name="operator"]>option[value]*4 -->
		<select name="operator" id="operator">
			<option value="+" selected>+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select>
		<input type="number" name="num2" size="5" required>
		<button type="sumit">계산</button>
		<button type="reset">초기화</button>
	</form>
	<h3>결과 : ${result }</h3> <!-- EL -->
	</body>
</html>
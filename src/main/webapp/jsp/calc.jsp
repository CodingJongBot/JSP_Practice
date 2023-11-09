<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int num1 = 0, num2=0, result=0;
	String op = "+";
	
	if(request.getMethod().equals("POST")){
		num1=Integer.parseInt(request.getParameter("num1"));
		num2=Integer.parseInt(request.getParameter("num2"));
		op= request.getParameter("operator");
		
		if(op.equals("+")){
			result = num1+num2;
		}
		else if(op.equals("-") ){
			result = num1-num2;
		}
		else if(op.equals("*") ){
			result = num1*num2;
		}
		else if(op.equals("/") ){
			result = num1/num2;
		}
	}
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
	<form name="form1" action="calc.jsp" method="post">
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
	<h3>결과 : <%=num1%> <%=op %> <%=num2 %> = <%=result%></h3>
	</body>
</html>
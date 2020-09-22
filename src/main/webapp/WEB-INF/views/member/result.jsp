<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
	member\result.jsp<br>
	
	id1 : <%=request.getParameter("id") %><br> <!-- null -->
	id2 : ${param.id }<br>	<!-- 공백  -->
	id3 : ${id }<br>
	id4 : ${requestScope.id }<br>
	id5 : <%=request.getAttribute("id") %><br>
	
</body>
</html>
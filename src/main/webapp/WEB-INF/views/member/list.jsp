<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>list.jsp입니다.</h1>
	
	name1 : <%=request.getParameter("name") %><br>	<!-- null -->
	name2 : ${param.name }<br>	<!-- 공백  -->
	name3 : ${name }<br>
	name4 : ${requestScope.name }<br>
	name5 : <%=request.getAttribute("name") %><br>
	
	<hr>
	
	pw1 : <%=request.getParameter("pw") %><br>	<!-- null -->
	pw2 : ${param.pw }<br>	<!-- 공백  -->
	pw3 : ${pw }<br>
	pw4 : ${requestScope.pw }<br>
	pw5 : <%=request.getAttribute("pw") %><br>
</body>
</html>
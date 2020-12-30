<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- form:form 태그 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test1.jsp</h2>
	<form:form modelAttribute="DataBean" action="result" method="post">
		<form:hidden path="a1"/>
		<div><form:input path="a2"/></div>
		<div><form:password path="a3" showPassword="true"/></div>
		<div><form:textarea path="a4" l/></div>
		<div><form:button type="submit" disabled="true">확인버튼</form:button><!-- 버튼 비활성화 시킴. --></div>
	</form:form>
	<div><a href="/">>index.jsp<</a></div>
</body>
</html>
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
	<h2>test2.jsp</h2>
	<form:form modelAttribute="UserDataBean" action="result">
		<div>이름 : <form:input path="user_name" id="user_name1"/></div>
		<div>아이디 : <form:input path="user_id" id="user_id1"/></div>
		<div>비밀번호 : <form:input type="password" path="user_pw" id="user_pw1"/></div>
		<div>우편번호 : <form:input path="user_postcode" id="user_postcode1"/></div>
		<div>주소1 : <form:input path="user_addr1"/></div>
		<div>주소2 : <form:input path="user_addr2"/></div>
		<input type="submit" value="보내기" />		
	</form:form>
	<hr/>
	<a href="/">>index.jsp<</a>
</body>
</html>
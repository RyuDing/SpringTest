<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test1.jsp</h2>
	<form action="result" method="post">
		<div>이름 : <input type="text" name="user_name" value="${UserDataBean.user_name}"></div>
		<div>아이디 : <input type="text" name="user_id" value=""></div>
		<div>비밀번호 : <input type="password" name="user_pw" value=""></div>
		<div>우편번호 : <input type="text" name="user_postcode" value=""></div>
		<div>주소1 : <input type="text" name="user_addr1" value="${UserDataBean.user_addr1}"></div>
		<div>주소2 : <input type="text" name="user_addr2" value="${UserDataBean.user_addr2}"></div>
		<input type="submit" value="보내기" />
	</form>
	<hr/>
	<a href="/">>index.jsp<</a>
</body>
</html>
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
	<div>data1(dataBean:넘어오는 name을 지정 안했을 때) : ${dataBean.data1}</div>
	<div>data2(dataBean:넘어오는 name을 지정 안했을 때) : ${dataBean.data2}</div>
	<div>data1(zz:넘어오는 name을 지정 했을 때) : ${zz.data1}</div>
	<div>data2(zz:넘어오는 name을 지정 했을 때) : ${zz.data2}</div>
	<a href="/">>index.jsp<</a>
</body>
</html>
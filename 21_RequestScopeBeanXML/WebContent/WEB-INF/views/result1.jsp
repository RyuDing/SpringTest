<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>result1.jsp</h2>
	<hr/>
	<h3>requestBean1</h3>
	<div>data1 : ${requestBean1.data1}</div>
	<div>data2 : ${requestBean1.data2}</div>
	<hr/>
	<h3>requestBean2</h3>
	<div>data3 : ${requestBean2.data3}</div>
	<div>data4 : ${requestBean2.data4}</div>
	<hr/>
		<h3>requestBean3</h3>
	<div>data3 : ${requestBean3.data5}</div>
	<div>data4 : ${requestBean3.data6}</div>
	<hr/>
		<h3>requestBean4</h3>
	<div>data3 : ${requestBean4.data7}</div>
	<div>data4 : ${requestBean4.data8}</div>
	<hr/>
	
	<div>><a href="/">index.jsp</a><</div>
</body>
</html>
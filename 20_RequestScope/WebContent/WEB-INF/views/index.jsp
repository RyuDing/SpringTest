<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>HttpServletRequest</h2>
	<a href="test1?data2=data2">[test1](redirect)</a>
	<hr/>
	<a href="test2?data2=data2">[test2](forward)</a>
	<hr/>
	<hr/>
	<h2>Model Object</h2>
	<a href="test3?data1=data1">[test3](forward)</a>
	<hr/>
	<hr/>
	<h2>ModelAndView Object</h2>
	<a href="test4?data1=data1&data2=data2">[test4](forward)</a>
	<hr/>
	<hr/>
	<h2>Model Object</h2>
	<a href="test5">[test5](forward)</a>
	<hr/>
	<hr/>
	<h2>@ModelAttiribute(자동주입)</h2>
	<a href="test6?data1=dd1&data2=ee">[test6](forward)</a>
	<hr/>
</body>
</html>
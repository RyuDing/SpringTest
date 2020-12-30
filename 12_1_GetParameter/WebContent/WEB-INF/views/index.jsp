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
	<a href="test1?data1=100&data2=200&data3=300&data3=400">test1 get</a>
	<form action = "test2" method="post">
		<div>data1 : <input type="text" name="data1" value="101" readonly/></div>
		<div>data2 : <input type="text" name="data2" value="201" readonly/></div>
		<div>data3 : <input type="text" name="data3" value="301" readonly/></div>
		<div>data3 : <input type="text" name="data3" value="401" readonly/></div>
		<input type="submit" value="보내기"/>
	</form>
	<hr/>
	<h2>WebRequest</h2>
	<a href="test3?data1=102&data2=202&data3=302&data3=402">test3 get</a>
	<hr/>
	<h2>restfull API(ex.http://127.0.0.1:8080/100(값)/200(값)/300(값))</h2>
	<a href="test4/103/203/303">test4 get</a>
	<hr/>
	<h2>@RequestParam</h2>
	<a href="test5?data1=104&data2=204&data3=304&data3=404">test5 get</a>
	<br/>
	<a href="test6?data1=105&data2=205&data3=305&data3=405">test6 get</a>
	<br/>
	<a href="test7?data1=106">test7 get</a>
</body>
</html>
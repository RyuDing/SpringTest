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
	<form:form action="result" modelAttribute="DataBean" method="post">
		<form:select path="a1">
			<form:option value="data1">항목1</form:option>
			<form:option value="data2">항목2</form:option>
			<form:option value="data3">항목3</form:option>
		</form:select>
		<hr/>
		<form:select path="a2">
			<form:options items="${data_list1}" />
		</form:select>
		<hr/>
		<form:select path="a3">
			<form:options items="${data_list2}" />
		</form:select>
		<hr/>
		<form:select path="a4">
			<form:options items="${data_list3}" itemLabel="key" itemValue="value"/>
		</form:select>
		<hr/>
		<form:checkbox path="a5" value="data1"/>항목1
		<form:checkbox path="a5" value="data2"/>항목2
		<form:checkbox path="a5" value="data3"/>항목3
		<hr/>
		<form:checkboxes items="${data_list1}" path="a6"/>
		<hr/>
		<form:checkboxes items="${data_list2}" path="a7"/>
		<hr/>
		<form:checkboxes items="${data_list3}"  itemLabel="key" itemValue="value" path="a7"/>
		<hr/>
		<form:radiobutton path="a9" value="data1"/>항목1
		<form:radiobutton path="a9" value="data2"/>항목2
		<form:radiobutton path="a9" value="data3"/>항목3
		<hr/>
		<form:radiobuttons path="a10" items="${data_list1}"/>
		<hr/>
		<form:radiobuttons path="a11" items="${data_list2}"/>
		<hr/>
		<form:radiobuttons path="a12" items="${data_list3}" itemValue="value" itemLabel="key"/>
		<hr/>
		<form:button type="submit" >선택</form:button>
		
	</form:form>
	<div><a href="/">>index.jsp<</a></div>
</body>
</html>
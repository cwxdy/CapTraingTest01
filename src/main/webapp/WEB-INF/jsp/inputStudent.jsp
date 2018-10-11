<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理</title>
</head>
<body>
<form:form action="/student" method="POST" modelAttribute="student">
	<c:if test="${student.studentId != null}">
		序号：<form:input path="studentId" readonly="true" /><br/>
		<input type="hidden" name="_method" value="PUT">
	</c:if>
	姓名：<form:input path="studentName"/><br/>
	年龄：<form:input path="studentAge"/><br/>
	年级：<form:select path="grade.gradeId">
			<form:option value="" label="请选择" />
			<form:options items="${gradeList}" itemLabel="gradeName" itemValue="gradeId"/>
		</form:select><br/>
	<%-- <form:input path="grade.gradeName"/><br/> --%>
	地址：<form:input path="address.addressName"/><br/>
	
	<input type="submit" value="提交">
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".delete").click(function(){
			var href = $(this).attr("href");
			$("#deleteForm").attr("action", href).submit();
			return false;
		});
	})
	
</script>
</head>
<body>
<form action="/studentList" method="get">
	姓名：<input type="text" name="name">
	年龄：<input type="text" name="age">
	<input type="submit" value="搜索" id="search">
</form>

<form id="deleteForm" action="" method="post">
	<input type="hidden" name="_method" value="delete">
</form>

	<table>
		<th>序号</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>年级</th>
		<th>地址</th>
		<th>操作</th>
		<c:forEach var="student" items="${studentList }">
			<tr>
				<td>${student.studentId }</td>
				<td>${student.studentName }</td>
				<td>${student.studentAge }</td>
				<td>${student.grade.gradeName }</td>
				<td>${student.address.addressName }</td>
				<td>
					<a href="/student/${student.studentId }">修改</a>
					<a class="delete" href="/student/${student.studentId }">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/student">添加</a>
</body>
</html>
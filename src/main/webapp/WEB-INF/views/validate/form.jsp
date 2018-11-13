<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post"> 
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="id" value="${stud.id }" /></td>
			<td><form:errors path="stud.id" /></td>
		</tr>
		<tr>
			<td>pw</td>
			<td><input type="text" name="pw" value="${stud.pw }"/></td>
			<td><form:errors path="stud.pw" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="서브밋" />
				<input type="reset" value="reset" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>
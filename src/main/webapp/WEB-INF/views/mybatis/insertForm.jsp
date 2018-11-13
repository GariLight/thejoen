<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>insertForm</h2>
	
	<form action="insertReg" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr> 
				<th>작성자</th>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td><input type="text" name="pw" /></td>
			</tr>
			<tr>
				<th>파일</th>
				<td><input type="file" name="upfileMM" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" rows="5" cols"20"></textarea></td>
			</tr>
			<tr>

				<td colspan="2" align="center">
					<input type="submit" value="입력" />
					<input type="reset" value="취소" />
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>
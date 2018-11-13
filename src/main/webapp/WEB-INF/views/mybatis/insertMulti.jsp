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
	<h2>insertMulti</h2>
	
	<form action="insertMultiReg" method="post" enctype="multipart/form-data">
		<table border="">
			<tr>
				<th>제목</th>		 
				<th>작성자</th>			
				<th>패스워드</th>						
				<th>내용</th>
			</tr>
			<c:forEach begin="0" end="3" var="i">
				<tr>
					<td><input type="text" name="mem[${i}].title" /></td>
					<td><input type="text" name="mem[${i}].pname" /></td>
					<td><input type="text" name="mem[${i}].pw" /></td>
					<td><textarea name="mem[${i}].content" rows="5" cols"20"></textarea></td>
				</tr>
			</c:forEach>
			
			<tr>
				<td colspan="4" align="center">
					<input type="submit" value="입력" />
					<input type="reset" value="취소" />
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>
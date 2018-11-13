<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>byOrderPost</title>
</head>
<body>
<form action="" method="post">
	<table border="1">
		<tr>
			<th>ID</th>
			<th>제품명</th>
			<th>수량</th>
			<th>단가</th>
		</tr>
		<c:forEach var="i" begin="0" end="3">
		<tr>
			<td><input type="text" name="proList[${i }].id" /></td>
			<td><input type="text" name="proList[${i }].name" /></td>
			<td><input type="text" name="proList[${i }].cnt" /></td>
			<td><input type="text" name="proList[${i }].price" /></td>	
		</tr>
		</c:forEach>
		
		
		<tr>
			<td rowspan="3">배송지</td>
			<td>우편번호</td>
			<td colspan="2"><input type="text" name="addr.zipcode" /></td>
			
		</tr>
		<tr>
			<td>기본주소</td>
			<td colspan="2"><input type="text" name="addr.addr1" /></td>
		</tr>
		<tr>

			<td>상세주소</td>
			<td colspan="2"><input type="text" name="addr.addr2" /></td>
		</tr>
		<tr>
			<td colspan="4" align="right"><input type="submit" value="결제하기" /></td>
		</tr>
	</table>
</form>
</body>
</html>
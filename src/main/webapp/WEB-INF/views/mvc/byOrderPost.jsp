<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>byOrderForm</title>
</head>
<body>
<h1>구매한 제품!!</h1>
<form action="" method="post">
	<table border="1">
		<tr>
			<th>ID</th>
			<th>제품명</th>
			<th>수량</th>
			<th>단가</th>
			<th>소계</th>
		</tr>
		<c:forEach var="pro" items="${byOrder.proList}" varStatus="status">
		<tr>
			<td>${pro.id}</td>
			<td>${pro.name}</td>
			<td>${pro.cnt}</td>
			<td>${pro.price}</td>
			<td>${pro.total}</td>
		</tr>
		</c:forEach>
		
		<tr>
			<td>총계</td>
			<td colspan="3">${byOrder.totalll }</td>
		</tr>
		<tr>
			<td rowspan="3">배송지</td>
			<td>우편번호</td>
			<td>${byOrder.addr.zipcode}</td>
			
		</tr>
		<tr>
			<td>기본주소</td>
			<td>${byOrder.addr.addr1}</td>
		</tr>
		<tr>

			<td>상세주소</td>
			<td>${byOrder.addr.addr2}</td>
		</tr>
	</table>
</form>
</body>
</html>
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
	<h2>mybatis/detail</h2>
	
	<table border="">
		<tr>
			<th>번호</th>
			<td>${data.id }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${data.title }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${data.pname }</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${data.reg_dateSdf}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${data.cnt }</td>
		</tr>
		<tr>
			<th>파일</th>
			<td>${data.upfile }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${data.contentBr }</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<button><a href="deleteForm?id=${data.id }">삭제</a></button>
				<button><a href="modifyForm?id=${data.id }">수정</a></button>
				<button><a href="list">돌아가기</a></button>
			</td>
		</tr>
	</table>
	
</body>
</html>
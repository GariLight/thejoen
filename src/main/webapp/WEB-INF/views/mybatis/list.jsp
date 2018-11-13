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
	<h2>mybatis/list</h2>
	<table border="">
		<tr>
			<form action="">
				<td colspan="5" align="center">
					제목 : <input type="text" name="serch" />
					<input type="submit" value="검색" />
				</td>
			</form>
		</tr>	
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수
				<form action="">
					<input type="text" name="cnt" size="3" maxlength="3"/>
					<input type="radio" name="cntType" value=">=" checked="checked">이상
					<input type="radio" name="cntType" value="<=">이하
					<input type="submit" value="검색" />
				</form>
			</th>
		</tr>
		<c:forEach items="${data }" var="dd" varStatus="no">	
		<tr>
			<td>${dd.id }</td>
			<td><a href="detail?id=${dd.id }">${dd.title }</a></td>
			<td>${dd.pname }</td>
			<td>${dd.reg_dateSdf }</td>
			<td>${dd.cnt }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="right">
				<button><a href="insertForm">글쓰기</a></button>
				<button><a href="insertMulti">연속글쓰기</a></button>
				<button><a href="insertError">에러글쓰기</a></button>
			</td>
			
		</tr>
	</table>
	
</body>
</html>
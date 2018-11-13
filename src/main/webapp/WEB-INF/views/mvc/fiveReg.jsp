<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>다섯째결과 입니다</p>
	
	<p>
	<h3>st</h3>
	이름 : ${st.name } <br />
	국어 : ${st.jum[0] } <br />
	수학 : ${st.jum[1] } <br />
	영어 : ${st.jum[2] } <br />
	</p>
	<p>
	<h3>exam</h3>
	이름 : ${exam.name } <br />

	<c:forEach items="${exam.jum}" var="jj" varStatus="status">
		${exam.subject[status.index] } : ${jj} <br />
	
	</c:forEach>
	<hr>
		국어 : ${exam.jum[0] } <br />
		수학 : ${exam.jum[1] } <br />
		영어 : ${exam.jum[2] } <br />
	</p>
	
	
</body>
</html>
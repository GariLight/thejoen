<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript">
		
	
	</script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>닉네임입니다 : ${nick }
<p>안녕하세요 ${welcome }입니다.</p>
<h2>관리자</h2>
<a href="admin/main">어드민메인</a>
<h2>etc</h2>
<a href="validate">validate</a>
<a href="interceptor/event">interceptor</a>
<h2>request</h2>
<a href="mvc/frist">frist</a> <br />
<a href="mvc/sec">sec</a> <br />
<a href="mvc/thrid">thrid</a> <br />
<a href="mvc/thrid2">thrid2</a> <br />
<a href="mvc/thrid3">thrid3</a> <br />
<a href="mvc/four?name=포빈">four</a> <br />
<a href="mvc/five">five</a> <br />
<hr>
<a href="mvc/byOrder">byOrder</a> <br />
<a href="mvc/fileUpload">fileUpload</a> <br />
<h2>model</h2>
<a href="model/detail">detail</a> <br />
<a href="model/list">list</a> <br />
<a href="model/insert">insert</a> <br />
<h2>actor</h2>
<a href="actor/detail">detail</a> <br />
<a href="actor/list?key=m">list</a> <br />
<a href="actor/insert">insert</a> <br />
<hr>
<h2>session</h2>
<a href="session/make">session/make</a>
<a href="session/view">session/view</a>
<a href="session/modify">session/modify</a>
<a href="session/delete">session/delete</a>
<h2>cookie</h2>
<a href="cookie/make">cookie/make</a>
<a href="cookie/view">cookie/view</a>
<a href="cookie/modify">cookie/modify</a>
<a href="cookie/delete">cookie/delete</a>
<hr />
<h2>path : ppp/{userId}/aaa/{no}</h2>
<a href="ppp">ppp</a> <br />
<a href="ppp/aaa">ppp/aaa</a> <br />
<a href="ppp/{userId}/aaa/{no}">ppp/{userId}/aaa/{no}</a> <br />
<a href="ppp/abcd/aaa/123">ppp/abcd/aaa/123</a> <br />
<a href="ppp/abcd/aaa/123/plus">ppp/abcd/aaa/123/plus</a> <br />
<a href="ppp/qwer/aaa/456">ppp/qwer/aaa/456</a> <br />
<a href="ppp/zxcv/aaa/asdf">ppp/zxcv/aaa/asdf</a> <br />
<hr>
<h2>mybatis</h2>
<a href="mybatis/list">list</a>

</body>
</html>

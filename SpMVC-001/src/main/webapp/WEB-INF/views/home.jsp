<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<c:set var="join" value="${rootPath}/user/join"/>
<c:set var="login" value="${rootPath}/user/login"/>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
  	<header class="main">
    <h1>HI</h1>
    </header>
    <nav class="main">
	    <ul>
		    <li><a href="${rootPath}/">홈</a></li>
		    <li><a href="${login}">로그인</a></li>
		    <li><a href="${join}">회원가입</a></li>
	    </ul>
    </nav>
  </body>
</html>

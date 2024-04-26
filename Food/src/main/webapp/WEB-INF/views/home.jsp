<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<script src="${rootPath}/static/js/main_nav.js?2024-04-19"></script>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <h1>홈화면</h1>
    <ul>
    	<li><a href="${rootPath}/random">랜덤돌리러가기</a></li>
    </ul>
  </body>
</html>

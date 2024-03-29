<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>여기는 제목</title>
</head>
<body>
	<h1>상품정보 등록</h1>
	<h3></h3>
	<form method="POST">
		<div><input placeholder="코드" name="p_code" value=""/></div>
		<div><input placeholder="이름" name="p_name" value=""/></div>
		<div><input placeholder="상품" name="p_item" value=""/></div>
		<div><input placeholder="가격" name="p_price" value=""/></div>
		<div><input type="submit" value="저장"/></div>
	</form>

</body>
</html>
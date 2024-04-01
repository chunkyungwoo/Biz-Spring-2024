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
<style>
	form.list {
	width: 60%;
	padding: 10px;
	margin: 10px auto;
	div{
	display: flex;
	input{
	flex: 1;
	text-align:center;
	}
	input{
	flex: 2;
	}
	}
	}
</style>
<body>
	<h1 class="w3-center">등록</h1>
	<h3>${MSG}</h3>
		<form method="POST" class="list">
			<div><input placeholder="SEQ" name="seq" value="${IO.seq}"/></div>
			<div><input placeholder="일자" name="io_date" value="${IO.io_date}"/></div>
			<div><input placeholder="시각" name="io_time" value="${IO.io_time}"/></div>
			<div><input placeholder="상품명" name="io_pname" value="${IO.io_pname}"/></div>
			<div><input placeholder="구분" name="io_input" value="${IO.io_input}"/></div>
			<div><input placeholder="단가" name="io_price" value="${IO.io_price}"/></div>
			<div><input placeholder="수량" name="io_quan" value="${IO.io_quan}"/></div>
			<div><input placeholder="합계" name="io_total" value="${IO.io_total}"/></div>
			<div><input type="submit" value="저장" /></div>
		</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/includes/head.jspf" %>
<style>
	div.w3-card-4{
	width: 50%;
	margin: 20px auto;
	}
</style>
<script>
	const msg = "${MSG}"
	if(msg === "NOT"){
		alert("삭제할수없음")
	}else if(msg === "FK"){
		alert("삭제할수 없음")
	}
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/iolist.js?2024-04-01-001"></script>
<body>
<%@ include file= "/WEB-INF/views/includes/header.jspf" %>
	<main class="w3-container">
		<div class="w3-card-4">
			<div class="w3-container w3-center">
				<h3>상품명 : ${IO.io_pname}</h3>
				<h5>SEQ : ${IO.seq}</h5>
				<h5>일자 : ${IO.io_date}</h5>
				<h5>시각 : ${IO.io_time}</h5>
				<h5>구분 : ${IO.io_input}</h5>
				<h5>판매단가 : ${IO.io_price}</h5>
				<h5>수량 : ${IO.io_quan}</h5>
				<h5>합계 : ${IO.io_total}</h5>
				<div class="w3-section">
					<input data-seq="${IO.seq}" type="button" value="수정" class="btn_update w3-button w3-blue"/>
					<input date-seq="${IO.seq}" type="button" value="삭제" class="btn_delete w3-button w3-red"/>
				</div>
			</div>
		</div>
	</main>
</body>
</html>
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
		alert("삭제할수없음 관리자 문의")
	}else if(msg === "FK"){
		alert("삭제할수 없음")
	}
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/product.js?2024-03-29-002"></script>
<body>
	<%@ include file= "/WEB-INF/views/includes/header.jspf" %>
	
	<main class="w3-container">
		<div class="w3-card-4 w3-dark-gray">
			<div class="w3-container w3-center" >
				<h3>${PRODUCT.p_name}</h3>
				<img src="${rootPath}/static/images/user.png" width="80%" alt="avatar">
				<h5>${PRODUCT.p_code }</h5>
				<h5>${PRODUCT.p_item }</h5>
				<h5>${PRODUCT.p_price }</h5>
				<div class="w3-section">
					<input data-pcode="${PRODUCT.p_code}" 
					type="button" value="수정" class="btn_update w3-button w3-green"/>
					<input data-pcode="${PRODUCT.p_code}" 
					type="button" value="삭제" class="btn_delete w3-button w3-red"/>
				</div>
			</div>
		</div>
	</main>
</body>
</html>
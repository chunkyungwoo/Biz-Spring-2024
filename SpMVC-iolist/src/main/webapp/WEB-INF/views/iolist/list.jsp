<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="ko">
<%@ include file="/WEB-INF/views/includes/head.jspf" %>
	<style>
		table.w3-table-all{
		width: 70%;
		margin: 10px auto;
		tr:hover{
		cursor: pointer;
		}
		}
		div.btn_box{
		width: 70%;
		margin: 5px auto;
		text-align: right;
		padding: 0;
		}
	</style>
	<script>
		const rootPath = "${rootPath}"
	</script>
	<script src="${rootPath}/static/js/iolist.js?2024-04-01-001"></script>
<body>
	<%@ include file="/WEB-INF/views/includes/header.jspf" %>
	<div class="w3-conainer btn_box">
		<a href="iolist/insert" class="w3-button w3-black w3-round-large" >등록하기</a>
	</div>
	<div class="w3-container w3-padding-24 w3-center">
		<table class="w3-table-all w3-hoverable">
			<thead>
				<tr>
					<th>SEQ</th>
					<th>일자</th>
					<th>시각</th>
					<th>상품명</th>
					<th>구분</th>
					<th>단가</th>
					<th>수량</th>
					<th>합계</th>
				</tr>
			</thead>
			<tbody class="iolist_body">
				<c:forEach items="${IO_LIST}" var="IO" varStatus="VAR">
					<tr data-seq = "${IO.seq}">
						<td>${IO.seq}</td>
						<td>${IO.io_date}</td>
						<td>${IO.io_time}</td>
						<td>${IO.io_input}</td>
						<td>${IO.io_pname}</td>
						<td>${IO.io_price}</td>
						<td>${IO.io_quan}</td>
						<td>${IO.io_total}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="ko">
<%@ include file="/WEB-INF/views/includes/head.jspf" %>
  <body>
    <%@ include file="/WEB-INF/views/includes/header.jspf" %>
    <div>
    	<table class="w3-table-all w3-container">
    		<tr>
    			<th>코드</th>
    			<th>이름</th>
    			<th>상품</th>
    			<th>가격</th>
    		</tr>
    		<c:forEach items="${PRODUCT_LIST }" var="PRODUCT">
    			<tr>
    				<th>${PRODUCT.p_code}</th>
    				<th>${PRODUCT.p_name}</th>
    				<th>${PRODUCT.p_item}</th>
    				<th>${PRODUCT.p_price}</th>
    			</tr>
    		</c:forEach>
    	</table>
    	<div class="w3-container w3-button">
    		<a href="product/insert">상품추가</a>
    	</div>
    </div>

</body>
</html>
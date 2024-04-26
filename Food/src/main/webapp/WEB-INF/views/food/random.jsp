<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${rootPath}/static/css/random.css?2024-04-18-008">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<script src="${rootPath}/static/js/random.js?2024-04-26-003"></script>
<title>Random Food Selector</title>
</head>
<body>
	<div class="container">
		<h1>랜덤돌림판</h1>
		<div class="roulette-container">
			<div class="roulette">
				<div class="arrow"></div>
				<ul class="food-list">
					<li>Pizza</li>
					<li>Burger</li>
					<li>Sushi</li>
					<li>Pasta</li>
					<li>Salad</li>
					<li>Taco</li>
					<li>Sandwich</li>
					<li>Steak</li>
					<li>Ramen</li>
					<li>Fried Chicken</li>
				</ul>
			</div>
		</div>
		<button id="randomButton">돌려</button>
	</div>
</body>
</html>
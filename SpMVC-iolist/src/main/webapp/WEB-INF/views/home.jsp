<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<c:set var="join" value="${rootPath}/user/join"/>
<c:set var="login" value="${rootPath}/user/login"/>
<!DOCTYPE html>
<html lang="ko">
<%@ include file="/WEB-INF/views/includes/head.jspf" %>
  <body>
    <%@ include file="/WEB-INF/views/includes/header.jspf" %>
  </body>
</html>
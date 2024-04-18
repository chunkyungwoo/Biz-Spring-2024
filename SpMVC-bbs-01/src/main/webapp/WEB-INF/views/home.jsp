<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
	<tiles:insertAttribute name="head"/>
  <body>
  	<tiles:insertAttribute name="header"/>
  	<tiles:insertAttribute name="nav"/>
    <tiles:insertAttribute name="content"/>
  </body>
</html>

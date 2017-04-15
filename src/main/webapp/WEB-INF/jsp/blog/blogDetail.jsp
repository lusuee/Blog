<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
	.title{
		text-align: center;
		font-size: 18px;
		font-family: sans-serif;
	}
</style>

<title><c:out value="${blog.title }"></c:out></title>
</head>
<body>
	<jsp:include page="../general/head.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-md-12 title">
				<c:out value="${blog.title }"></c:out>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6"><c:out value="${blog.author }"></c:out></div>
			<div class="col-md-6"><c:out value="${blog.author }"></c:out></div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<c:out escapeXml="false" value="${blog.content }"></c:out>
			</div>
		</div>
	</div>
</body>
</html>
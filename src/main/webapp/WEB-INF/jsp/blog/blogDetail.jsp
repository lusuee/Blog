<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
	.title{
		text-align: center;
		font-family: sans-serif;
	}
	.other{
		vertical-align: middle;
		margin: 10px 0 15px;
		font-size: 15px;
	}
</style>

<title><c:out value="${blog.title }"></c:out></title>
</head>
<body>
	<jsp:include page="../general/head.jsp"></jsp:include>
	<div class="container">
		<div class="row title">
			<div class="col-md-12">
				<h2><c:out value="${blog.title }"></c:out></h2>
			</div>
		</div>
		<div class="row other">
			<div class="col-md-2"></div>
			<div class="col-md-4" style="text-align: right;"><c:out value="${blog.label.labelName }"></c:out></div>
			<div class="col-md-4"><c:out value="${blog.createdatetime }"></c:out></div>
			<div class="col-md-2"></div>
		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<c:out escapeXml="false" value="${blog.content }"></c:out>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>
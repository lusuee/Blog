<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../general/head.jsp"></jsp:include>
	<div class="container">
		<div style="float:right;">
			<a class="btn btn-default" href="${pageContext.request.contextPath }/blog/add">新增</a>
		</div>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>标题</th>
					<th>时间</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${blogList }" var="blog">
					<tr>
						<td><c:out value="${blog.title }"></c:out></td>
						<td><c:out value="${blog.comment }"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
</body>
</html>
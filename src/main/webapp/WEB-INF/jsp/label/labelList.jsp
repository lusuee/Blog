<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../general/head.jsp"></jsp:include>
	<div class="container">
		<div style="float: right;">
			<a class="btn btn-default" href="${pageContext.request.contextPath }/blog/add">新增</a>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th>标签名称</th>
					<th>标签描述</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${labelList }" var="label">
					<tr>
						<td><c:out value="${label.labelName }"></c:out></td>
						<td><c:out value="${label.labelDescription }"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="general/head.jsp"></jsp:include>
	<table>
		<c:forEach items="${movieList }" var="movie">
			<tr>
				<td><a href="${movie.id }"><c:out value="${movie.name }"></c:out></a></td>
				<td><a href="${movie.id }"><c:out value="${movie.description }"></c:out></a></td>
			</tr>
		</c:forEach>
	</table>
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
</body>
</html>

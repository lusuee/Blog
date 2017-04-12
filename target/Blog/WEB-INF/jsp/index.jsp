<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

	<h1>Hello World!</h1>
	
	<table>
		<c:forEach items="${movieList }" var="movie">
			<tr>
				<td><a href="${movie.id }"><c:out value="${movie.name }"></c:out></a></td>
				<td><a href="${movie.id }"><c:out value="${movie.description }"></c:out></a></td>
			</tr>
		</c:forEach>
	</table>
		
	
</body>
</html>

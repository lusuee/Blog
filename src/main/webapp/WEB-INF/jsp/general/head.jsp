<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-default navbar-inverse">
	  <div class="container">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">首页</a>
	      <a class="navbar-brand" href="${pageContext.request.contextPath }/blog">博客</a>
	      <!-- 
	      <ul class="nav navbar-nav">
	      	<li class="dropdown">
	      		<a href="${pageContext.request.contextPath }/blog" class="dropdown-toggle navbar-brand" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">博客</a>
	      		<ul class="dropdown-menu">
	      			<li>标签</li>
	      		</ul>
	      	</li>
	      </ul>
	       -->
	      <a class="navbar-brand" href="#">电影</a>
	      <a class="navbar-brand" href="#">游戏</a>
	    </div>
	  </div>
	</nav>
</body>
</html>
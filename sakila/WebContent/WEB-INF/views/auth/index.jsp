<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index.jsp</title>
	</head>
	<body>
		<h1>index.jsp</h1>
		<div>
			<span>${loginStaff.email}</span> 관리자님
		</div>
		<div>
			<a href="${pageContext.request.contextPath}/auth/LogoutServlet">로그아웃</a>
		</div>
	</body>
</html>
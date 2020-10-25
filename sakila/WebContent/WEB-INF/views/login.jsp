<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<div >
	<div >
		오늘 접속자 수 : ${map["returnStats"].cnt} / 총 접속자 수 : ${map["totalStats"]}
	</div>
	<form method="post" class="form-group col-md-4" action="${pageContext.request.contextPath}/LoginServlet">
		<table>
			<tr>
				<td>
					<input type="text" name="id" >
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="password" >
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit" >Log-in</button>
				</td>
			</tr>
		</table>
	</form>
</div>
	
</body>
</html>
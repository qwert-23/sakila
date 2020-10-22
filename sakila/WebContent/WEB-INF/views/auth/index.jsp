<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
		<h1>index</h1>	
		<div>
			<span>${loginStaff.email}</span>
		</div>

		<div>
				<a href ="${pageContext.request.contextPath}/auth/LogoutServite">로그아웃  </a>   
					
		</div>

</body>
</html>
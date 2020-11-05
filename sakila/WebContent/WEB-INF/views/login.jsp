<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	



</script>
</head>
<body>

<div >
	<div >
		오늘 접속자 수 : ${map["returnStats"].count}  
	</div>
	<div>
		총 접속자 수 : ${map["totalStats"].count}	
	</div>
	<form method="post"  action=" ${pageContext.request.contextPath}/LoginServlet ">
		<table>
			<tr>
				<td>
					<input type="text" name="Email" id="Email" > 
					<span id="eMsg" ></span>
		
					<!-- 로그인 화면에 버튼만누르면 index 이동-->
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="password" id="password"  >
					<span  id = "pwMsg"></span>
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit" id = "clickBtn" >로그인 </button>
				</td>
			

				
			</tr>
		</table>
	</form>
</div>
	
</body>
</html>
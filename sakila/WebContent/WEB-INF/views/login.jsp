<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	
	
$(document).ready(function(){	
	if ($('#Email') == null ){
		alert('Emaill을 입력하세요')
	
	}else if($('#password') == null){
		alert('password를 입력하세요 ')
	}   

});

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
					<input type="text" name="Email" value="Mike.Hillyer@sakilastaff.com " > 
					<!-- 로그인 화면에 버튼만누르면 index 이동-->
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="password" value ="1234" >
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/*
	 자동으로 동작되는 form태그의 submit을 중지 가능하다.
	==> event.preventDefault(); 
	*/
	
	function fun1(){
		if(false){  //아이디와 비번 모두 입력이라고 가정
			
		}
		else{
			alert("아이디와 비번 모두 필수 정보");
			event.preventDefault(); //넘어가지 않음
		}
	}
</script>
</head>
<body>
<form action="login" onsubmit="fun1()">
아이디: <input type="text" name="userid"><br>
비번: <input type="text" name="passwd"><br>
<input type="submit" name="로그인">
</form>
</body>
</html>
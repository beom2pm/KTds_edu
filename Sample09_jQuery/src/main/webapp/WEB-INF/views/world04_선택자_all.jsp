<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	
	//jQuery에서 DOM(html) 선택하는 방법: 선택자 이용
	//주의할 점: 가지고 온 값이 jquery 객체인지 javascript 객체인지 구별 필요
	$(document).ready(function(){
		
		//모든 태그 선택
		var x = $("*");
		console.log(x);
		console.dir(x);
		x.css("color","red");
	});
	
</script>
</head>
<body>
	<h1>world</h1>
	<p>hello</p>
</html>
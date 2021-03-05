<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	//xx.fn.init 형태는 jquery 객체이다.
	$(document).ready(function() {

		/*
			2차 필터링
			1. 선택자 이용해서 일치하는 요소를 선택(1차필터링)한 후에
			추가로 요소를 선택(2차필터링)하는 방법
			
			1) .eq(n) : n=> index
			2) .filter(dom선택자) : 지정된 dom 필터링
			3) .not(dom선택자) : 지정된 dom과 일치하지 않는 필터링
			4) .has(dom선택자) : 지정된 dom을 포함하는 요소
		*/
		
		$("li").has("ul").css("color","red");
	});
	
</script>
</head>
<body>
	<ul>
		<li>A1</li>
		<li>A2</li>
		<li class="my">A3</li>
		<li>A4</li>
		<li id="xyz">A5</li>
		<li class="my">A6</li>
		<li>A7
			<ul>
				<li>x</li>
				<li>x2</li>
			</ul>
		</li>
	</ul>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Enrollment</title>
</head>
<body>
	<section id="container">
		<h2>ȸ������</h2>	
		<form action="userEnroll" method="post">
			<div class="form-group">
				<label for="usersId">���̵�</label> 
				<input type="text" class="form-control" id="usersId" name="usersId">
				<button id="checkId">�ߺ�Ȯ��</button>
			</div>
			<div class="form-group">
				<label for="usersPassword">��й�ȣ</label> 
				<input type="password" class="form-control" id="usersPassword" name="usersPassword">
			</div>
			<div class="form-group">
				<label for="checkPassword">��й�ȣ Ȯ��</label> 
				<input type="password" class="form-control" id="checkPassword" name="checkPassword">
			</div>
			<div class="form-group">
				<label for="usersName">�̸�</label> 
				<input type="text" class="form-control" id="usersName" name="usersName">
			</div>
			<div class="form-group">
				<label for="usersNickname">�г���</label> 
				<input type="text" class="form-control" id="usersNickname" name="usersNickname">
				<button id="checkNickname">�ߺ�Ȯ��</button>
			</div>
			<div class="form-group">
				<label for="usersTel">�޴��� ��ȣ</label> 
				<input type="text" class="form-control" id="usersTel" name="usersTel">
			</div>
			<div class="form-group">
				<label for="usersAddress">�ּ�</label>
				<input type="text" class="form-control" id="usersAddress" name="usersAddress">
				<button id="findAddress">�ּ�ã��</button>
			</div>
			<div class="form-group">
				<label for="userTel">�̸���</label> 
				<input type="text" class="form-control" id="userTel" name="userTel">
			</div>
			<button type="submit">�Ϸ�</button>
		</form>
	</section>

</body>
</html>
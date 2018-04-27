<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>登陆界面</title>
</head>
<body>
	<div class="text" style=" text-align:center;"><h2>登陆界面</h2></div>
	<div class="text" style=" text-align:center;">
		<table class="table">
			<td><button type="button" onclick="window.location.href='loginUser.jsp'" class="btn btn-primary">用户登陆</button></td>
			<td><button type="button" onclick="window.location.href='loginWorker.jsp'" class="btn btn-success">工作人员登陆</button></td>
			<td><button type="button" onclick="window.location.href='loginAdmin.jsp'" class="btn btn-info">管理员登陆</button></td>
		</table>
	</div>
</body>
</html>
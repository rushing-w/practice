<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>用户界面</title>
</head>
<body>
	<div class="text" style=" text-align:center;"><h2>用户主界面</h2></div>
	<div class="text" style=" text-align:center;">
		<table class="table">
			<td><button type="button" onclick="window.location.href='userInfo.jsp'" class="btn btn-primary">查看个人信息</button></td>
			<td><button type="button" onclick="window.location.href='modUser.jsp'" class="btn btn-success">修改个人信息</button></td>
		</table>
	</div>
	<div class="text" style=" text-align:center;">
		<table class="table">
			<td><button type="button" onclick="window.location.href='saveMoney.jsp'" class="btn btn-info">存钱</button></td>
			<td><button type="button" onclick="window.location.href='withdrawMoney.jsp'" class="btn btn-info">取钱</button></td>
			<td><button type="button" onclick="window.location.href='loanMoney.jsp'" class="btn btn-danger">贷款</button></td>
		</table>
	</div>
</body>
</html>
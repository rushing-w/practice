<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>工作人员界面</title>
</head>
<body>
	<div class="text" style=" text-align:center;"><h2>工作人员主界面</h2></div>
	<div class="text" style=" text-align:center;">
		<table class="table">
			<td><button type="button" onclick="window.location.href='queryAllUser.jsp'" class="btn btn-primary">查询所有用户信息</button></td>
			<td><button type="button" onclick="window.location.href='queryOneUser.jsp'" class="btn btn-primary">查询单个用户信息</button></td>
			<td><button type="button" onclick="window.location.href='modUserCredit.jsp'" class="btn btn-success">修改用户信誉值</button></td>
			<td><button type="button" onclick="window.location.href='deleteUser.jsp'" class="btn btn-danger">删除用户信息</button></td>
			<td><button type="button" onclick="window.location.href='handleLoanApply.jsp'" class="btn btn-warning">处理贷款申请</button></td>
		</table>
	</div>
</body>
</html>
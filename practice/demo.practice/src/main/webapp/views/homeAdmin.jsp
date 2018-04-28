<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>管理员界面</title>
</head>
<body>
	<div class="text" style=" text-align:center;"><h2>管理员界面</h2></div>
	<div class="text" style=" text-align:center;">
		<table class="table">
			<td><button type="button" onclick="window.location.href='addWorker.jsp'" class="btn btn-info">添加员工信息</button></td>
			<td><button type="button" onclick="window.location.href='queryAllWorker.jsp'" class="btn btn-primary">查询所有员工信息</button></td>
			<td><button type="button" onclick="window.location.href='queryOneWorker.jsp'" class="btn btn-primary">查询单个员工信息</button></td>
			<td><button type="button" onclick="window.location.href='modWorker.jsp'" class="btn btn-success">修改员工信息</button></td>
			<td><button type="button" onclick="window.location.href='deleteWorker.jsp'" class="btn btn-danger">删除员工信息</button></td>
			<td><button type="button" onclick="window.location.href='dealLoanApply.jsp'" class="btn btn-warning">批复贷款申请</button></td>
			<td><button type="button" onclick="window.location.href='viewTotalMoney.jsp'" class="btn btn-default">查看银行当前资金流动</button></td>
		</table>
	</div> 
</body>
</html>
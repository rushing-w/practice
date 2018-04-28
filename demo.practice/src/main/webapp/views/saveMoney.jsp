<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>用户存款界面</title>
</head>
<body>
	<div class="text" style=" text-align:center;"><h2>用户存款</h2></div>
	<div class="text" style=" text-align:center;">
		<form class="form-horizontal" action="/saveMoney" method="post">
			<input type="text" name="idNum" placeholder="请输入您的身份证号">
		 	<input type="text" name="amount" placeholder="请输入将要存入的金额">
		 	<input type="submit" value="确认">
		 	<input type="reset" value="取消">
		</form>  
	</div>
</body>
</html>
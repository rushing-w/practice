<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>用户登陆</title>
</head>
<body> 
   <div class="text" style=" text-align:center;"><h2>用户登陆界面</h2></div>
	<div class="text" style=" text-align:center;">
	 <form class="form-inline" role="form"
	 action="${pageContext.request.contextPath}/loginUser.action" method="post">
	  <div class="form-group">
		<label for="IdNum">身份证号</label>
		<input type="idNum" class="form-control" id="idNum" placeholder="IdNum">
	  </div>
	  <div class="form-group">
		<label for="Password">密码</label>
		<input type="password" class="form-control" id="password" placeholder="Password">
	  </div>
	  <button type="submit" class="btn btn-default">登陆</button>
	  <button type="submit" class="btn btn-default">注册</button>
	 </form>
	</div>

</body>
</html>
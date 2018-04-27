<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>员工登录</title>
</head>
<body>
	<div class="text" style=" text-align:center;"><h2>工作人员登陆界面</h2></div>
	<div class="text" style=" text-align:center;">
	 <form class="form-inline" role="form"
	 action="${pageContext.request.contextPath}/loginWorker.action" method="post">
	  <div class="form-group">
		<label for="JobNum">工号</label>
		<input type="jobnum" class="form-control" id="JobNum" placeholder="JobNum">
	  </div>
	  <div class="form-group">
		<label for="Password">密码</label>
		<input type="password" class="form-control" id="Password" placeholder="Password">
	  </div>
	  <button type="submit" class="btn btn-default">登陆</button>
	 </form>
	</div>

</body>
</html>
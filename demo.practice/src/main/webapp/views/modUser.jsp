<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>用户修改界面</title>
</head>
<body>
<div class="text" style=" text-align:center;"><h2>用户修改信息界面</h2></div>
  <div class="text" style=" text-align:center;">
	<p>请按照提示输入需要修改的信息:</p>
	<form class="form-horizontal">
	  <div class="control-group">
		<div class="controls">
		  <p>姓名:<input type="text" name="name" placeholder="Name"></p>
		</div>
	  </div>
	  <div class="control-group">
		<div class="controls">
		  <p>性别:<select name="selectSex"><option value="男">男</option><option value="女">女</option></select></p>
		</div>
	  </div>
	  <div class="control-group">
		<div class="controls">
		  <p>年龄:<input type="text" name="age" placeholder="Age"></p>
		</div>
	  </div>
	  <div class="control-group">
		<div class="controls">
		  <p>电话:<input type="text" name="telNum" placeholder="TelNum"></p>
		</div>
	  </div>
	  <div class="control-group">
		<div class="controls">
		  <p>密码:<input type="text" name="password" placeholder="Password"></p>
		</div>
	  </div>
	  <div class="control-group">
		<div class="controls">
		  <button type="submit" class="btn">确认</button>
		  <button type="reset" class="btn">取消</button>
		</div>
	  </div>
	</form>
  </div>
</body>
</html>
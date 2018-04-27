<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>修改用户信誉值界面</title>
</head>
<body>
	<div class="text" style=" text-align:center;"><h2>工作人员修改用户信誉值界面</h2></div>

  <div class="text" style=" text-align:center;">
	<form class="form-horizontal">
	  <p>请输入需要修改的用户身份证号:</p>
	  <div class="control-group">
		<div class="controls">
		  <p>身份证号:<input type="text" name="idNum" placeholder="IdNum"></p>
		</div>
	  </div>

	  <p>请输入将要修改的用户信誉值:</p>
	  <div class="control-group">
		<div class="controls">
		  <p>信誉值:<input type="text" name="credit" placeholder="Credit"></p>
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
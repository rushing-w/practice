<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>删除用户信息界面</title>
</head>
<body>
   <div class="text" style=" text-align:center;"><h2>工作人员删除用户信息界面</h2></div>
   <div class="text" style=" text-align:center;">
    <p>请输入需要删除的用户的身份证号:</p>
    <form class="form-search" action="/deleteUser" method="post">
	 <input type="text" name="idNum" class="input-medium search-query">
 	 <button type="submit" class="btn">删除</button>
 	 <button type="reset" class="btn">取消</button>
    </form>
   </div>
</body>
</html>
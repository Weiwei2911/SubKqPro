<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入JQuery -->
<script  type="text/javascript" src="static/js/jquery-2.0.0.min.js"></script>
<!-- 引入layui前端框架 -->
<link rel="stylesheet" href="static/layui-v2.3.0/layui/css/layui.css">
<script src="static/layui-v2.3.0/layui/layui.js"></script>
</head>
<body>
	 <h1>Login Page</h1>
	 <form action="shiro/login" method="post">
	     username:<input type="text" name="username"/>
	     <br><br>
	     password:<input type="password" name="password">
	     <br><br>
	     <input type="submit"  value="Submit">
	     <button type="button" class="layui-btn layui-btn-fluid">流体按钮（最大化适应）</button>
	 </form>
</body>
</html>
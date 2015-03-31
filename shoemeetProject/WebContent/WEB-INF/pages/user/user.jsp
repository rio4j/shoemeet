<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户</title>
</head>
<body>
	<form id="userForm" action="${pageContext.request.contextPath}/user/addUser.do">
		<label>用户名：</label><input id="username" name="username"><br/>
		<label>密　码：</label><input id="password" name="password"><br/>
		<input type="submit" value="提交"><br/>
	</form>
</body>
</html>
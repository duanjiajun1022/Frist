<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
	<form action="getUpd" method="post">
		id<input type="text" readonly="readonly" value="${list.id }" name="id" />
		姓名<input type="text" value="${list.name}" name="name" /> <input
			type="submit">
	</form>
</html>

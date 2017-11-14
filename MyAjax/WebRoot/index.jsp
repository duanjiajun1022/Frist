<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

</head>

<body>
	<%-- <select>
		<option selected="selected">请选择</option>
		<c:forEach items="${list }" var="h">
			<option value="${item.id }">${item.name }</option>
		</c:forEach>
	</select> --%>

	<c:forEach items="${list }" var="h">
		${h.id }
		${h.name }
		<button value="${h.id}">删除</button>
		<a href="getList?id=${h.id}">修改</a>
		<br />
	</c:forEach>
</body>
<script type="text/javascript">
	$(function() {
		$('button').click(function() {
			var result = confirm('是否删除');

			if (result == true) {
				var abc = $(this).val();
				$.post('getDel', 'id=' + abc, function(data) {
					if (data == 'true') {
						alert('删除成功');
						location.href = 'getAll';
					} else {
						alert('删除失败');
					}
				});
			}
		});
	});
</script>
</html>

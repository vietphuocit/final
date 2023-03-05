<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Chu</title>
</head>
<body>
	<ul>
		<li><a href='<c:url value='/trang-chu?action=them-moi' />'>Thêm
				mới hoạt động</a></li>
		<li><a href='<c:url value='/trang-chu?action=danh-sach' />'>Danh
				sách hoạt động</a></li>
	</ul>
</body>
</html>
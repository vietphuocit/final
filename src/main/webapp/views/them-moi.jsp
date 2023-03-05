<%@ page language='java' contentType='text/html; charset=UTF-8'
	pageEncoding='UTF-8'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Trang Chu</title>
</head>
<body>
	<h1>Thêm mới 1 hoạt động thiện nguyện</h1>
	<form action='<c:url value='/trang-chu?action=them-moi'/>' method='post'  accept-charset='UTF-8'>
		<label>Tên hoạt động</label>
		<input type='text' name='tenHD' />
		<br>
		<label>Mô tả</label>
		<input type='text' name='moTaHD'/>
		<br>
		<label>Ngày giờ bắt đầu</label>
		<input type='datetime-local' name='ngayGioBD'/>
		<br>
		<label>Ngày giờ kết thúc</label>
		<input type='datetime-local' name='ngayGioKT'/>
		<br>
		<label>Số lượng tối thiểu yêu cầu</label>
		<input type='number' name='SLToiThieuYC'/>
		<br>
		<label>Số lượng tối đa yêu cầu</label>
		<input type='number' name='SLToiDaYC'/>
		<br>
		<label>Thời hạn đăng ký</label>
		<input type='datetime-local' name='thoiHanDK'/>
		<br>
		<label>Trang thái</label>
		<input type='text' name='trangThai'/>
		<br>
		<label>Mã trưởng đoàn</label>
		<input type='text' name='maTV'/>
		<br>
		<input type='submit' value='thêm'>
	</form>
</body>
</html>
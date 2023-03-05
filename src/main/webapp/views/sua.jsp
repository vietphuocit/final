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
	<form action='<c:url value='/trang-chu?action=sua'/>' method='post'  accept-charset='UTF-8'>
		<input style='display: none;' type='text' name='maHD' value='${ hoatDong.maHD }'/>
		<label>Tên hoạt động</label>
		<input type='text' name='tenHD' value='${ hoatDong.tenHD }'/>
		<br>
		<label>Mô tả</label>
		<input type='text' name='moTaHD' value='${ hoatDong.moTaHD }'/>
		<br>
		<label>Ngày giờ bắt đầu</label>
		<input type='datetime-local' name='ngayGioBD' value='${ hoatDong.ngayGioBD }'/>
		<br>
		<label>Ngày giờ kết thúc</label>
		<input type='datetime-local' name='ngayGioKT' value='${ hoatDong.ngayGioKT }'/>
		<br>
		<label>Số lượng tối thiểu yêu cầu</label>
		<input type='number' name='SLToiThieuYC' value='${ hoatDong.SLToiThieuYC }'/>
		<br>
		<label>Số lượng tối đa yêu cầu</label>
		<input type='number' name='SLToiDaYC' value='${ hoatDong.SLToiDaYC }'/>
		<br>
		<label>Thời hạn đăng ký</label>
		<input type='datetime-local' name='thoiHanDK' value='${ hoatDong.thoiHanDK }'/>
		<br>
		<label>Trang thái</label>
		<input type='text' name='trangThai' value='${ hoatDong.trangThai }'/>
		<br>
		<label>Mã trưởng đoàn</label>
		<input type='text' name='maTV' value='${ hoatDong.maTV }'/>
		<br>
		<label>Lý do hủy</label>
		<input type='text' name='lyDoHuyHD' value='${ hoatDong.lyDoHuyHD }'/>
		<br>
		<input type='submit' value='Sửa'>
	</form>
</body>
</html>
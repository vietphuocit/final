<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="table-responsive">
		<table class="table">
			<thead>
				<tr>
					<th class='col-md-0 text-center'>Ma</th>
					<th class='col-md-2 text-center'>Ten</th>
					<th class='col-md-2 text-center'>Mo ta</th>
					<th class='col-md-1 text-center'>Ngay DB</th>
					<th class='col-md-1 text-center'>Ngay KT</th>
					<th class='col-md-0 text-center'>SL toi thieu</th>
					<th class='col-md-0 text-center'>SL toi da</th>
					<th class='col-md-1 text-center'>Thoi han DK</th>
					<th class='col-md-1 text-center'>Trang thai</th>
					<th class='col-md-0 text-center'>Ma truong doan</th>
					<th class='col-md-1 text-center'>Thao tac</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ danhSachHD }" var="hoatDong">
					<tr>
						<td>${ hoatDong.maHD }</td>
						<td>${ hoatDong.tenHD }</td>
						<td>${ hoatDong.moTaHD }</td>
						<td>${ hoatDong.ngayGioBD.toLocaleString() }</td>
						<td>${ hoatDong.ngayGioKT.toLocaleString() }</td>
						<td>${ hoatDong.SLToiThieuYC }</td>
						<td>${ hoatDong.SLToiDaYC }</td>
						<td>${ hoatDong.thoiHanDK.toLocaleString() }</td>
						<td>${ hoatDong.trangThai }</td>
						<td>${ hoatDong.maTV }</td>
						<td><a
							href="<c:url value='/trang-chu?action=xoa&maHD=${ hoatDong.maHD }' />">Xóa</a>
							<a
							href="<c:url value='/trang-chu?action=sua&maHD=${ hoatDong.maHD }' />">Sửa</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
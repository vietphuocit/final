package com.fsoft.model;

import java.sql.Timestamp;

public class ThamGia {
	private Long maTV;
	private Long maHD;
	private Timestamp ngayGioDangKy;
	private int diemTruongDoan;
	private int diemTieuChi1;
	private int diemTieuChi2;
	private int diemTieuChi3;
	private String nhanXetKhac;

	public ThamGia() {
		super();
	}

	public ThamGia(Long maTV, Long maHD, Timestamp ngayGioDangKy, int diemTruongDoan, int diemTieuChi1,
			int diemTieuChi2, int diemTieuChi3, String nhanXetKhac) {
		super();
		this.maTV = maTV;
		this.maHD = maHD;
		this.ngayGioDangKy = ngayGioDangKy;
		this.diemTruongDoan = diemTruongDoan;
		this.diemTieuChi1 = diemTieuChi1;
		this.diemTieuChi2 = diemTieuChi2;
		this.diemTieuChi3 = diemTieuChi3;
		this.nhanXetKhac = nhanXetKhac;
	}

	public Long getMaTV() {
		return maTV;
	}

	public void setMaTV(Long maTV) {
		this.maTV = maTV;
	}

	public Long getMaHD() {
		return maHD;
	}

	public void setMaHD(Long maHD) {
		this.maHD = maHD;
	}

	public Timestamp getNgayGioDangKy() {
		return ngayGioDangKy;
	}

	public void setNgayGioDangKy(Timestamp ngayGioDangKy) {
		this.ngayGioDangKy = ngayGioDangKy;
	}

	public int getDiemTruongDoan() {
		return diemTruongDoan;
	}

	public void setDiemTruongDoan(int diemTruongDoan) {
		this.diemTruongDoan = diemTruongDoan;
	}

	public int getDiemTieuChi1() {
		return diemTieuChi1;
	}

	public void setDiemTieuChi1(int diemTieuChi1) {
		this.diemTieuChi1 = diemTieuChi1;
	}

	public int getDiemTieuChi2() {
		return diemTieuChi2;
	}

	public void setDiemTieuChi2(int diemTieuChi2) {
		this.diemTieuChi2 = diemTieuChi2;
	}

	public int getDiemTieuChi3() {
		return diemTieuChi3;
	}

	public void setDiemTieuChi3(int diemTieuChi3) {
		this.diemTieuChi3 = diemTieuChi3;
	}

	public String getNhanXetKhac() {
		return nhanXetKhac;
	}

	public void setNhanXetKhac(String nhanXetKhac) {
		this.nhanXetKhac = nhanXetKhac;
	}

}

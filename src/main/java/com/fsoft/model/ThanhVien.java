package com.fsoft.model;

import java.sql.Timestamp;

public class ThanhVien {
	private Long maTV;
	private String hoTen;
	private String gioiTinh;
	private Timestamp ngaySinh;
	private String diaChiEmail;
	private String soDienThoai;

	public ThanhVien() {
		super();
	}

	public ThanhVien(String hoTen, String gioiTinh, Timestamp ngaySinh, String diaChiEmail, String soDienThoai) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChiEmail = diaChiEmail;
		this.soDienThoai = soDienThoai;
	}

	public Long getMaTV() {
		return maTV;
	}

	public void setMaTV(Long maTV) {
		this.maTV = maTV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Timestamp getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Timestamp ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChiEmail() {
		return diaChiEmail;
	}

	public void setDiaChiEmail(String diaChiEmail) {
		this.diaChiEmail = diaChiEmail;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

}

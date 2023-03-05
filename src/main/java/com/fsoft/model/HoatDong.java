package com.fsoft.model;

import java.sql.Timestamp;

public class HoatDong {
	private Long maHD;
	private String tenHD;
	private String moTaHD;
	private Timestamp ngayGioBD;
	private Timestamp ngayGioKT;
	private int SLToiThieuYC;
	private int SLToiDaYC;
	private Timestamp thoiHanDK;
	private String trangThai;
	private Long maTV;
	private String lyDoHuyHD;

	public HoatDong() {
		super();
	}

	public HoatDong(Long maHD, String tenHD, String moTaHD, Timestamp ngayGioBD, Timestamp ngayGioKT, int sLToiThieuYC,
			int sLToiDaYC, Timestamp thoiHanDK, String trangThai, Long maTV, String lyDoHuyHD) {
		super();
		this.maHD = maHD;
		this.tenHD = tenHD;
		this.moTaHD = moTaHD;
		this.ngayGioBD = ngayGioBD;
		this.ngayGioKT = ngayGioKT;
		SLToiThieuYC = sLToiThieuYC;
		SLToiDaYC = sLToiDaYC;
		this.thoiHanDK = thoiHanDK;
		this.trangThai = trangThai;
		this.maTV = maTV;
		this.lyDoHuyHD = lyDoHuyHD;
	}

	public HoatDong(String tenHD, String moTaHD, Timestamp ngayGioBD, Timestamp ngayGioKT, int sLToiThieuYC,
			int sLToiDaYC, Timestamp thoiHanDK, String trangThai, Long maTV) {
		super();
		this.tenHD = tenHD;
		this.moTaHD = moTaHD;
		this.ngayGioBD = ngayGioBD;
		this.ngayGioKT = ngayGioKT;
		SLToiThieuYC = sLToiThieuYC;
		SLToiDaYC = sLToiDaYC;
		this.thoiHanDK = thoiHanDK;
		this.trangThai = trangThai;
		this.maTV = maTV;
	}

	public Long getMaHD() {
		return maHD;
	}

	public void setMaHD(Long maHD) {
		this.maHD = maHD;
	}

	public String getTenHD() {
		return tenHD;
	}

	public void setTenHD(String tenHD) {
		this.tenHD = tenHD;
	}

	public String getMoTaHD() {
		return moTaHD;
	}

	public void setMoTaHD(String moTaHD) {
		this.moTaHD = moTaHD;
	}

	public Timestamp getNgayGioBD() {
		return ngayGioBD;
	}

	public void setNgayGioBD(Timestamp ngayGioBD) {
		this.ngayGioBD = ngayGioBD;
	}

	public Timestamp getNgayGioKT() {
		return ngayGioKT;
	}

	public void setNgayGioKT(Timestamp ngayGioKT) {
		this.ngayGioKT = ngayGioKT;
	}

	public int getSLToiThieuYC() {
		return SLToiThieuYC;
	}

	public void setSLToiThieuYC(int sLToiThieuYC) {
		SLToiThieuYC = sLToiThieuYC;
	}

	public int getSLToiDaYC() {
		return SLToiDaYC;
	}

	public void setSLToiDaYC(int sLToiDaYC) {
		SLToiDaYC = sLToiDaYC;
	}

	public Timestamp getThoiHanDK() {
		return thoiHanDK;
	}

	public void setThoiHanDK(Timestamp thoiHanDK) {
		this.thoiHanDK = thoiHanDK;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Long getMaTV() {
		return maTV;
	}

	public void setMaTV(Long maTV) {
		this.maTV = maTV;
	}

	public String getLyDoHuyHD() {
		return lyDoHuyHD;
	}

	public void setLyDoHuyHD(String lyDoHuyHD) {
		this.lyDoHuyHD = lyDoHuyHD;
	}

	@Override
	public String toString() {
		return "HoatDong [maHD=" + maHD + ", tenHD=" + tenHD + ", moTaHD=" + moTaHD + ", ngayGioBD=" + ngayGioBD
				+ ", ngayGioKT=" + ngayGioKT + ", SLToiThieuYC=" + SLToiThieuYC + ", SLToiDaYC=" + SLToiDaYC
				+ ", thoiHanDK=" + thoiHanDK + ", trangThai=" + trangThai + ", maTV=" + maTV + ", lyDoHuyHD="
				+ lyDoHuyHD + "]";
	}

}

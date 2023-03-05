package com.fsoft.controller;

import java.io.IOException;
import java.sql.Timestamp;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsoft.dao.IHoatDongDAO;
import com.fsoft.model.HoatDong;
import com.fsoft.utils.FormatUtil;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	IHoatDongDAO hoatDongDAO;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "/views/trang-chu.jsp";
		String action = req.getParameter("action");

		if (action != null) {
			switch (action) {
			case "them-moi":

				path = "views/them-moi.jsp";
				break;

			case "danh-sach":

				req.setAttribute("danhSachHD", hoatDongDAO.findAll());
				path = "views/danh-sach.jsp";
				break;

			case "xoa":

				Long maHD = Long.parseLong(req.getParameter("maHD"));
				hoatDongDAO.delete(maHD);
				req.setAttribute("danhSachHD", hoatDongDAO.findAll());
				path = "views/danh-sach.jsp";
				break;

			case "sua":

				maHD = Long.parseLong(req.getParameter("maHD"));

				req.setAttribute("hoatDong", hoatDongDAO.findOneByMaHD(maHD));
				path = "views/sua.jsp";
				break;
			}
		}

		req.getRequestDispatcher(path).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "/views/trang-chu.jsp";
		String action = req.getParameter("action");

		if (action != null) {
			switch (action) {
			case "them-moi":
				String tenHD = req.getParameter("tenHD");
				String moTaHD = req.getParameter("moTaHD");
				Timestamp ngayGioBD = FormatUtil.stringToTimestamp(req.getParameter("ngayGioBD"));
				Timestamp ngayGioKT = FormatUtil.stringToTimestamp(req.getParameter("ngayGioKT"));
				int SLToiThieuYC = Integer.parseInt(req.getParameter("SLToiThieuYC"));
				int SLToiDaYC = Integer.parseInt(req.getParameter("SLToiDaYC"));
				Timestamp thoiHanDK = FormatUtil.stringToTimestamp(req.getParameter("thoiHanDK"));
				String trangThai = req.getParameter("trangThai");
				Long maTV = Long.parseLong(req.getParameter("maTV"));

				HoatDong hoatDong = new HoatDong(tenHD, moTaHD, ngayGioBD, ngayGioKT, SLToiThieuYC, SLToiDaYC,
						thoiHanDK, trangThai, maTV);

				hoatDongDAO.save(hoatDong);

				path = "views/them-moi.jsp";
				break;

			case "sua":
				Long maHD = Long.parseLong(req.getParameter("maHD"));
				tenHD = req.getParameter("tenHD");
				moTaHD = req.getParameter("moTaHD");
				ngayGioBD = FormatUtil.stringToTimestamp(req.getParameter("ngayGioBD"));
				ngayGioKT = FormatUtil.stringToTimestamp(req.getParameter("ngayGioKT"));
				SLToiThieuYC = Integer.parseInt(req.getParameter("SLToiThieuYC"));
				SLToiDaYC = Integer.parseInt(req.getParameter("SLToiDaYC"));
				thoiHanDK = FormatUtil.stringToTimestamp(req.getParameter("thoiHanDK"));
				trangThai = req.getParameter("trangThai");
				maTV = Long.parseLong(req.getParameter("maTV"));
				String lyDoHuyHD = req.getParameter("lyDoHuyHD");

				hoatDong = new HoatDong(maHD, tenHD, moTaHD, ngayGioBD, ngayGioKT, SLToiThieuYC, SLToiDaYC, thoiHanDK,
						trangThai, maTV, lyDoHuyHD);

				hoatDongDAO.update(hoatDong);

				req.setAttribute("danhSachHD", hoatDongDAO.findAll());
				path = "views/danh-sach.jsp";
				break;
			}
		}

		req.getRequestDispatcher(path).forward(req, resp);
	}
}

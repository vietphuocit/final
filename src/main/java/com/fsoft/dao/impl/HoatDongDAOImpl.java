package com.fsoft.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fsoft.dao.IHoatDongDAO;
import com.fsoft.model.HoatDong;

public class HoatDongDAOImpl implements IHoatDongDAO {

	private Connection getConnection() {
		Connection connection = null;
		try {
			String url = "jdbc:mysql://localhost:3306/final?useUnicode=yes&characterEncoding=UTF-8";
			String username = "root";
			String password = "";
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			return connection;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public Long save(HoatDong hoatDong) {
		String sql = "INSERT INTO hoatdong (TenHD, MoTaHD, NgayGioBD, NgayGioKT, SLToiThieuYC, SLToiDaYC, ThoiHanDK, TrangThai, MaTV)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = getConnection();
			connection.setAutoCommit(false);

			statement = connection.prepareStatement(sql);

			statement.setString(1, hoatDong.getTenHD());
			statement.setString(2, hoatDong.getMoTaHD());
			statement.setTimestamp(3, hoatDong.getNgayGioBD());
			statement.setTimestamp(4, hoatDong.getNgayGioKT());
			statement.setInt(5, hoatDong.getSLToiThieuYC());
			statement.setInt(6, hoatDong.getSLToiDaYC());
			statement.setTimestamp(7, hoatDong.getThoiHanDK());
			statement.setString(8, hoatDong.getTrangThai());
			statement.setLong(9, hoatDong.getMaTV());

			Long id = (long) statement.executeUpdate();

			connection.commit();

			return id;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public List<HoatDong> findAll() {
		List<HoatDong> list = new ArrayList<>();

		String sql = "SELECT * FROM hoatdong";

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = getConnection();

			statement = connection.prepareStatement(sql);

			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				list.add(new HoatDong(resultSet.getLong("MaHD"), resultSet.getString("TenHD"),
						resultSet.getString("MoTaHD"), resultSet.getTimestamp("NgayGioBD"),
						resultSet.getTimestamp("NgayGioKT"), resultSet.getInt("SLToiThieuYC"),
						resultSet.getInt("SLToiDaYC"), resultSet.getTimestamp("ThoiHanDK"),
						resultSet.getString("TrangThai"), resultSet.getLong("MaTV"), resultSet.getString("LyDoHuyHD")));
			}

			return list;
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}
	}

	@Override
	public boolean delete(Long maHD) {
		String sql = "DELETE FROM hoatdong WHERE MaHD = " + maHD;

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = getConnection();
			connection.setAutoCommit(false);
			statement = connection.prepareStatement(sql);
			statement.executeUpdate();
			connection.commit();

			return true;
		} catch (SQLException e) {
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public Long update(HoatDong hoatDong) {
		String sql = "UPDATE hoatdong "
				+ "SET TenHD = ?, MoTaHD = ?, NgayGioBD = ?, NgayGioKT = ?, SLToiThieuYC = ?, SLToiDaYC = ?, ThoiHanDK = ?, TrangThai = ?, MaTV = ?, LyDoHuyHD = ?"
				+ " WHERE MaHD = ?";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = getConnection();
			connection.setAutoCommit(false);

			statement = connection.prepareStatement(sql);

			statement.setString(1, hoatDong.getTenHD());
			statement.setString(2, hoatDong.getMoTaHD());
			statement.setTimestamp(3, hoatDong.getNgayGioBD());
			statement.setTimestamp(4, hoatDong.getNgayGioKT());
			statement.setInt(5, hoatDong.getSLToiThieuYC());
			statement.setInt(6, hoatDong.getSLToiDaYC());
			statement.setTimestamp(7, hoatDong.getThoiHanDK());
			statement.setString(8, hoatDong.getTrangThai());
			statement.setLong(9, hoatDong.getMaTV());
			statement.setString(10, hoatDong.getLyDoHuyHD());
			statement.setLong(11, hoatDong.getMaHD());

			System.out.println(statement.toString());

			Long id = (long) statement.executeUpdate();

			connection.commit();

			return id;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public HoatDong findOneByMaHD(Long maHD) {

		String sql = "SELECT * FROM hoatdong WHERE MaHD = " + maHD;

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = getConnection();

			statement = connection.prepareStatement(sql);

			resultSet = statement.executeQuery();

			resultSet.next();

			return new HoatDong(resultSet.getLong("MaHD"), resultSet.getString("TenHD"), resultSet.getString("MoTaHD"),
					resultSet.getTimestamp("NgayGioBD"), resultSet.getTimestamp("NgayGioKT"),
					resultSet.getInt("SLToiThieuYC"), resultSet.getInt("SLToiDaYC"),
					resultSet.getTimestamp("ThoiHanDK"), resultSet.getString("TrangThai"), resultSet.getLong("MaTV"),
					resultSet.getString("LyDoHuyHD"));
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}
	}

}

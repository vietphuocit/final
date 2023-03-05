package com.fsoft.dao;

import java.util.List;

import com.fsoft.model.HoatDong;

public interface IHoatDongDAO {
	Long save(HoatDong hoatDong);

	List<HoatDong> findAll();

	boolean delete(Long maHD);

	Long update(HoatDong hoatDong);

	HoatDong findOneByMaHD(Long maHD);
}

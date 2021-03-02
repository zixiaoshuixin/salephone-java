package com.example.service;

import java.util.List;

import com.example.pojo.Supplier;

public interface SupplierService {
	
	/**
	 * 查询所有供货商信息
	 * @return
	 */
	List<Supplier> selectAllSuppliers();
	
	/**
	 * 根据供货商标识符查询供货商信息
	 */
	Supplier selectSupplierBySupplierID(String supplierID);
	
	/**
	 * 根据供货商名称查询供货商信息
	 */
	List<Supplier> selectSuppliersBySupplierName(String supplierName);
	
	/**
	 * 供货商注册/新增
	 */
	int insertSupplier(Supplier supplier);
	
	/**
	 * 注销供货商
	 */
	int deleteSupplierByID(String supplierID);
	
	/**
	 * 修改供货商信息
	 */
	int updateSupplier(Supplier supplier);

}

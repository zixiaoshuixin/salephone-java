package com.example.service;

import java.util.List;

import com.example.pojo.Selling;
import com.example.pojo.Supplier;

public interface SellingService {
	
	/**
	 * 查询所有销售记录
	 */
	List<Selling> selectAllSellings();
	
	/**
	 * 查询一种商品品牌的销售记录
	 */
	List<Selling> selectSellingsOfOnePhone(String phoneBrand);
	
	/**
	 * 查询一个供货商的销售记录
	 */
	List<Supplier> selectSellingsOfOneSupplier(String supplierID);
	
	/**
	 * 根据销售单号查询销售记录
	 */
	Selling selectSellingBySellID(String sellID);
	
	/**
	 * 新增销售记录
	 */
	int insertSelling(Selling selling);

}

package com.example.service;

import java.util.List;

import com.example.pojo.Phone;

public interface PhoneService {
	/**
	 * 查询所有商品
	 */
	List<Phone> selectAllPhones();
	
	/**
	 * 根据商品标识符查询商品
	 */
	Phone selectPhoneByPhoneID(String phoneID);
	
	/**
	 * 根据商品名称查询商品
	 */
	List<Phone> selectPhonesByPhoneName(String phoneName);
	
	/**
	 * 根据商品品牌(类型)查询商品
	 */
	List<Phone> selectPhonesByPhoneBrand(String phoneBrand);
	
	/**
	 * 根据商品型号(大小)查询商品
	 */
	List<Phone> selectPhonesByTypeNumber(String typeNumber);
	
	/**
	 * 根据商品颜色查询商品
	 */
	List<Phone> selectPhoneByPhonesColor(String phoneColor);
	
	/**
	 * 查询一个供应商的所有商品
	 */
	List<Phone> selectPhonesOfOneSupplier(String supplierID);
	
	/**
	 * 根据商品状态(下架/上架/等)查询商品状态
	 */
	List<Phone> selectPhonesByPhoneState(String phoneState);
	
	/**
	 * 新增商品
	 */
	int insertPhone(Phone phone);
	
	/**
	 * 
	 * 根据商品标识符删除商品
	 */
	int deletePhoneByID(String phoneID);
	
	
	/**
	 * 修改一件商品信息
	 */
	int updatePhoneByPhoneID(Phone phone);
	
	/**
	 * 根据商品名称修改商品
	 */
	int updatePhonesByPhoneName(Phone phone);
	
	
	/**
	 * 查询一个仓库的所有商品
	 */
	List<Phone> selectPhonesInRepository(String reposID);

}

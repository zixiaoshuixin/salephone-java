package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.mapper.PhoneMapper;
import com.example.pojo.Phone;
import com.example.pojo.Repository;

public interface RepositoryService {
	
	/**
	 * 新增仓库
	 */
	int insertRepository(Repository repository);
	
	/**
	 * 修改仓库信息
	 */
	int updateRepository(Repository repository);
	
	/**
	 * 查询所有仓库信息
	 */
	List<Repository> selectAllRepositories();
	
	/**
	 * 根据仓库ID查询仓库
	 */
	Repository selectRepositoryByRepositoryID(String reposID);
	
	
	/**
	 * 删除仓库
	 */
	int deleteRepositoryByRepositoryID(String reposID);
	
	
	/**
	 * 仓库中商品出库
	 */
	int handlePhoneSale(String phoneID,int saleCount);
	
	/**
	 * 商品入库
	 */
	int handlerPhonePurchase(String phoneID,int purchaseCount);
	
	
	
	

}

package com.example.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.pojo.Repository;

@Mapper
public interface RepositoryMapper {
	
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
	 * 出售商品
	 */
	int handlePhoneSale(@Param("phoneID") String phoneID,@Param("saleCount") int saleCount);
	
	/**
	 * 单件商品入库
	 */
	
	int handlerPhonePurchase(@Param("phoneID") String phoneID,@Param("purchaseCount") int purchaseCount);
	
	
	

}

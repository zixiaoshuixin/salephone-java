package com.example.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.RepositoryDTO;
import com.example.pojo.Phone;
import com.example.pojo.Repository;
import com.example.service.RepositoryService;
import com.example.service.SupplierService;

@Controller
@CrossOrigin
public class RepositoryController {
	
	@Autowired
	private RepositoryService service;
	
	@Autowired
	private SupplierService supplierService;
	
	
	/**
	 * 新增仓库
	 */
	@RequestMapping("/insertRepository")
	@ResponseBody
	public void insertRepository(@RequestBody RepositoryDTO repositoryDTO) {
		Repository repository = new Repository();
		repository.setReposID(repositoryDTO.getReposID());
		repository.setRemains(repositoryDTO.getRemains());
		repository.setReposDetails(repositoryDTO.getReposDetails());
		repository.setReposName(repositoryDTO.getReposName());
		repository.setSupplierID(repositoryDTO.getSupplierID());
		repository.setSupplier(supplierService.selectSupplierBySupplierID(repository.getSupplierID()));
		
		if (repository !=  null) {
			service.insertRepository(repository);
		}
		
	}
	
	/**
	 * 修改仓库信息
	 */
	@RequestMapping("/updateRepository")
	@ResponseBody
	public void updateRepository(@RequestBody RepositoryDTO repositoryDTO) {
		Repository repository = new Repository();
		repository.setReposID(repositoryDTO.getReposID());
		repository.setRemains(repositoryDTO.getRemains());
		repository.setReposDetails(repositoryDTO.getReposDetails());
		repository.setReposName(repositoryDTO.getReposName());
		repository.setSupplierID(repositoryDTO.getSupplierID());
		repository.setSupplier(supplierService.selectSupplierBySupplierID(repository.getSupplierID()));
		
		if (repository != null) {
			service.updateRepository(repository);
		}
		 
	}
	
	/**
	 * 查询所有仓库信息
	 */
	@RequestMapping("/selectAllRepositories")
	@ResponseBody
	public List<Repository> selectAllRepositories(){
		return service.selectAllRepositories();
	}
	
	/**
	 * 根据仓库ID查询仓库
	 */
	@RequestMapping("/selectRepositoryByRepositoryID")
	@ResponseBody
	public Repository selectRepositoryByRepositoryID(@RequestParam String reposID) {
		if (reposID.length() > 0) {
			return service.selectRepositoryByRepositoryID(reposID);
		}
		return null;
	}
	
	/**
	 * 删除仓库
	 */
	@RequestMapping("/deleteRepositoryByRepositoryID")
	@ResponseBody
	public void deleteRepositoryByRepositoryID(@RequestParam String reposID) {
		if (reposID.length() > 0) {
			service.deleteRepositoryByRepositoryID(reposID);
		}
	}
	
	

	/**
	 * 出售商品
	 */
	@RequestMapping("/handlePhoneSale")
	@ResponseBody
	public void handlePhoneSale(@RequestParam String phoneID,@RequestParam int saleCount) {
		if (phoneID.length() > 0 && saleCount > 0) {
			service.handlePhoneSale(phoneID, saleCount);
		}
	}

	/**
	 * 单件商品入库
	 */
	@RequestMapping("/handlerPhonePurchase")
	@ResponseBody
	public void handlerPhonePurchase(@RequestParam String phoneID,@RequestParam int purchaseCount) {
		if (phoneID.length() > 0 && purchaseCount > 0) {
			service.handlerPhonePurchase(phoneID, purchaseCount);
		}
	}

}

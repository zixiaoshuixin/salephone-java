package com.example.pojo;

import java.util.List;
import java.util.Map;

public class Repository {
	
	/**
	 * 仓库编号
	 */
	private String reposID;
	
	/**
	 * 仓库名称
	 */
	private String reposName;
	
	
	/**
	 * 剩余库存
	 */
	private int remains;
	
	/**
	 * 仓库详细信息
	 */
	private String reposDetails;
	
	/**
	 * 仓库所属供应商标识符
	 */
	private String supplierID;
	
	/**
	 * 仓库所属供应商
	 */
	private Supplier supplier;
	
	/**
	 * 仓库所有商品
	 */
	private List<Phone> phones;
	
	/**
	 * 仓库所有商品 ：<商品,剩余库存>
	 */
	private Map<Phone,Integer> mapPhone;
	

	public Repository() {
		super();
	}


	public String getReposID() {
		return reposID;
	}


	public void setReposID(String reposID) {
		this.reposID = reposID;
	}


	public String getReposName() {
		return reposName;
	}


	public void setReposName(String reposName) {
		this.reposName = reposName;
	}


	public int getRemains() {
		return remains;
	}


	public void setRemains(int remains) {
		this.remains = remains;
	}


	public String getReposDetails() {
		return reposDetails;
	}


	public void setReposDetails(String reposDetails) {
		this.reposDetails = reposDetails;
	}


	public String getSupplierID() {
		return supplierID;
	}


	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}


	public Supplier getSupplier() {
		return supplier;
	}


	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}


	public List<Phone> getPhones() {
		return phones;
	}


	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}


	public Map<Phone, Integer> getMapPhone() {
		return mapPhone;
	}


	public void setMapPhone(Map<Phone, Integer> mapPhone) {
		this.mapPhone = mapPhone;
	}


	@Override
	public String toString() {
		return "Repository [reposID=" + reposID + ", reposName=" + reposName + ", remains=" + remains
				+ ", reposDetails=" + reposDetails + ", supplierID=" + supplierID + ", supplier=" + supplier
				+ ", phones=" + phones + ", mapPhone=" + mapPhone + "]";
	}

	
	
	

}

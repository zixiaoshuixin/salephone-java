package com.example.dto;

public class RepositoryDTO {
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

	@Override
	public String toString() {
		return "RepositoryDTO [reposID=" + reposID + ", reposName=" + reposName + ", remains=" + remains
				+ ", reposDetails=" + reposDetails + ", supplierID=" + supplierID + "]";
	}
	
	
}

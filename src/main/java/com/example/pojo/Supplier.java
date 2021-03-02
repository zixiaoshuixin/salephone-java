package com.example.pojo;

import java.util.Date;

public class Supplier {

	/**
	 * 供货商标识符
	 */
	private String supplierID;
	
	/**
	 * 供货商名称
	 */
	private String supplierName;
	
	/**
	 * 
	 * 供货商地址
	 */
	private String supplierAddress;
	
	
	/**
	 * 
	 * 供货商官方电话
	 */
	private String tele;
	
	/**
	 * 
	 * 法定责任人
	 */
	private String principal;
	
	/**
	 * 供货商详细信息
	 */
	private String supplierDetails;
	
	
	/**
	 * 
	 * 供货商注册时间
	 */
	private Date registTime;


	public Supplier() {
		super();
	}


	public String getSupplierID() {
		return supplierID;
	}


	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public String getSupplierAddress() {
		return supplierAddress;
	}


	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}


	public String getTele() {
		return tele;
	}


	public void setTele(String tele) {
		this.tele = tele;
	}


	public String getPrincipal() {
		return principal;
	}


	public void setPrincipal(String principal) {
		this.principal = principal;
	}


	public String getSupplierDetails() {
		return supplierDetails;
	}


	public void setSupplierDetails(String supplierDetails) {
		this.supplierDetails = supplierDetails;
	}


	public Date getRegistTime() {
		return registTime;
	}


	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}


	@Override
	public String toString() {
		return "Supplier [supplierID=" + supplierID + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", tele=" + tele + ", principal=" + principal + ", supplierDetails="
				+ supplierDetails + ", registTime=" + registTime + "]";
	}
	
}
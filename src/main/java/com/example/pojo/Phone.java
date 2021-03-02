package com.example.pojo;

import java.util.Date;

public class Phone {
	
	/**
	 * 手机标识符
	 */
	private String phoneID;
	
	/**
	 * 手机名称
	 */
	private String phoneName;
	
	/**
	 * 手机品牌
	 */
	private String phoneBrand;
	
	/**
	 * 手机型号
	 */
	private String typeNumber;
	
	/**
	 * 销售单价
	 */
    private float sellingPrice;
    
    /**
     * 
     * 产品进货单价
     */
	private float purchasingPrice;
	
	/**
	 * 手机图片地址
	 */
	private String phonePicture;
	
	/**
	 * 
	 * 手机详细信息
	 */
	private String phoneDetails;
	
	/**
	 * 
	 * 手机功能简介
	 */
	private String phoneFunction;
	
	/**
	 * 
	 * 手机颜色
	 */
	private String phoneColor;
	
	
	
	/**
	 * 剩余库存数量
	 */
	private int remains;
	
	/**
	 * 生产时间
	 */
	private Date productTime;
	
	/**
	 * 商品状态：未上架/已下架
	 */
	private String phoneState;
	
	/**
	 * 供货商标识符
	 */
	private String supplierID;

	
	/**
	 * 
	 * 供货商
	 */
	private Supplier supplier;
	
	/**
	 * 商品所在仓库号
	 */
	private String reposID;
	
	/**
	 * 商品所在仓库
	 */
	private Repository repository;
	

	public Phone() {
		super();
	}

	public String getPhoneID() {
		return phoneID;
	}

	public void setPhoneID(String phoneID) {
		this.phoneID = phoneID;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

	public String getTypeNumber() {
		return typeNumber;
	}

	public void setTypeNumber(String typeNumber) {
		this.typeNumber = typeNumber;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public float getPurchasingPrice() {
		return purchasingPrice;
	}

	public void setPurchasingPrice(float purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}

	public String getPhonePicture() {
		return phonePicture;
	}

	public void setPhonePicture(String phonePicture) {
		this.phonePicture = phonePicture;
	}

	public String getPhoneDetails() {
		return phoneDetails;
	}

	public void setPhoneDetails(String phoneDetails) {
		this.phoneDetails = phoneDetails;
	}

	public String getPhoneFunction() {
		return phoneFunction;
	}

	public void setPhoneFunction(String phoneFunction) {
		this.phoneFunction = phoneFunction;
	}

	public String getPhoneColor() {
		return phoneColor;
	}

	public void setPhoneColor(String phoneColor) {
		this.phoneColor = phoneColor;
	}

	public int getRemains() {
		return remains;
	}

	public void setRemains(int remains) {
		this.remains = remains;
	}

	public Date getProductTime() {
		return productTime;
	}

	public void setProductTime(Date productTime) {
		this.productTime = productTime;
	}
	
	

	public String getPhoneState() {
		return phoneState;
	}

	public void setPhoneState(String phoneState) {
		this.phoneState = phoneState;
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
	
	
	

	public String getReposID() {
		return reposID;
	}

	public void setReposID(String reposID) {
		this.reposID = reposID;
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	@Override
	public String toString() {
		return "Phone [phoneID=" + phoneID + ", phoneName=" + phoneName + ", phoneBrand=" + phoneBrand + ", typeNumber="
				+ typeNumber + ", sellingPrice=" + sellingPrice + ", purchasingPrice=" + purchasingPrice
				+ ", phonePicture=" + phonePicture + ", phoneDetails=" + phoneDetails + ", phoneFunction="
				+ phoneFunction + ", phoneColor=" + phoneColor + ", remains=" + remains + ", productTime=" + productTime
				+ ", phoneState=" + phoneState + ", supplierID=" + supplierID + ", supplier=" + supplier + ", reposID="
				+ reposID + ", repository=" + repository + "]";
	}

	

	
	

}

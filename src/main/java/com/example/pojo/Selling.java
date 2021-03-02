package com.example.pojo;

import java.util.Date;

public class Selling {
	
	/**
	 * 销售标识符
	 */
	private String sellID;
	
	/**
	 * 销售产品标识符
	 */
	private String phoneID;
	
	/**
	 * 销售商品名称
	 */
	private String phoneBrand;
	
	/**
	 * 销售产品供应商标识符
	 */
	private String supplierID;
	
	/**
	 * 买家用户
	 */
	private String userName;
	
	/**
	 * 售出数量
	 */
	private int sellCount;
	
	/**
	 * 此项商品盈利
	 */
	private float profit;
	
	/**
	 * 售出总价
	 */
	private float totalPrice;
	
	/**
	 * 售出时间
	 */
	private Date sellTime;
	
	/**
	 * 收货人收货状态
	 */
	private String receiveState;
	
	/**
	 * 售出商品
	 */
	private Phone phone;
	
	/**
	 * 售出商品供应商
	 */
	private Supplier supplier;
	
	/**
	 * 买家
	 */
	private Register register;

	public Selling() {
		super();
	}

	public String getSellID() {
		return sellID;
	}

	public void setSellID(String sellID) {
		this.sellID = sellID;
	}

	public String getPhoneID() {
		return phoneID;
	}

	public void setPhoneID(String phoneID) {
		this.phoneID = phoneID;
	}
	
	

	

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSellCount() {
		return sellCount;
	}

	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getSellTime() {
		return sellTime;
	}

	public void setSellTime(Date sellTime) {
		this.sellTime = sellTime;
	}

	public String getReceiveState() {
		return receiveState;
	}

	public void setReceiveState(String receiveState) {
		this.receiveState = receiveState;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	@Override
	public String toString() {
		return "Selling [sellID=" + sellID + ", phoneID=" + phoneID + ", phoneBrand=" + phoneBrand + ", supplierID="
				+ supplierID + ", userName=" + userName + ", sellCount=" + sellCount + ", profit=" + profit
				+ ", totalPrice=" + totalPrice + ", sellTime=" + sellTime + ", receiveState=" + receiveState
				+ ", phone=" + phone + ", supplier=" + supplier + ", register=" + register + "]";
	}

	
	
	

	
	

}

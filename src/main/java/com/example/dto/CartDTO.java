package com.example.dto;

import java.util.Date;

public class CartDTO {
	
	private String cartID;
	/**
	 * 购物车所属用户
	 */
	private String userName;
	
	/**
	 * 加购商品标识符
	 */
	private String phoneID;
	
	private String phoneName;

	
	/**
	 * 加购商品供应商
	 */
	private String supplierID;
	
	/**
	 * 加购数量
	 */
	private int cartCount;
	
	/**
	 * 加购时间
	 */
	private Date cartTime;
	
	/**
	 * 加购备注
	 */
	private String cartDetails;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public int getCartCount() {
		return cartCount;
	}

	public void setCartCount(int cartCount) {
		this.cartCount = cartCount;
	}

	public Date getCartTime() {
		return cartTime;
	}

	public void setCartTime(Date cartTime) {
		this.cartTime = cartTime;
	}

	public String getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(String cartDetails) {
		this.cartDetails = cartDetails;
	}
	
	

	public String getCartID() {
		return cartID;
	}

	public void setCartID(String cartID) {
		this.cartID = cartID;
	}

	@Override
	public String toString() {
		return "CartDTO [cartID=" + cartID + ", userName=" + userName + ", phoneID=" + phoneID + ", phoneName="
				+ phoneName + ", supplierID=" + supplierID + ", cartCount=" + cartCount + ", cartTime=" + cartTime
				+ ", cartDetails=" + cartDetails + "]";
	}

	
	
	
	

}

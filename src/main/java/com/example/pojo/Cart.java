package com.example.pojo;

import java.util.Date;

public class Cart {
	
	/**
	 * 
	 * 购物车商品标识符
	 */
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
	
	/**
	 * 加购用户
	 */
	private Register register;
	
	/**
	 * 加购商品
	 */
	private Phone phone;
	
	/**
	 * 加购商品供应商
	 */
	private Supplier supplier;
	public Cart() {
		super();
	}
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
	public Register getRegister() {
		return register;
	}
	public void setRegister(Register register) {
		this.register = register;
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
	
	
	
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public String getCartID() {
		return cartID;
	}
	public void setCartID(String cartID) {
		this.cartID = cartID;
	}
	@Override
	public String toString() {
		return "Cart [cartID=" + cartID + ", userName=" + userName + ", phoneID=" + phoneID + ", phoneName=" + phoneName
				+ ", supplierID=" + supplierID + ", cartCount=" + cartCount + ", cartTime=" + cartTime
				+ ", cartDetails=" + cartDetails + ", register=" + register + ", phone=" + phone + ", supplier="
				+ supplier + "]";
	}
	
	
	
	
	
	

	

}

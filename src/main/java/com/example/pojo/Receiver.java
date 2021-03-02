package com.example.pojo;

public class Receiver {
	
	/**
	 * 收货人标识符
	 */
	private String receiverID;
	
	/**
	 * 收货人收到商品标识符
	 */
	private String phoneID;
	
	/**
	 * 收货人姓名
	 */
	private String receiverName;
	
	/**
	 * 收货人电话
	 */
	private String receiverTele;
	
	/**
	 * 收货人收货城市
	 */
	private String receiverCity;
	
	/**
	 * 收货人收货详细地址
	 */
	private String receiverAddress;
	
	/**
	 * 收货人邮箱
	 */
	private String receiverEmail;
	
	/**
	 * 收货商品
	 */
	private Phone phone;
	public Receiver() {
		super();
	}
	public String getReceiverID() {
		return receiverID;
	}
	public void setReceiverID(String receiverID) {
		this.receiverID = receiverID;
	}
	public String getPhoneID() {
		return phoneID;
	}
	public void setPhoneID(String phoneID) {
		this.phoneID = phoneID;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverTele() {
		return receiverTele;
	}
	public void setReceiverTele(String receiverTele) {
		this.receiverTele = receiverTele;
	}
	public String getReceiverCity() {
		return receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Receive [receiverID=" + receiverID + ", phoneID=" + phoneID + ", receiverName=" + receiverName
				+ ", receiverTele=" + receiverTele + ", receiverCity=" + receiverCity + ", receiverAddress="
				+ receiverAddress + ", receiverEmail=" + receiverEmail + ", phone=" + phone + "]";
	}
	
	
	

}

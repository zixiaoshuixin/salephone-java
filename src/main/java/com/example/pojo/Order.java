package com.example.pojo;

import java.util.Date;

public class Order {
	
	/**
	 * 订单号
	 */
	private String orderID;
	
	/**
	 * 下单商品标识符
	 */
	private String phoneID;
	
	/**
	 * 下单商品所在供应商标识符
	 */
	private String supplierID;
	
	/**
	 * 下单用户名
	 */
	private String userName;
	
	/**
	 * 收货人
	 */
	private String receiverID;
	
	/**
	 * 单个商品下单数量
	 */
	private int orderCount;
	
	/**
	 * 订单状态
	 */
	private String orderState;
	
	/**
	 * 支付状态
	 */
	private String paymentState;
	
	/**
	 * 下单时间
	 */
	private Date orderTime;
	
	/**
	 * 下单总价
	 */
	private float totalPrice;
	
	/**
	 * 运费
	 */
	private float transPrice;
	
	/**
	 * 订单备注
	 */
	private String orderDetails;
	
	/**
	 * 下单商品
	 */
	private Phone phone;
	
	/**
	 * 下单商品供应商
	 */
	private Supplier supplier;
	
	/**
	 * 下单用户
	 */
	private Register register;
	
	/**
	 * 订单收货人
	 */
	private Receiver receiver;

	public Order() {
		super();
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String getReceiverID() {
		return receiverID;
	}

	public void setReceiverID(String receiverID) {
		this.receiverID = receiverID;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getPaymentState() {
		return paymentState;
	}

	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public float getTransPrice() {
		return transPrice;
	}

	public void setTransPrice(float transPrice) {
		this.transPrice = transPrice;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
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
	
	

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", phoneID=" + phoneID + ", supplierID=" + supplierID + ", userName="
				+ userName + ", receiverID=" + receiverID + ", orderCount=" + orderCount + ", orderState=" + orderState
				+ ", paymentState=" + paymentState + ", orderTime=" + orderTime + ", totalPrice=" + totalPrice
				+ ", transPrice=" + transPrice + ", orderDetails=" + orderDetails + ", phone=" + phone + ", supplier="
				+ supplier + ", register=" + register + ", receiver=" + receiver + "]";
	}

	

	

	
}

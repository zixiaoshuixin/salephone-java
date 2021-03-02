package com.example.service;

import java.util.List;

import com.example.pojo.Order;

public interface OrderService {
	
	/**
	 * 下订单，即新增订单
	 */
	int insertOrder(Order order);
	
	/**
	 * 
	 * 删除、取消订单
	 */
	int deleteOrderByOrderID(String orderID);
	
	/**
	 * 查询所有订单
	 */
	List<Order> selectAllOrders();
	
	/**
	 * 查询一个用户的所有订单
	 */
	List<Order> selectOrdersOfOneUser(String userName);
	
	/**
	 * 查询一个供货商的所有订单
	 */
	List<Order> selectOrdersOfOneSupplier(String supplierID);
	
	/**
	 * 查询一件商品的所有订单
	 */
	List<Order> selectOrdersOfOnePhone(String phoneID);
	
	/**
	 * 
	 * 根据订单号查询订单
	 */
	Order selectOrderByOrderID(String orderID);
	
	
	/**
	 * 修改订单信息
	 */
	int updateOrder(Order order);

}

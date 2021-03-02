package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.OrderMapper;
import com.example.pojo.Order;
import com.example.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper mapper;

	@Override
	public int insertOrder(Order order) {
		return mapper.insertOrder(order);
	}

	@Override
	public int deleteOrderByOrderID(String orderID) {
		// TODO Auto-generated method stub
		return mapper.deleteOrderByOrderID(orderID);
	}

	@Override
	public List<Order> selectAllOrders() {
		// TODO Auto-generated method stub
		return mapper.selectAllOrders();
	}

	@Override
	public List<Order> selectOrdersOfOneUser(String userName) {
		// TODO Auto-generated method stub
		return mapper.selectOrdersOfOneUser(userName);
	}

	@Override
	public List<Order> selectOrdersOfOneSupplier(String supplierID) {
		// TODO Auto-generated method stub
		return mapper.selectOrdersOfOneSupplier(supplierID);
	}

	@Override
	public List<Order> selectOrdersOfOnePhone(String phoneID) {
		// TODO Auto-generated method stub
		return mapper.selectOrdersOfOnePhone(phoneID);
	}

	@Override
	public Order selectOrderByOrderID(String orderID) {
		// TODO Auto-generated method stub
		return mapper.selectOrderByOrderID(orderID);
	}

	@Override
	public int updateOrder(Order order) {
		// TODO Auto-generated method stub
		return mapper.updateOrder(order);
	}
}

package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.OrderDTO;
import com.example.pojo.Order;
import com.example.pojo.Phone;
import com.example.service.OrderService;
import com.example.service.PhoneService;
import com.example.service.ReceiverService;
import com.example.service.RegisterService;
import com.example.service.SupplierService;

@Controller
@CrossOrigin
public class OrderController {

	@Autowired
	private OrderService service;
	
	@Autowired
	private PhoneService phoneService;
	
	@Autowired
	private ReceiverService receiverService;
	
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private RegisterService registerService;
	
	/**
	 * 下订单，即新增订单
	 */
	@RequestMapping("/insertOrder")
	@ResponseBody
	public void insertOrder(@RequestBody OrderDTO orderDTO) {
		Order order = new Order();
		order.setOrderID(orderDTO.getOrderID());
		order.setOrderCount(orderDTO.getOrderCount());
		order.setOrderDetails(orderDTO.getOrderDetails());
		order.setOrderState(orderDTO.getOrderState());
		order.setOrderTime(orderDTO.getOrderTime());
		order.setPaymentState(orderDTO.getPaymentState());
		order.setPhoneID(orderDTO.getPhoneID());
		order.setPhone(phoneService.selectPhoneByPhoneID(order.getPhoneID()));
		order.setReceiverID(orderDTO.getReceiverID());
		order.setReceiver(receiverService.selectReceiverByID(order.getReceiverID()));
		order.setSupplierID(orderDTO.getSupplierID());
		order.setSupplier(supplierService.selectSupplierBySupplierID(order.getSupplierID()));
		order.setTotalPrice(orderDTO.getTotalPrice());
		order.setTransPrice(orderDTO.getTransPrice());
		order.setUserName(orderDTO.getUserName());
		order.setRegister(registerService.selectRegisterByUserName(order.getUserName()));
		
			if (order != null) {
				service.insertOrder(order);
			}
	}
	
	/**
	 * 
	 * 删除、取消订单
	 */
	@RequestMapping("/deleteOrderByOrderID")
	@ResponseBody
	public void deleteOrderByOrderID(@RequestParam String orderID) {
		if (orderID.length() > 0) {
			service.deleteOrderByOrderID(orderID);
		}
	}
	
	/**
	 * 查询所有订单
	 */
	@RequestMapping("/selectAllOrders")
	@ResponseBody
	public List<Order> selectAllOrders(){
		return service.selectAllOrders();
	}
	
	/**
	 * 查询一个用户的所有订单
	 */
	@RequestMapping("/selectOrdersOfOneUser")
	@ResponseBody
	public List<Order> selectOrdersOfOneUser(@RequestParam String userName){
		if (userName.length() > 0) {
			return service.selectOrdersOfOneUser(userName);
		}
		return null;
	}
	
	/**
	 * 查询一个供货商的所有订单
	 */
	@RequestMapping("/selectOrdersOfOneSupplier")
	@ResponseBody
	public List<Order> selectOrdersOfOneSupplier(@RequestParam String supplierID){
		if (supplierID.length() > 0) {
			return service.selectOrdersOfOneSupplier(supplierID);
		}
		return null;
	}
	
	/**
	 * 查询一件商品的所有订单
	 */
	@RequestMapping("/selectOrdersOfOnePhone")
	@ResponseBody
	public List<Order> selectOrdersOfOnePhone(@RequestParam String phoneID){
		if (phoneID.length() > 0) {
			return service.selectOrdersOfOnePhone(phoneID);
		}
		return null;
	}
	
	/**
	 * 
	 * 根据订单号查询订单
	 */
	@RequestMapping("/selectOrderByOrderID")
	@ResponseBody
	public Order selectOrderByOrderID(@RequestParam String orderID) {
		
		if (orderID.length() > 0) {
			return service.selectOrderByOrderID(orderID);
		}
		return null;
	}
	
	
	/**
	 * 修改订单信息
	 */
	@RequestMapping("/updateOrder")
	@ResponseBody
	public void updateOrder(@RequestBody OrderDTO orderDTO) {
		Order order = new Order();
		order.setOrderID(orderDTO.getOrderID());
		order.setOrderCount(orderDTO.getOrderCount());
		order.setOrderDetails(orderDTO.getOrderDetails());
		order.setOrderState(orderDTO.getOrderState());
		order.setOrderTime(orderDTO.getOrderTime());
		order.setPaymentState(orderDTO.getPaymentState());
		order.setPhoneID(orderDTO.getPhoneID());
		order.setPhone(phoneService.selectPhoneByPhoneID(order.getPhoneID()));
		order.setReceiverID(orderDTO.getReceiverID());
		order.setReceiver(receiverService.selectReceiverByID(order.getReceiverID()));
		order.setSupplierID(orderDTO.getSupplierID());
		order.setSupplier(supplierService.selectSupplierBySupplierID(order.getSupplierID()));
		order.setTotalPrice(orderDTO.getTotalPrice());
		order.setTransPrice(orderDTO.getTransPrice());
		order.setUserName(orderDTO.getUserName());
		order.setRegister(registerService.selectRegisterByUserName(order.getUserName()));
		if (order != null) {
			service.updateOrder(order);
		}
	}
}

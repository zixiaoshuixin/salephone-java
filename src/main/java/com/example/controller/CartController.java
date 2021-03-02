package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.CartDTO;
import com.example.pojo.Cart;
import com.example.service.CartService;
import com.example.service.PhoneService;
import com.example.service.RegisterService;
import com.example.service.SupplierService;

@Controller
@CrossOrigin
public class CartController {
	
	
	@Autowired
	private CartService service;
	
	@Autowired
	private PhoneService phoneService;
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private SupplierService supplierService;
	/**
	 * 加入购物车
	 */
	@RequestMapping("/insertCart")
	@ResponseBody
	public void insertCart(@RequestBody CartDTO cartDTO) {
		Cart  cart = new Cart();
		cart.setCartID(cartDTO.getCartID());
		cart.setPhoneID(cartDTO.getPhoneID());
		cart.setCartCount(cartDTO.getCartCount());
		cart.setCartDetails(cartDTO.getCartDetails());
		cart.setCartTime(cartDTO.getCartTime());
		cart.setPhone(phoneService.selectPhoneByPhoneID(cart.getPhoneID()));
		cart.setPhoneName(cartDTO.getPhoneName());
		cart.setUserName(cartDTO.getUserName());
		cart.setRegister(registerService.selectRegisterByUserName(cart.getUserName()));
		cart.setSupplierID(cartDTO.getSupplierID());
		cart.setSupplier(supplierService.selectSupplierBySupplierID(cart.getSupplierID()));
		
		
		if (cart != null) {
			service.insertCart(cart);
		}
	}
	
	/**
	 * 
	 * 从购物车中删除
	 */
	@RequestMapping("/deleteCartByCartID")
	@ResponseBody
	public void deleteCartByCartID(@RequestParam String cartID) {
		if (cartID.length() > 0) {
			service.deleteCartByCartID(cartID);
		}
	}
	
	/**
	 * 查询购物车内所有商品
	 */
	@RequestMapping("/selectAllCarts")
	@ResponseBody
	public List<Cart> selectAllCarts(){
		return service.selectAllCarts();
	}
	
	/**
	 * 查询购物车中的一件商品信息
	 */
	@RequestMapping("/selectCartByCartID")
	@ResponseBody
	public Cart selectCartByCartID(@RequestParam String cartID) {
		if (cartID.length() > 0) {
			return service.selectCartByCartID(cartID);
		}
		return null;
	}
	
	/**
	 * 查询一个用户的购物车内所有商品
	 */
	@RequestMapping("/selectCartsOfOneUser")
	@ResponseBody
	public List<Cart> selectCartsOfOneUser(@RequestParam String userName){
		if (userName.length() > 0) {
			return service.selectCartsOfOneUser(userName);
		}
		return null;
	}
	
	/**
	 * 修改购物车中商品信息
	 */
	@RequestMapping("/updateCart")
	@ResponseBody
	public void updateCart(@RequestBody CartDTO cartDTO) {
		Cart  cart = new Cart();
		cart.setCartID(cartDTO.getCartID());
		cart.setPhoneID(cartDTO.getPhoneID());
		cart.setCartCount(cartDTO.getCartCount());
		cart.setCartDetails(cartDTO.getCartDetails());
		cart.setCartTime(cartDTO.getCartTime());
		cart.setPhone(phoneService.selectPhoneByPhoneID(cart.getPhoneID()));
		cart.setPhoneName(cartDTO.getPhoneName());
		cart.setUserName(cartDTO.getUserName());
		cart.setRegister(registerService.selectRegisterByUserName(cart.getUserName()));
		cart.setSupplierID(cartDTO.getSupplierID());
		cart.setSupplier(supplierService.selectSupplierBySupplierID(cart.getSupplierID()));
		if (cart != null) {
			service.updateCart(cart);
		}
	}

}

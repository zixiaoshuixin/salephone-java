package com.example.service;

import java.util.List;

import com.example.pojo.Cart;

public interface CartService {
	/**
	 * 加入购物车
	 */
	int insertCart(Cart cart);
	
	/**
	 * 
	 * 从购物车中删除
	 */
	int deleteCartByCartID(String cartID);
	
	/**
	 * 查询购物车内所有商品
	 */
	List<Cart> selectAllCarts();
	
	/**
	 * 查询购物车中的一件商品信息
	 */
	Cart selectCartByCartID(String cartID);
	
	/**
	 * 查询一个用户的购物车内所有商品
	 */
	List<Cart> selectCartsOfOneUser(String userName);
	
	/**
	 * 修改购物车中商品信息
	 */
	int updateCart(Cart cart);

}

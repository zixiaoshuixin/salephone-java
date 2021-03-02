package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.CartMapper;
import com.example.pojo.Cart;
import com.example.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartMapper mapper;

	@Override
	public int insertCart(Cart cart) {
		// TODO Auto-generated method stub
		return mapper.insertCart(cart);
	}

	@Override
	public int deleteCartByCartID(String cartID) {
		// TODO Auto-generated method stub
		return mapper.deleteCartByCartID(cartID);
	}

	@Override
	public List<Cart> selectAllCarts() {
		// TODO Auto-generated method stub
		return mapper.selectAllCarts();
	}

	@Override
	public Cart selectCartByCartID(String cartID) {
		// TODO Auto-generated method stub
		return mapper.selectCartByCartID(cartID);
	}

	@Override
	public List<Cart> selectCartsOfOneUser(String userName) {
		// TODO Auto-generated method stub
		return mapper.selectCartsOfOneUser(userName);
	}

	@Override
	public int updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return mapper.updateCart(cart);
	}
}

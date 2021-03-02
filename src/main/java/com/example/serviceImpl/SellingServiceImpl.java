package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.SellingMapper;
import com.example.pojo.Selling;
import com.example.pojo.Supplier;
import com.example.service.SellingService;

@Service
public class SellingServiceImpl implements SellingService{
	
	@Autowired
	private SellingMapper mapper;

	@Override
	public List<Selling> selectAllSellings() {
		// TODO Auto-generated method stub
		return mapper.selectAllSellings();
	}

	@Override
	public List<Selling> selectSellingsOfOnePhone(String phoneBrand) {
		// TODO Auto-generated method stub
		return mapper.selectSellingsOfOnePhone(phoneBrand);
	}

	@Override
	public List<Supplier> selectSellingsOfOneSupplier(String supplierID) {
		// TODO Auto-generated method stub
		return mapper.selectSellingsOfOneSupplier(supplierID);
	}

	@Override
	public Selling selectSellingBySellID(String sellID) {
		// TODO Auto-generated method stub
		return mapper.selectSellingBySellID(sellID);
	}

	@Override
	public int insertSelling(Selling selling) {
		// TODO Auto-generated method stub
		return mapper.insertSelling(selling);
	}

}

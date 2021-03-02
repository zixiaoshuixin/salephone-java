package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.SupplierMapper;
import com.example.pojo.Supplier;
import com.example.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	private SupplierMapper mapper;

	@Override
	public List<Supplier> selectAllSuppliers() {
		// TODO Auto-generated method stub
		return mapper.selectAllSuppliers();
	}

	@Override
	public Supplier selectSupplierBySupplierID(String supplierID) {
		// TODO Auto-generated method stub
		return mapper.selectSupplierBySupplierID(supplierID);
	}

	@Override
	public List<Supplier> selectSuppliersBySupplierName(String supplierName) {
		// TODO Auto-generated method stub
		return mapper.selectSuppliersBySupplierName(supplierName);
	}

	@Override
	public int insertSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return mapper.insertSupplier(supplier);
	}

	@Override
	public int deleteSupplierByID(String supplierID) {
		// TODO Auto-generated method stub
		return mapper.deleteSupplierByID(supplierID);
	}

	@Override
	public int updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return mapper.updateSupplier(supplier);
	}

}

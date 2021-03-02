package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.Supplier;
import com.example.service.SupplierService;

@Controller
@CrossOrigin
public class SupplierController {
	
	@Autowired
	private SupplierService service;
	
	/**
	 * 查询所有供货商信息
	 * @return
	 */
	@RequestMapping("/selectAllSuppliers")
	@ResponseBody
	public List<Supplier> selectAllSuppliers(){
		return service.selectAllSuppliers();
	}
	
	/**
	 * 根据供货商标识符查询供货商信息
	 */
	@RequestMapping("/selectSupplierBySupplierID")
	@ResponseBody
	public Supplier selectSupplierBySupplierID(@RequestParam String supplierID) {
		if (supplierID.length() > 0) {
			return service.selectSupplierBySupplierID(supplierID);
		}
		return null;
	}
	
	/**
	 * 根据供货商名称查询供货商信息
	 */
	@RequestMapping("/selectSuppliersBySupplierName")
	@ResponseBody
	public List<Supplier> selectSuppliersBySupplierName(@RequestParam String supplierName){
		if (supplierName.length() > 0) {
			return service.selectSuppliersBySupplierName(supplierName);
		}
		return null;
	}
	
	/**
	 * 供货商注册/新增
	 */
	@RequestMapping("/insertSupplier")
	@ResponseBody
	public void insertSupplier(@RequestBody Supplier supplier) {
		if (supplier != null) {
			service.insertSupplier(supplier);
		}
	}
	
	/**
	 * 注销供货商
	 */
	@RequestMapping("/deleteSupplierByID")
	@ResponseBody
	public void deleteSupplierByID(@RequestParam String supplierID) {
		if (supplierID.length() > 0) {
			service.deleteSupplierByID(supplierID);
		}
	}
	
	/**
	 * 修改供货商信息
	 */
	@RequestMapping("/updateSupplier")
	@ResponseBody
	public void updateSupplier(@RequestBody Supplier supplier) {
		if (supplier != null) {
			service.updateSupplier(supplier);
		}
	}

}

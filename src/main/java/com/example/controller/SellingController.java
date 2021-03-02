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

import com.example.dto.PhoneDTO;
import com.example.dto.SellingDTO;
import com.example.pojo.Selling;
import com.example.pojo.Supplier;
import com.example.service.PhoneService;
import com.example.service.RegisterService;
import com.example.service.SellingService;
import com.example.service.SupplierService;

@Controller
@CrossOrigin
public class SellingController {
	
	@Autowired
	private SellingService service;
	
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private PhoneService phoneService;
	
	/**
	 * 查询所有销售记录
	 */
	@RequestMapping("/selectAllSellings")
	@ResponseBody
	public List<Selling> selectAllSellings(){
		return service.selectAllSellings();
	}
	
	/**
	 * 查询一种商品品牌的销售记录
	 */
	@RequestMapping("/selectSellingsOfOnePhone")
	@ResponseBody
	public List<Selling> selectSellingsOfOnePhone(@RequestParam String phoneBrand){
		if (phoneBrand.length() > 0) {
			return service.selectSellingsOfOnePhone(phoneBrand);
		}
		return null;
	}
	
	/**
	 * 查询一个供货商的销售记录
	 */
	@RequestMapping("/selectSellingsOfOneSupplier")
	@ResponseBody
	public List<Supplier> selectSellingsOfOneSupplier(@RequestParam String supplierID){
		if (supplierID.length() > 0) {
			return service.selectSellingsOfOneSupplier(supplierID);
		}
		return null;
	}
	
	/**
	 * 根据销售单号查询销售记录
	 */
	@RequestMapping("/selectSellingBySellID")
	@ResponseBody
	public Selling selectSellingBySellID(@RequestParam String sellID) {
		if ( sellID.length() > 0) {
			return service.selectSellingBySellID(sellID);
		}
		return null;
	}
	
	/**
	 * 新增销售记录
	 */
	@RequestMapping("/insertSelling")
	@ResponseBody
	public void insertSelling(@RequestBody SellingDTO sellingDTO) {
		Selling selling = new Selling();
		selling.setSellID(sellingDTO.getSellID());
		selling.setPhoneBrand(sellingDTO.getPhoneBrand());
		selling.setPhoneID(sellingDTO.getPhoneID());
		selling.setPhone(phoneService.selectPhoneByPhoneID(selling.getPhoneID()));
		selling.setProfit(sellingDTO.getProfit());
		selling.setReceiveState(sellingDTO.getReceiveState());
		selling.setSellCount(sellingDTO.getSellCount());
		selling.setSellTime(sellingDTO.getSellTime());
		selling.setSupplierID(sellingDTO.getSupplierID());
		selling.setSupplier(supplierService.selectSupplierBySupplierID(selling.getSupplierID()));
		selling.setTotalPrice(sellingDTO.getTotalPrice());
		selling.setUserName(sellingDTO.getUserName());
		selling.setRegister(registerService.selectRegisterByUserName(selling.getUserName()));
		if (selling !=  null) {
			service.insertSelling(selling);
		}
	}

}

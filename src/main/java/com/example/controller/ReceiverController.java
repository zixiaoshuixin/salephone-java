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

import com.example.dto.ReceiverDTO;
import com.example.pojo.Receiver;
import com.example.service.PhoneService;
import com.example.service.ReceiverService;

@Controller
@CrossOrigin
public class ReceiverController {
	
	@Autowired
	private ReceiverService receiverService;
	
	@Autowired
	private PhoneService phoneService;

	/**
	 * 新增收货人
	 */
	@RequestMapping("/insertReceiver")
	@ResponseBody
	public void insertReceiver(@RequestBody ReceiverDTO receiverDTO) {
		Receiver receiver = new Receiver();
		receiver.setReceiverID(receiverDTO.getReceiverID());
		receiver.setPhoneID(receiverDTO.getPhoneID());
		receiver.setReceiverName(receiverDTO.getReceiverName());
		receiver.setReceiverTele(receiverDTO.getReceiverTele());
		receiver.setReceiverCity(receiverDTO.getReceiverCity());
		receiver.setReceiverAddress(receiverDTO.getReceiverAddress());
		receiver.setReceiverEmail(receiverDTO.getReceiverAddress());
		receiver.setPhone(phoneService.selectPhoneByPhoneID(receiver.getPhoneID()));
		
		System.out.println(receiver.toString());
		if (receiver != null) {
			receiverService.insertReceiver(receiver.getReceiverID(),receiver.getPhoneID(),receiver.getReceiverName(),receiver.getReceiverTele(),receiver.getReceiverCity(),receiver.getReceiverAddress(),receiver.getReceiverEmail());
		}
	}
	
	/**
	 * 删除收货人
	 */
	@RequestMapping("/deleteReceiverByID")
	@ResponseBody
	public void deleteReceiverByID(@RequestParam String receiverID) {
		if (receiverID.length() > 0) {
			receiverService.deleteReceiverByID(receiverID);
		}
	}
	
	/**
	 * 查询所有收货人
	 */
	@RequestMapping("/selectAllReceivers")
	@ResponseBody
	public List<Receiver> selectAllReceivers(){
		return receiverService.selectAllReceivers();
	}
	
	/**
	 * 根据收货人ID查询收货人
	 */
	@RequestMapping("/selectReceiverByID")
	@ResponseBody
	public Receiver selectReceiverByID(@RequestParam String receiverID) {
		if (receiverID.length() > 0) {
			return receiverService.selectReceiverByID(receiverID);
		}
		return null;
	}
	
	/**
	 * 修改收货人信息
	 */
	@RequestMapping("/updateReceiver")
	@ResponseBody
	public void updateReceiver(@RequestBody ReceiverDTO receiverDTO) {
		Receiver receiver = new Receiver();
		receiver.setReceiverID(receiverDTO.getReceiverID());
		receiver.setPhoneID(receiverDTO.getPhoneID());
		receiver.setReceiverName(receiverDTO.getReceiverName());
		receiver.setReceiverTele(receiverDTO.getReceiverTele());
		receiver.setReceiverCity(receiverDTO.getReceiverCity());
		receiver.setReceiverAddress(receiverDTO.getReceiverAddress());
		receiver.setReceiverEmail(receiverDTO.getReceiverAddress());
		receiver.setPhone(phoneService.selectPhoneByPhoneID(receiver.getPhoneID()));
		
		System.out.println(receiver.toString());
		if (receiver != null) {
			receiverService.updateReceiver(receiver);
		}
	}
}

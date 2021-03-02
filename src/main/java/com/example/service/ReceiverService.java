package com.example.service;

import java.util.List;

import com.example.pojo.Receiver;

public interface ReceiverService {
	
	/**
	 * 新增收货人
	 */
	int insertReceiver(String receiverID, String phoneID, String receiverName, String receiverTele, String receiverCity, String receiverAddress, String receiverEmail);
	
	/**
	 * 删除收货人
	 */
	int deleteReceiverByID(String receiverID);
	
	/**
	 * 查询所有收货人
	 */
	List<Receiver> selectAllReceivers();
	
	/**
	 * 根据收货人ID查询收货人
	 */
	Receiver selectReceiverByID(String receiverID);
	
	/**
	 * 修改收货人信息
	 */
	int updateReceiver(Receiver receiver);

}

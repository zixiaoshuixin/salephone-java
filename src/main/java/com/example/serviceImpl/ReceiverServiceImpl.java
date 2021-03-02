package com.example.serviceImpl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.ReceiverMapper;
import com.example.pojo.Receiver;
import com.example.service.ReceiverService;

@Service
public class ReceiverServiceImpl implements ReceiverService{

	@Autowired
	private ReceiverMapper mapper;

	@Override
	public int insertReceiver(String receiverID, String phoneID, String receiverName, String receiverTele, String receiverCity, String receiverAddress, String receiverEmail) {
		return mapper.insertReceiver( receiverID,  phoneID,  receiverName,  receiverTele,  receiverCity,  receiverAddress,  receiverEmail);
	}

	@Override
	public int deleteReceiverByID(String receiverID) {
		return mapper.deleteReceiverByID(receiverID);
	}

	@Override
	public List<Receiver> selectAllReceivers() {
		return mapper.selectAllReceivers();
	}

	@Override
	public Receiver selectReceiverByID(String receiverID) {
		return mapper.selectReceiverByID(receiverID);
	}

	@Override
	public int updateReceiver(Receiver receiver) {
		return mapper.updateReceiver(receiver);
	}
}

package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.pojo.Receiver;

@Mapper
public interface ReceiverMapper {
	
	/**
	 * 新增收货人
	 */
	int insertReceiver(@Param("receiverID") String receiverID,@Param("phoneID") String phoneID,@Param("receiverName") String receiverName,@Param("receiverTele") String receiverTele,@Param("receiverCity") String receiverCity,@Param("receiverAddress") String receiverAddress,@Param("receiverEmail") String receiverEmail);
	
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

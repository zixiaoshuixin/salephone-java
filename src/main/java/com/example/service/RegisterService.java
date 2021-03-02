package com.example.service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Register;

public interface RegisterService {
	/**
	 * 登录
	 * @param userName
	 * @param pwd
	 * @return
	 */
	Register login(@Param("userName") String userName,@Param("pwd") String pwd);
	
	/**
	 * 注册
	 * @param userName
	 * @param pwd
	 * @return
	 */
	int regist(String userName,String pwd,String regName,int regAge,String regSex,String regEmail,String regPhoto,String regType,Date loginTime,String tele,String regCity,String regAddress);
	
	/**
	 * 注销用户
	 * @param userName
	 * @return
	 */
	int deleteRegister(@Param("userName") String userName);
	
	/**
	 * 修改用户信息
	 * @param register
	 * @return
	 */
	int updateRegister( String userName, String pwd, String regName, int regAge, String regSex, String regEmail,@Param("regPhoto") String regPhoto, String regType, Date loginTime, String tele, String regCity, String regAddress);
	
	/**
	 * 根据用户名查询用户
	 * @param userName
	 * @return
	 */
	Register selectRegisterByUserName(@Param("userName") String userName);
	
	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<Register> selectAllRegisters();
	
	/**
	 * 查询所有管理员用户
	 * @return
	 */
	List<Register> selectAllAdmin();
	
	
	/**
	 * 查询所有普通用户
	 * @return
	 */
	List<Register> selectAllCommon();

	/**
	 * 判断用户是否存在
	 * @param userName
	 * @return
	 */
	int isExist(String userName);
}

package com.example.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.pojo.Register;

@Mapper
public interface RegisterMapper {

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
	int regist(@Param("userName") String userName,@Param("pwd") String pwd,@Param("regName") String regName,@Param("regAge") int regAge,@Param("regSex") String regSex,@Param("regEmail") String regEmail,@Param("regPhoto") String regPhoto,@Param("regType") String regType,@Param("loginTime") Date loginTime,@Param("tele") String tele,@Param("regCity") String regCity,@Param("regAddress") String regAddress);
	
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
	int updateRegister(@Param("userName") String userName,@Param("pwd") String pwd,@Param("regName") String regName,@Param("regAge") int regAge,@Param("regSex") String regSex,@Param("regEmail") String regEmail,@Param("regPhoto") String regPhoto,@Param("regType") String regType,@Param("loginTime") Date loginTime,@Param("tele") String tele,@Param("regCity") String regCity,@Param("regAddress") String regAddress);
	
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

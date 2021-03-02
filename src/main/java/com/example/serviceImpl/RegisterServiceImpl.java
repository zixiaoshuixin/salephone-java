package com.example.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.RegisterMapper;
import com.example.pojo.Register;
import com.example.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterMapper mapper;

	@Override
	public Register login(String userName, String pwd) {
		return mapper.login(userName, pwd);
	}

	@Override
	public int regist(String userName,String pwd,String regName,int regAge,String regSex,String regEmail,String regPhoto,String regType,Date loginTime,String tele,String regCity,String regAddress) {
		return mapper.regist( userName, pwd, regName, regAge, regSex, regEmail, regPhoto, regType, loginTime, tele, regCity, regAddress);
	}

	@Override
	public int deleteRegister(String userName) {
		return mapper.deleteRegister(userName);
	}

	@Override
	public int updateRegister(String userName,String pwd,String regName,int regAge,String regSex,String regEmail,String regPhoto,String regType,Date loginTime,String tele,String regCity,String regAddress) {
		return mapper.updateRegister(userName, pwd, regName, regAge, regSex, regEmail, regPhoto, regType, loginTime, tele, regCity, regAddress);
	}

	@Override
	public Register selectRegisterByUserName(String userName) {
		return mapper.selectRegisterByUserName(userName);
	}

	@Override
	public List<Register> selectAllRegisters() {
		return mapper.selectAllRegisters();
	}

	@Override
	public List<Register> selectAllAdmin() {
		return mapper.selectAllAdmin();
	}

	@Override
	public List<Register> selectAllCommon() {
		return mapper.selectAllCommon();
	}

	@Override
	public int isExist(String userName) {
		// TODO Auto-generated method stub
		return mapper.isExist(userName);
	}
}

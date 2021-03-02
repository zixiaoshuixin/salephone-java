package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.Register;
import com.example.service.RegisterService;

@Controller
@CrossOrigin
public class RegisterController {
	
	@Autowired
	private RegisterService service;
	
	
	
	/**
	 * 登录
	 * @param userName
	 * @param pwd
	 * @return
	 */
	@RequestMapping("/login/userLogin")
	@ResponseBody
	public Register login(@RequestParam("userName") String userName,@RequestParam("pwd") String pwd) {
		System.out.println("userName:"+userName);
		System.out.println("pwd:"+pwd);
		if (userName.length() > 0 && pwd.length() > 0 && pwd.length() <= 20 && userName.length() <= 20) {
			return service.login(userName, pwd);
		}
		return null;
	}
	
	/**
	 * 注册
	 * @param userName
	 * @param pwd
	 * @return
	 */
	@RequestMapping("/register/userRegist")
	@ResponseBody
	public void regist(@RequestBody Register register) {
		String userName = register.getUserName();
		String pwd = register.getPwd();
		System.out.println("userName:"+userName);
		System.out.println("pwd:"+pwd);
		if (userName.length() > 0 && pwd.length() > 0 && pwd.length() <= 20 && userName.length() <= 20) {
			Register reourceRegister = selectRegisterByUserName(userName);
			if (reourceRegister == null) {
				service.regist(register.getUserName(),register.getPwd(),register.getRegName(),register.getRegAge(),register.getRegSex(),register.getRegEmail(),register.getRegPhoto(),register.getRegType(),register.getLoginTime(),register.getTele(),register.getRegCity(),register.getRegAddress());
			}
		}
	}
	
	/**
	 * 注销用户
	 * @param userName
	 * @return
	 */
	@RequestMapping("/deleteRegister")
	@ResponseBody
	public void deleteRegister(@RequestParam("userName") String userName) {
		System.out.println("userName:"+userName);
		if (userName.length() > 0 && userName.length() <= 20) {
			int register =  service.deleteRegister(userName);
		}
		
	}
	
	/**
	 * 修改用户信息
	 * @param register
	 * @return
	 */
	@RequestMapping("/updateRegister")
	@ResponseBody
	public void updateRegister(@RequestBody Register register) {
		System.out.println(register.toString());
		if (register != null) {
			service.updateRegister(register.getUserName(),register.getPwd(),register.getRegName(),register.getRegAge(),register.getRegSex(),register.getRegEmail(),register.getRegPhoto(),register.getRegType(),register.getLoginTime(),register.getTele(),register.getRegCity(),register.getRegAddress());
		}
	}
	
	/**
	 * 根据用户名查询用户
	 * @param userName
	 * @return
	 */
	@RequestMapping("/selectRegisterByUserName")
	@ResponseBody
	public Register selectRegisterByUserName(@RequestParam("userName") String userName) {
		System.out.println("userName:"+userName);
		if (userName.length() > 0 && userName.length() <= 20) {
			return service.selectRegisterByUserName(userName);
		}
		return null;
	}
	
	
	/**
	 * 查询所有用户
	 * @return
	 */
	@RequestMapping("/selectAllRegisters")
	@ResponseBody
	public List<Register> selectAllRegisters(){
		return service.selectAllRegisters();
	}
	
	/**
	 * 查询所有管理员用户
	 * @return
	 */
	@RequestMapping("/selectAllAdmin")
	@ResponseBody
	public List<Register> selectAllAdmin(){
		return service.selectAllAdmin();
	}
	
	
	/**
	 * 查询所有普通用户
	 * @return
	 */
	@RequestMapping("/selectAllCommon")
	@ResponseBody
	public List<Register> selectAllCommon(){
		return service.selectAllCommon();
	}
	
	@RequestMapping("/isExist")
	public boolean isExist(@RequestParam("userName") String userName) {
		int result = service.isExist(userName);
		if (result == 0) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * 恢复注销用户
	 * @param register
	 */
	public void undoDelete(@RequestBody Register register) {
		
	}
}

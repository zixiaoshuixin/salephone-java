package com.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.pojo.User;
import com.example.util.JSONResult;

@Component
public interface UserService {
	// 登录
	String login(String userName);
	
	String getToken(User user);

	// 注册
	Integer register(String userName, String pwd, Integer age, String sex, String email, String userType, Date regTime,String regPhoto);
	
	//注册时用户名是否存在
	Integer isExist(String userName);
	
	//记录登录时间
	void addLoginTime(Date loginTime,String userName);
	
	//个人设置
	Integer userSetting(String userName,String sex,Integer age,String email);
	
	//获取用户列表
	List<User> getUserList(Integer page,Integer pageSize);
	
	//获取用户总数
	Integer getUserCount();
	
	//删除用户
	Integer deleteUser(String userName);
	
	//编辑用户
	Integer edituser(String userName,String password,String sex,Integer age,String email,String userType);
	
	//查询用户密码
	String getPassword(String userName);
	
	//修改用户密码
	Integer editPassword(String userName,String newPassword);
	
	//根据用户名查询
	User selectUser(String userName);
	
	//获取用户类型
	String getUserType(String userName);
	
	//上传图片
	Integer updatePhoto(String userName,String regPhoto);
}

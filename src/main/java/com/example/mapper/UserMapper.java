package com.example.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.pojo.User;
import com.example.util.JSONResult;

@Mapper
@Component
public interface UserMapper {

	// 登录
	String login(@Param("userName")String userName);

	// 注册
	Integer register(@Param("userName") String userName, @Param("pwd") String pwd, @Param("regAge") Integer age,
			@Param("regSex") String sex, @Param("regEmail") String email, @Param("userType") String userType,
			@Param("regTime") Date regTime,@Param("regPhoto")String regPhoto);

	// 注册时用户名是否存在
	Integer isExist(@Param("userName")String userName);

	// 记录登录时间
	void addLoginTime(@Param("loginTime")Date loginTime, @Param("userName")String userName);

	// 个人设置
	Integer userSetting(@Param("userName") String userName, @Param("sex") String sex, @Param("age") Integer age,
			@Param("email") String email);

	// 获取用户列表
	List<User> getUserList(@Param("index") Integer index, @Param("pageSize") Integer pageSize);

	// 获取用户总数
	Integer getUserCount();

	// 删除用户
	Integer deleteUser(@Param("userName") String userName);

	// 编辑用户
	Integer edituser(@Param("userName") String userName, @Param("password") String password, @Param("sex") String sex,
			@Param("age") Integer age, @Param("email") String email, @Param("userType") String userType);

	// 查询用户密码
	String getPassword(@Param("userName") String userName);

	// 修改用户密码
	Integer editPassword(@Param("userName") String userName, @Param("newPassword") String newPassword);

	// 根据用户名查询
	User selectUser(@Param("userName") String userName);

	// 获取用户类型
	String getUserType(@Param("userName") String userName);

	// 上传图片
	Integer updatePhoto(@Param("userName")String userName, @Param("regPhoto")String regPhoto);
}

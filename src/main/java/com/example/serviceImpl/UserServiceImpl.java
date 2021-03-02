package com.example.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public String login(String userName) {
        return userMapper.login(userName);
    }

    @Override
    public Integer register(String userName, String pwd, Integer age, String sex, String email,String userType,Date regTime,String regPhoto) {
    	Integer result = userMapper.register(userName, pwd, age,sex, email,userType,regTime,regPhoto);
        return result;
    }

	@Override
	public Integer isExist(String userName) {
		Integer result = userMapper.isExist(userName);
		return result;
	}

	@Override
	public void addLoginTime(Date loginTime,String userName) {
		userMapper.addLoginTime(loginTime,userName);
	}

	@Override
	public Integer userSetting(String userName, String sex, Integer age, String email) {
		return userMapper.userSetting(userName, sex, age, email);
	}

	@Override
	public List<User> getUserList(Integer page, Integer pageSize) {
		Integer index = (page-1)*pageSize;
		return userMapper.getUserList(index, pageSize);
	}

	@Override
	public Integer getUserCount() {
		return userMapper.getUserCount();
	}

	@Override
	public Integer deleteUser(String userName) {
		return userMapper.deleteUser(userName);
	}

	@Override
	public Integer edituser(String userName, String password, String sex, Integer age, String email, String userType) {
		return userMapper.edituser(userName, password, sex, age, email, userType);
	}

	@Override
	public String getPassword(String userName) {
		return userMapper.getPassword(userName);
	}

	@Override
	public Integer editPassword(String userName, String newPassword) {
		return userMapper.editPassword(userName, newPassword);
	}

	@Override
	public User selectUser(String userName) {
		return userMapper.selectUser(userName);
	}

	@Override
	public String getUserType(String userName) {
		return userMapper.getUserType(userName);
	}

	@Override
	public Integer updatePhoto(String userName, String regPhoto) {
		return userMapper.updatePhoto(userName, regPhoto);
	}

	@Override
	public String getToken(User user) {
		String token = "";
		 //Algorithm.HMAC256():使用HS2556生成token，密匙则是用户的密码，唯一密匙的话可以保存在服务端
        //withAudience()存入需要保存在token的信息，这里把用户id存入token中
        token = JWT.create().withAudience(user.getUserName())
                .sign(Algorithm.HMAC256(user.getPwd()));
		return token;
	}
	
	
}

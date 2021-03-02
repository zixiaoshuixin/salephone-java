package com.example.pojo;

import java.util.Date;

public class User {
	/**
	 * 用户名
	 */
    private String userName;

    /**
     * 用户密码
     */
    private String pwd;

    /**
     * 用户年龄
     */
    private Integer regAge;
    
    
    /**
     *用户性别
     */
    private String regSex;

    /**
     * 用户邮箱
     */
    private String regEmail;

    /**
     * 用户头像地址
     */
    private String regPhoto;

    /**
     * 用户角色标识：普通用户/管理员
     */
    private String userType;

    /**
     * 用户注册时间
     */
    private Date regTime;

    /**
     * 用户登录时间
     */
    private Date loginTime;

    public User() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getRegAge() {
		return regAge;
	}

	public void setRegAge(Integer regAge) {
		this.regAge = regAge;
	}

	public String getRegSex() {
		return regSex;
	}

	public void setRegSex(String regSex) {
		this.regSex = regSex;
	}

	public String getRegEmail() {
		return regEmail;
	}

	public void setRegEmail(String regEmail) {
		this.regEmail = regEmail;
	}

	public String getRegPhoto() {
		return regPhoto;
	}

	public void setRegPhoto(String regPhoto) {
		this.regPhoto = regPhoto;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", pwd=" + pwd + ", regAge=" + regAge + ", regSex=" + regSex
				+ ", regEmail=" + regEmail + ", regPhoto=" + regPhoto + ", userType=" + userType + ", regTime=" + regTime
				+ ", loginTime=" + loginTime + "]";
	}

	
    
}
package com.example.pojo;

import java.util.Date;

public class Register {
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 登录密码
	 */
	private String pwd;
	
	/**
	 * 用户真实姓名
	 */
	private String regName;
	
	/**
	 * 年龄
	 */
	private int regAge;
	
	/**
	 * 性别
	 */
	private String regSex;
	
	/**
	 * 邮箱
	 */
	private String regEmail;
	
	/**
	 * 用户头像地址
	 */
	private String regPhoto;
	
	/**
	 * 管理员标识符： 0表示普通用户，1表示管理员
	 */
	private String regType;
	
	/**
	 * 登录时间
	 */
	private Date loginTime;
	
	/**
	 * 用户电话
	 */
	private String tele;
	
	/**
	 *所在城市
	 */
	private String regCity;
	
	/**
	 * 
	 */
	private String regAddress;
	public Register() {
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
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public int getRegAge() {
		return regAge;
	}
	public void setRegAge(int regAge) {
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
	public String getRegType() {
		return regType;
	}
	public void setRegType(String regType) {
		this.regType = regType;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getRegCity() {
		return regCity;
	}
	public void setRegCity(String regCity) {
		this.regCity = regCity;
	}
	public String getRegAddress() {
		return regAddress;
	}
	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}
	@Override
	public String toString() {
		return "Register [userName=" + userName + ", pwd=" + pwd + ", regName=" + regName + ", regAge=" + regAge
				+ ", regSex=" + regSex + ", regEmail=" + regEmail + ", regPhoto=" + regPhoto + ", regType=" + regType
				+ ", loginTime=" + loginTime + ", tele=" + tele + ", regCity=" + regCity + ", regAddress=" + regAddress
				+ "]";
	}
	
	

}

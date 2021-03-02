package com.example.pojo;

import java.util.Date;

public class Passage {	
	/*
	 * 文章标识符
	 */
	private String postID;
	
	/**
	 * 文章标题
	 */
	private String postTitle;
	
	/**
	 * 文章内容
	 */
	private String postText;
	
	/**
	 * 浏览人数
	 */
	private int postPageviews;
	
	/**
	 * 文章合成语音URL地址
	 */
	private String postAudio;
	
	/**
	 * 文章发表时间
	 */
	private Date postTime;
	
	/**
	 * 点赞数
	 */
	private int postPageSupport;
	
	/**
	 * 最后评论时间
	 */
	private Date lastCmTime;
	
	/**
	 * 作者用户名
	 */
	private String userName;
	
	/**
	 * 作者
	 */
	private User user;
	
	public Passage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPostID() {
		return postID;
	}
	public void setPostID(String postID) {
		this.postID = postID;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostText() {
		return postText;
	}
	public void setPostText(String postText) {
		this.postText = postText;
	}
	public int getPostPageviews() {
		return postPageviews;
	}
	public void setPostPageviews(int postPageviews) {
		this.postPageviews = postPageviews;
	}
	public String getPostAudio() {
		return postAudio;
	}
	public void setPostAudio(String postAudio) {
		this.postAudio = postAudio;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public int getPostPageSupport() {
		return postPageSupport;
	}
	public void setPostPageSupport(int postPageSupport) {
		this.postPageSupport = postPageSupport;
	}
	
	
	
	
	public Date getLastCmTime() {
		return lastCmTime;
	}
	public void setLastCmTime(Date lastCmTime) {
		this.lastCmTime = lastCmTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Passage [postID=" + postID + ", postTitle=" + postTitle + ", postText=" + postText + ", postPageviews="
				+ postPageviews + ", postAudio=" + postAudio + ", postTime=" + postTime + ", postPageSupport="
				+ postPageSupport + ", lastCmTime=" + lastCmTime + ", userName=" + userName + ", user=" + user + "]";
	}


	
}

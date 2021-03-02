package com.example.dto;

import java.util.Date;

public class NoticeDTO {
	/**
	 * 
	 * 公告标识符
	 */
	private String noticeID;
	
	/**
	 * 公告标题
	 */
	private String noticeTitle;
	
	
	/**
	 * 公告内容
	 */
	private String noticeText;
	
	/**
	 * 发布时间
	 */
	private Date publishTime;
	
	/**
	 * 浏览人数
	 */
	private int views;
	
	/**
	 * 公告发布者的用户名
	 */
	private String userName;

	public String getNoticeID() {
		return noticeID;
	}

	public void setNoticeID(String noticeID) {
		this.noticeID = noticeID;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeText() {
		return noticeText;
	}

	public void setNoticeText(String noticeText) {
		this.noticeText = noticeText;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "NoticeDTO [noticeID=" + noticeID + ", noticeTitle=" + noticeTitle + ", noticeText=" + noticeText
				+ ", publishTime=" + publishTime + ", views=" + views + ", userName=" + userName + "]";
	}
	
	

}

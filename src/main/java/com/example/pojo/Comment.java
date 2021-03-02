package com.example.pojo;

import java.util.Date;

public class Comment {

	/**
	 * 评论标识符
	 */
    private String cmID;
    
    /**
     * 评论合成语音URL地址
     */
    private String cmAudio;
    
    /**
     * 评论时间
     */
    private Date cmTime;
    
    /**
     * 评论内容
     */
    private String cmText;
    
    /**
     * 评论获赞数
     */
    private int cmSupport;
    
    private String postID;
    private String userName;
    private Passage passage;
    private User user;

    public Comment() {
    }



	public String getCmID() {
        return cmID;
    }

    public void setCmID(String cmID) {
        this.cmID = cmID;
    }

    public String getCmAudio() {
        return cmAudio;
    }

    public void setCmAudio(String cmAudio) {
        this.cmAudio = cmAudio;
    }

    public Date getCmTime() {
        return cmTime;
    }

    public void setCmTime(Date cmTime) {
        this.cmTime = cmTime;
    }

    public String getCmText() {
        return cmText;
    }

    public void setCmText(String cmText) {
        this.cmText = cmText;
    }

    
	public int getCmSupport() {
		return cmSupport;
	}



	public void setCmSupport(int cmSupport) {
		this.cmSupport = cmSupport;
	}

	


	public String getPostID() {
		return postID;
	}



	public void setPostID(String postID) {
		this.postID = postID;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Passage getPassage() {
		return passage;
	}



	public void setPassage(Passage passage) {
		this.passage = passage;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Comment [cmID=" + cmID + ", cmAudio=" + cmAudio + ", cmTime=" + cmTime + ", cmText=" + cmText
				+ ", cmSupport=" + cmSupport + ", postID=" + postID + ", userName=" + userName + ", passage=" + passage
				+ ", user=" + user + "]";
	}
}

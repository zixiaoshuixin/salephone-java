package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Notice;

@Mapper
public interface NoticeMapper {
	
	/**
	 * 查询所有公告
	 */
	List<Notice> selectAllNotices();
	
	/**
	 * 查询一个用户的所有公告
	 */
	List<Notice> selectAllNoticesOfOneUser(String userName);
	
	/**
	 * 根据公告ID查询公告
	 */
	Notice selectNoticeByID(String noticeID);
	
	
	/**
	 * 根据公告名称查询公告
	 */
	List<Notice> selectNoticesByNoticeTitle(String noticeTitle);
	
	/**
	 * 根据公告ID删除公告
	 */
	int deleteNoticeByID(String noticeID);
	
	/**
	 * 发布公告
	 */
	int insertNotice(Notice notice);
	
	/**
	 * 修改、编辑公告
	 */
	int updateNotice(Notice notice);

}

package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.NoticeMapper;
import com.example.pojo.Notice;
import com.example.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeMapper mapper;

	@Override
	public List<Notice> selectAllNotices() {
		return mapper.selectAllNotices();
	}

	@Override
	public List<Notice> selectAllNoticesOfOneUser(String userName) {
		return mapper.selectAllNoticesOfOneUser(userName);
	}

	@Override
	public Notice selectNoticeByID(String noticeID) {
		return mapper.selectNoticeByID(noticeID);
	}

	@Override
	public List<Notice> selectNoticesByNoticeTitle(String noticeTitle) {
		return mapper.selectNoticesByNoticeTitle(noticeTitle);
	}

	@Override
	public int deleteNoticeByID(String noticeID) {
		return mapper.deleteNoticeByID(noticeID);
	}

	@Override
	public int insertNotice(Notice notice) {
		return mapper.insertNotice(notice);
	}

	@Override
	public int updateNotice(Notice notice) {
		return mapper.updateNotice(notice);
	}
}

package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.NoticeDTO;
import com.example.pojo.Notice;
import com.example.service.NoticeService;
import com.example.service.RegisterService;

@Controller
@CrossOrigin
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@Autowired
	private RegisterService registerService;
	
	/**
	 * 查询所有公告
	 */
	@RequestMapping("/selectAllNotices")
	@ResponseBody
	public List<Notice> selectAllNotices(){
		return service.selectAllNotices();
	}
	
	/**
	 * 查询一个用户的所有公告
	 */
	@RequestMapping("/selectAllNoticesOfOneUser")
	@ResponseBody
	public List<Notice> selectAllNoticesOfOneUser(String userName){
		if (userName.length() > 0) {
			return service.selectAllNoticesOfOneUser(userName);
		}
		return null;
	}
	
	/**
	 * 根据公告ID查询公告
	 */
	@RequestMapping("/selectNoticeByID")
	@ResponseBody
	public Notice selectNoticeByID(@RequestParam String noticeID) {
		if (noticeID.length() > 0) {
			return service.selectNoticeByID(noticeID);
		}
		return null;
	}
	
	
	/**
	 * 根据公告名称查询公告
	 */
	@RequestMapping("/selectNoticesByNoticeTitle")
	@ResponseBody
	public List<Notice> selectNoticesByNoticeTitle(@RequestParam String noticeTitle){
		if (noticeTitle.length() > 0) {
			return service.selectNoticesByNoticeTitle(noticeTitle);
		}
		return null;
	}
	
	/**
	 * 根据公告ID删除公告
	 */
	@RequestMapping("/deleteNoticeByID")
	public void deleteNoticeByID(@RequestParam String noticeID){
		if (noticeID.length() > 0) {
			service.deleteNoticeByID(noticeID);
		}
	}
	
	/**
	 * 发布公告
	 */
	@RequestMapping("/insertNotice")
	@ResponseBody
	public void insertNotice(@RequestBody NoticeDTO noticeDTO) {
		Notice notice = new Notice();
		notice.setNoticeID(noticeDTO.getNoticeID());
		notice.setNoticeText(noticeDTO.getNoticeText());
		notice.setNoticeTitle(noticeDTO.getNoticeTitle());
		notice.setPublishTime(noticeDTO.getPublishTime());
		notice.setUserName(noticeDTO.getUserName());
		notice.setRegister(registerService.selectRegisterByUserName(notice.getUserName()));
		notice.setViews(noticeDTO.getViews());
		if (notice != null) {
			service.insertNotice(notice);
		}
	}
	
	/**
	 * 修改、编辑公告
	 */
	@RequestMapping("/updateNotice")
	@ResponseBody
	public void updateNotice(@RequestBody NoticeDTO noticeDTO) {
		Notice notice = new Notice();
		notice.setNoticeID(noticeDTO.getNoticeID());
		notice.setNoticeText(noticeDTO.getNoticeText());
		notice.setNoticeTitle(noticeDTO.getNoticeTitle());
		notice.setPublishTime(noticeDTO.getPublishTime());
		notice.setUserName(noticeDTO.getUserName());
		notice.setRegister(registerService.selectRegisterByUserName(notice.getUserName()));
		notice.setViews(noticeDTO.getViews());
		if (notice != null) {
			service.updateNotice(notice);
		}
	}
}

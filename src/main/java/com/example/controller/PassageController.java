package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.Passage;
import com.example.pojo.User;
import com.example.serviceImpl.PassageServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;


@Controller
@RequestMapping("/passage")
@Api
@CrossOrigin
public class PassageController {
	
	@Autowired
	PassageServiceImpl serviceImpl;
	
	/**
	 * 发布文章
	 * @param passage
	 */
	@RequestMapping("/insertPassage")
	@ResponseBody
	public void insertPassage(@RequestBody Passage passage) {
		System.out.println(passage.toString());
		if(passage != null) {
			Date date = new Date();
			passage.setPostID(String.valueOf(date.getTime()));
			serviceImpl.insertPassage(passage);
		}
	}

	 
	 /**
	  * 根据文章Id删除一篇文章
	  * @param postID
	  */
	@RequestMapping("/deletePassageById")
	@ResponseBody
	public String deletePassageById(String postID) {
		if (postID.length() != 0) {
			int affectedRecords = serviceImpl.deletePassageById(postID);
			return String.valueOf(affectedRecords);
		}
		return null;
	}
	 
	 /**
	  * 对所有文章进行列表显示
	  * @return
	  */
	@RequestMapping("/selectAllPassages")
	@ResponseBody
	@ApiImplicitParam
	public List<Passage> selectAllPassages(){
		List<Passage> allPassages = serviceImpl.selectAllPassages();
		for (Passage passage : allPassages) {
			passage.setUser(selectUserByUserName(passage.getUserName()));
		}
		return allPassages;
	}
	 
	 
	 /**
	  * 根据文章ID查看文章内容及发表文章的用户信息
	  * @return
	  */
	@RequestMapping("/selectPassageById")
	@ResponseBody
	public Passage selectPassageById(String postID) {
		if (postID.length() != 0) {
			System.out.println(serviceImpl.selectPassageById(postID).toString());
			return serviceImpl.selectPassageById(postID);
		}
		return null;

	}
	 
	 
	 /**
	  * 编辑、修改文章
	  * @param passage
	  */
	@RequestMapping("/updatePassage")
	@ResponseBody
	public String updatePassage(@RequestBody Passage passage) {
		if (passage != null) {
			int affectedRecords = serviceImpl.updatePassage(passage);
			return String.valueOf(affectedRecords);
		}
		return null;
	}
	 
	 /**
	  * 我的文章：查看某一用户发布的所有文章
	  * @return
	  */
	@RequestMapping("/selectPassagesOfOneUser")
	@ResponseBody
	public List<Passage> selectPassagesOfOneUser(String userName){
		if (userName.length() < 20 && userName.length() > 0) {
			return serviceImpl.selectPassagesOfOneUser(userName);
		}
		return null;
	}

	
	public User selectUserByUserName(String userName) {
		if (userName.length() < 20 && userName.length() > 0) {
			return serviceImpl.selectUserByUserName(userName);
		}
		return null;
	}
}

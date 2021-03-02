package com.example.service;

import java.util.List;

import com.example.pojo.Passage;
import com.example.pojo.User;

public interface PassageService {	
	/**
	 * 发布文章
	 * @param passage
	 */
	int insertPassage(Passage passage);
	
	/**
	 * 根据文章Id删除一篇文章
	 * @param postID
	 */
	int deletePassageById(String postID);
	
	/**
	 * 对所有文章进行列表显示
	 * @return
	 */
	List<Passage> selectAllPassages();
	
	
	/**
	 * 根据文章ID查看文章内容及发表文章的用户信息
	 * @return
	 */
	Passage selectPassageById(String postID);
	
	
	/**
	 * 编辑、修改文章
	 * @param passage
	 */
	int updatePassage(Passage passage);
	
	/**
	 * 我的文章：查看某一用户发布的所有文章
	 * @return
	 */
	List<Passage> selectPassagesOfOneUser(String userName);
	
	/**
	 * 查询对应文章的用户
	 */
	User selectUserByUserName(String userName);

}

package com.example.serviceImpl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.PassageMapper;
import com.example.pojo.Passage;
import com.example.pojo.User;
import com.example.service.PassageService;


@Service
public class PassageServiceImpl implements PassageService{
	
	@Autowired
	private PassageMapper mapper;

	@Override
	public int insertPassage(Passage passage) {
		return mapper.insertPassage(passage);
	}

	@Override
	public int deletePassageById(String postID) {
		return mapper.deletePassageById(postID);
	}

	@Override
	public List<Passage> selectAllPassages() {
		return mapper.selectAllPassages();
	}

	@Override
	public Passage selectPassageById(String postID) {
		return mapper.selectPassageById(postID);
	}

	@Override
	public int updatePassage(Passage passage) {
		return mapper.updatePassage(passage);
	}

	@Override
	public List<Passage> selectPassagesOfOneUser(String userName) {
		return mapper.selectPassagesOfOneUser(userName);
	}

	@Override
	public User selectUserByUserName(String userName) {
		return mapper.selectUserByUserName(userName);
	}

}

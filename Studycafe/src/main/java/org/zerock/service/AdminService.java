package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Kategorie;
import org.zerock.domain.User;
import org.zerock.mapper.KateMapper;
import org.zerock.mapper.UserMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class AdminService {
	
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private KateMapper kateMapper;
	
	public List<User> getUserList() {
		return userMapper.selectAll();
	}
	
	public List<Kategorie> getKateList() {
		return kateMapper.selectKateList("2");
	}
}

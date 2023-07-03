package org.zerock.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.User;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UserMapperTests {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testSelectAll() {
		userMapper.selectAll();
	}
	
	@Test 
	public void create() {
		User user = new User();
		user.setUserId("id");
		user.setUserPwd("pwd");
		user.setUserName("정재은");
		user.setUserEmail("uni@gmail.com");
		user.setUserCp("E");
		user.setUserAddr("경기도 양주시");
		user.setUserDaddr("중심상가로 22");
		userMapper.create(user);
	}
}

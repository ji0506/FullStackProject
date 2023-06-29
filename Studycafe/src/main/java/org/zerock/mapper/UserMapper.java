package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.User;

public interface UserMapper {

	
	User selectUserLogin(String userId);
	
	List<User> selectAll();
	
}

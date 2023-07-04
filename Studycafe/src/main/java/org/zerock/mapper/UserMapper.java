package org.zerock.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.zerock.domain.User;

public interface UserMapper {

	User selectById(String userId);
	
	List<User> selectAll();
	
	User selectUserLogin(String userId);
	
	void create(User user);
	
	void update(User user);
	
	void gradeUpdate(String userId, int grade);
	
	void joinDateUpdate(String userId, Date date);
	
	void delete(String userId);
	
	User authenticatedUser(Map map);
	
	int idCheck(String userId);	
}

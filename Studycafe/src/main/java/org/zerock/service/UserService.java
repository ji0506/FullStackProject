package org.zerock.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.User;
import org.zerock.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class UserService {
	
	@Autowired
	private UserMapper Usermapper;

	public List<User> selectAll(){
		return Usermapper.selectAll();
	}
	
	public User getLoginUser(String id) {
		return Usermapper.selectUserLogin(id);
	}
	
	public void registerUser(User user) {
		Usermapper.create(user);
	}
	
	public void updateUser(User user) {
		Usermapper.update(user);
	}
	
	public void gradeUpdate(String userId, int grade) {
		Usermapper.gradeUpdate(userId, grade);
	}
	
	public void joinDateUpdate(String userId, Date date) {
		Usermapper.joinDateUpdate(userId, date);
	}
	
	public void delete(String userId) {
		Usermapper.delete(userId);
	}
	
	public User identifyUser(Map userMap) {
		return Usermapper.authenticatedUser(userMap);
	}
	
	public int idCheck(String userId) {
		return Usermapper.idCheck(userId);
	}
	
	public User selectById(String userId) {
		return Usermapper.selectById(userId);
	}
}

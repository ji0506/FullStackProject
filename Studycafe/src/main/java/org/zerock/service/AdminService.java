package org.zerock.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Board;
import org.zerock.domain.Comment;
import org.zerock.domain.Kategorie;
import org.zerock.domain.User;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.CommentMapper;
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
	
	@Autowired
	BoardMapper brdMapper;
	
	@Autowired
	CommentMapper comMapper;

	
	public List<User> getUserList() {
		return userMapper.selectAll();
	}
	
	public List<Kategorie> getKateList() {
		return kateMapper.selectKateList("2");
	}
	
	public Board getBoardView(int brdNo) {
		return brdMapper.selectById(brdNo);
	}
	
	
	
	
	
	
	public List<Kategorie> getMenu() {
		return kateMapper.selectKateList(null);
	}
	
	
	public Kategorie getKateView(int katNo) {
		return kateMapper.selectById(katNo);
	}

	
	public void savekat(Kategorie kat) {
		if (kat.getKateNo() == 0) {
			kateMapper.create(kat);
		} else {
			kateMapper.update(kat);
		}
	}
	
	public void removeUser(String id) {
		userMapper.delete(id);
	}
	
	public void removeKategorie(int katNo) {
		kateMapper.delete(katNo);
	}
	
	public List<Board> getBoardList(Map<String,Object> map){
		return brdMapper.getListWithPaging(map);
	}
	
	
//	public void save(Board brd) {
//
//		if(brd.getBrdNo() == 0) {
//			brdMapper.create(brd);
//		} else {
//			brdMapper.update(brd);			
//		}
//		
//	}
//	
//	
//	public void removeBoard(int brdNo) {
//		brdMapper.delete(brdNo);	
//	}
//	
//	
	public void CntUpdate(int brdNo) {
		brdMapper.CntUpdate(brdNo);	
	}
	
	public List<Comment> getCommentList(int brdNo){
		return comMapper.selectById(brdNo);
	}	

	
}

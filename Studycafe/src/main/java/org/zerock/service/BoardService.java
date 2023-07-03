package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Board;
import org.zerock.domain.Comment;
import org.zerock.domain.Common;
import org.zerock.domain.Kategorie;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.CommentMapper;
import org.zerock.mapper.KateMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BoardService  {
	
	@Autowired
	private BoardMapper BoardMapper;
	
	@Autowired
	private KateMapper katMapper;
	
	@Autowired
	private CommentMapper commentMapper;

	
	public List<Board> getBoardList(Common common) {
		
		return BoardMapper.selectBoardList(common);
	}

	public List<Comment> getCommentList(int brdNo) {
		
		return commentMapper.selectCommentList(brdNo);
	}

	
	public int CntUpdate(int brdNo){
		return BoardMapper.CntUpdate(brdNo);
	}

	public List<Kategorie> getMenu(){
		return katMapper.selectKateList(null);
	}

	
	public int getVote(int brdNo){
		return BoardMapper.selectVote(brdNo);
	}

	
	public int removeBoard(int brdNo){
		return BoardMapper.delete(brdNo);
	}

	public Board getBoardView(int brdNo) {
		return BoardMapper.selectById(brdNo);
	}

	
	public void save(Board brd){

		if(brd.getBrdNo() == 0) {
			BoardMapper.create(brd);
		} else {
			BoardMapper.update(brd);
		}
	}
	
	public int VoteUpdate(Board vo) {

		int check = BoardMapper.selectVote(vo);	

		if(check == 0)
			BoardMapper.insertVote(vo);

		return check;
	}

	public void saveComment(Comment commnect) {
		commentMapper.create(commnect);
	}
	
	

	
	
}

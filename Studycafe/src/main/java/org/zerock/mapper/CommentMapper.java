package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.Comment;
import org.zerock.domain.Kategorie;

public interface CommentMapper {
	
	List<Comment> selectCommentList(int brdNo);
	
	Comment selectById(int brdNo);
	
	boolean create(Comment comment);
	
	void update(Comment comment);
	
	void delete(int comNo);
}

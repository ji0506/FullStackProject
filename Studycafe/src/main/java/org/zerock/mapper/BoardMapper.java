package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.Board;
import org.zerock.domain.Criteria;

public interface BoardMapper {

	public List<Board>selectBoardList(Board vo);
	
	public List<Board> getListWithPaging(Board vo, Criteria cri);
}

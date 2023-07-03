package org.zerock.mapper;

import java.util.List;
import java.util.Map;

import org.zerock.domain.Board;

public interface BoardMapper {

	public List<Board>selectBoardList(Board vo);
	
	public List<Board> getListWithPaging(Map<String, Object> map);
}

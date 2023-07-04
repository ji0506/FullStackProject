package org.zerock.mapper;

import java.util.List;
import java.util.Map;

import org.zerock.domain.Board;
import org.zerock.domain.Common;

public interface BoardMapper {

	public List<Board>selectBoardList(Common common);
	
	public List<Board> getListWithPaging(Map<String, Object> map);

	public int CntUpdate(int brdNo);

	public Board selectById(int brdNo);

	public int selectVote(int brdNo);

	public int create(Board brd);

	public int update(Board brd);

	public int delete(int brdNo);

	public int insertVote(Board brd);

	public int selectVote(Board brd);
	
	public List<Board> selectMainViewList();
}

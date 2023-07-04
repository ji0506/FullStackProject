package org.zerock.mapper;

import java.util.List;
import java.util.Map;

import org.zerock.domain.Seat;

public interface SeatMapper {

	
	
	List<Seat> selectSeatList();

	
	public Map<String,Integer> selectSeatCount();
	
	public void update(Seat vo);
	
}

package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Board;
import org.zerock.domain.Seat;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.SeatMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class SeatService  {
	
	@Autowired
	private SeatMapper Seatmapper;
	
	public List<Seat> getSeatList() {
		
		return Seatmapper.selectSeatList();
	}
	


}

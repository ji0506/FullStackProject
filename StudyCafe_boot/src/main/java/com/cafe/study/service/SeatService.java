package com.cafe.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.study.model.Seat;
import com.cafe.study.repository.SeatRepository;

@Service
public class SeatService  {
	
	@Autowired
	private SeatRepository seatRepository;
	
	public List<Seat> getSeatList() {
		return seatRepository.findAll();
	}

	/*
	public Map<String,Integer> getSeatCount() {
		
		return Seatmapper.selectSeatCount();
		
	}
	
	public void SeatUpdate(Seat vo) {
		 Seatmapper.update(vo);
		 System.out.println("����");
	}*/


}

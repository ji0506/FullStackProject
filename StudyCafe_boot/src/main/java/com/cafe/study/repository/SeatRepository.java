package com.cafe.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.study.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long>{
	
//	public List<Seat> findAll();
}

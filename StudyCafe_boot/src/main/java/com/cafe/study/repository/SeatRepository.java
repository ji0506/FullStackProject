package com.cafe.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.study.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long>{
	
	
}

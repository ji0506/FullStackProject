package com.cafe.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.study.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

}

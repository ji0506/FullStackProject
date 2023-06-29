package com.cafe.study.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.Date;


/**
 * The persistent class for the boards database table.
 * 
 */
@Entity
@Table(name="board")
@NamedQuery(name="Board.findAll", query="SELECT b FROM Board b")
@Data
public class Board implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brd_no;

	private String title;

	@Lob
	private String content;
	
	private String fileName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;

	private int kate_no;
	
	private int vote_no;

	private int cnt;
	
	private String user_id;

}
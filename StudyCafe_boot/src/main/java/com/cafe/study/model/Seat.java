package com.cafe.study.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
@Table(name="Seat")
@NamedQuery(name="Seat.findAll", query="SELECT s FROM Seat s")
@Data
public class Seat {

	@Id
	String seatNo;

	String seatComment;	

	String seatType;	

	@OneToOne
	@JoinColumn(name = "seatComment", insertable = false, updatable = false)
	@JsonIgnore
	SeatComment comment;

	@OneToOne
	@JoinColumn(name = "seatType", insertable = false, updatable = false)
	@JsonIgnore
	SeatType type;

	String userId;
	
	String regDate;
	  	
}

package com.cafe.study.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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

	String UserId;
}

package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.Kategorie;
import org.zerock.domain.Seat;

public interface KateMapper {
	
	List<Kategorie> selectKateList(String ketNo);
	
	Kategorie selectById(int kateNo);
	
	boolean create(Kategorie kate);
	
	void update(Kategorie kate);
	
	void delete(int kateNo);
}

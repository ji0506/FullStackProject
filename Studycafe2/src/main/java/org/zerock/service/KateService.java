package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Board;
import org.zerock.domain.Kategorie;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.KateMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class KateService  {
	
	@Autowired
	private KateMapper Katemapper;
	
	public List<Kategorie> getKateList(String ketNo) {
		
		return Katemapper.selectKateList(ketNo);
	}
	


}

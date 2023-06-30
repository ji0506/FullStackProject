package org.zerock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Board;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testPaging() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("section", 1);
		map.put("pageNum", 1);
		map.put("katNo", 3);

		List<Board> list = mapper.getListWithPaging(map);
		list.forEach(board -> log.info(board.getBrdNo()));
	}
}

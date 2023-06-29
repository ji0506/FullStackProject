package org.zerock.mapper;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Board;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public void testPaging() {
//		Board vo = new Board();
//		vo.setKateNo(3);
//		
//		Criteria cri = new Criteria();
//		cri.setPageNum(3);
//		cri.setAmount(10);
//		List<Board> list = mapper.getListWithPaging(vo, cri);
//		list.forEach(board -> log.info(board.getBrdNo()));
//	}
}

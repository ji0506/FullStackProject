package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class AdminServiceTests {
	@Autowired
	private AdminService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
//	@Test
//	public void testRegister() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		
//		service.getBoardList(null);
//		
//		log.info("CONFIRMED");
//		
//	}
	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testGetList() {
//		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testGet() {
//		log.info(service.get(1L));
//	}
//	
//	@Test
//	public void testDelete() {
//		log.info("REMOVED RESULT: " + service.remove(9L));
//	}
//	
//	@Test
//	public void testUpdate() {
//		BoardVO board = service.get(1L);
//		
//		if(board==null) {
//			return;
//		}
//		
//		board.setTitle("제목 수정합니다.");
//		log.info("MODIFY RESULT: "+service.modify(board));
//	}
}

package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Kategorie;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class KateMapperTests {
	
	
	@Autowired
	private KateMapper kateMapper;
	
	@Test
	public void selectKateList() {
		kateMapper.selectKateList("2");
	}
	
	@Test
	public void testselectid() {
		kateMapper.selectById(1);
	}
	
	@Test
	public void testCreate() {
		Kategorie kate = new Kategorie();
		kate.setKateName("Simpson");
		kate.setKateDetail("DOH!");
		kateMapper.create(kate);
	}
	
	@Test
	public void testUpdate() {
		Kategorie kate = new Kategorie();
		kate.setKateName("날다람쥐");
		kate.setKateDetail("안아달라고");
		kate.setKateNo(2);
		kateMapper.update(kate);
	}
	
	@Test
	public void testDelete() {
		kateMapper.delete(1);
	}
	
}

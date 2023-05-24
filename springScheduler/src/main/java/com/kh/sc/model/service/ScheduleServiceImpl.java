package com.kh.sc.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.kh.sc.model.vo.Category;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
//	@Scheduled(initialDelay = 1000, fixedDelay = 1000)
//	@Scheduled(cron = "* * * * * *") //매초마다 실행하여라
//	@Scheduled(cron = "*/2 * * * * *") //매 2초마다 실행하여라
	//매 10~20초 사이만
//	@Scheduled(cron = "10-20 * * * * *")
	//매분 0초마다
	@Scheduled(cron = "* * * * * *")
	//매시 정각마다
//	@Scheduled(cron = "0 0 * * * *")
	//매일 자정마다
//	@Scheduled(cron = "0 0 0 * * *")
	//매일 아침 6시마다
//	@Scheduled(cron = "0 0 6 * * *")
	//매월 1일 아침 7시마다
//	@Scheduled(cron = "0 0 7 1 * *")
	public void oneSecond() {
		
		Category category = Category.builder().categoryNo((int)(Math.random()*50)+100).categoryName("금융").build();
		
		sqlSession.insert("testMapper.insertCategory", category);
		log.debug("스케쥴러 테스트");
		
		
	}

}

package com.kh.sc;

import javax.swing.JOptionPane;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test2 {
	
	public static void main(String[] args) {
		//목표 : 앞 예제의 작업을 병렬로 처리하기
		//-main을 제외한 별도의 Thread가 필요하다.
		
		
		//스레드 생성 및 구동
		Thread t = new Thread() {
			
			@Override
			public void run() {
				//별도의 스레드로 동작할 내용 입력
				//1부터 100까지 출력
				for(int i=1; i<=100; i++) {
					
					log.debug("i = {}", i);
					
					//딜레이 주기
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}; // 생성
		
		t.start(); //구동
		
		//알림창
		JOptionPane.showMessageDialog(null, "안녕하세요");
		
		
		
	}
}

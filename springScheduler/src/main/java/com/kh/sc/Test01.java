package com.kh.sc;

import javax.swing.JOptionPane;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test01 {
	
	public static void main(String[] args) {
		//1개의 쓰레드(main)를 이용해서 두가지의 작업을 수행하려면
		//앞 작업이 수행이 끝나야 뒤 작업이 실행된다(Blocking)
		
		//알림창
		JOptionPane.showMessageDialog(null, "안녕하세요");
		
		//1부터 100까지 출력
		for(int i=1; i<=100; i++) {
			log.debug("i={}", i);
		}
	}
}

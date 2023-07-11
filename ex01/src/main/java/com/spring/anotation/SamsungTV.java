package com.spring.anotation;

import org.springframework.stereotype.Component;

@Component("tv")//component 이름 여러개 하려면 value
public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("삼성 TV를 켭니다.");

	}

}

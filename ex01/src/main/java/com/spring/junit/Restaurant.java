package com.spring.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //spring이 chef하고 autowired가 필요함-> autowired는 component가 필요함 
public class Restaurant {
	@Autowired
	Chef chef; //restaurant 생성하고 내용을 채울때 Chef하지 않으면 나머지 다 오류남
	

	public void open() {
		chef.cooking();
	}
}

package com.spring.anotation;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.junit.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml") //위를 만났을때 작동할 것
public class BeanTest {
	//@test 안쓰면 주석처리
	//@Test
	public void test() {
		System.out.println("단순테스트");
	}
	@Autowired
	ApplicationContext ctx;
	
	//@Test
	public void createBeanTest() {
		TV tv = (TV)ctx.getBean("xmlTv");//
		assertNotNull(tv);
	}
	
	//더 쉽게 하는 방법
	@Autowired
	Restaurant res; //바깥에 필드로 직접들고와서 테스트
	
	@Test
	public void createRestaurantTest() {
		res.open();
	}
	//bean은 항상 singleton
}

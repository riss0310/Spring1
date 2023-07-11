package com.yedam.app.tx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.tx.mapper.AaaMapper;
import com.yedam.app.tx.mapper.AaaService;

@Service
public class AaaServiceImpl implements AaaService {
	@Autowired
	AaaMapper aaaMapper;
	
	//하나의 트랜젝션으로 묶어서 실행할 수 있다. 찾아보기
	//aop를 기반으로 트렌젝션 만든거라 @service와 같이 와야함
	@Transactional()
	@Override
	public void insert() {
		aaaMapper.insert("101");
		aaaMapper.insert("987");
		//실행되야함
	}

}

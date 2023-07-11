package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.app.emp.service.EmpVO;
import com.yedam.app.mapper.EmpMapper;

@Controller

public class EmpController {
	
	@Autowired
	EmpMapper empMapper;
	
	//경로와 메소드를 결정짓는 부분 
	@RequestMapping(value = "emp", method = RequestMethod.GET)
	
	//메소드 시그니처, empVO 클라이언트가 보낸 형태를 받는 것
	//String = file을 찾는 것 
	//기본적으로 jsp 파일, 적혀있지는않지만 jsp파일을 찾음
	public String empList(Model model, EmpVO empVO) {
		model.addAttribute("emp", empMapper.getEmp(empVO));
		return "emp";
	}
}



















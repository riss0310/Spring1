package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data	//getter, setter사용하는거임 lombok있어야함
public class EmpVO {
	private int employeeId; //setting완료했으면 _쓰지 않아도됨
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	//시간이 필수 값으로 들어갈 때만 사용하기
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;
	private String jobId;
	private double salary;
	private double commissionPCT;
	private int managerId;
	private int departmentId;
}

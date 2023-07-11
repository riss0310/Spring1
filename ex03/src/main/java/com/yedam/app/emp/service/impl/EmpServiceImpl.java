package com.yedam.app.emp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;
import com.yedam.app.tx.mapper.AaaMapper;

//빼먹지마~!~!!!! implement 위에는 모두 @service임!!!!\
@Service
public class EmpServiceImpl implements EmpService {

	// @Autowired는 페이지 마다 작성하기
	@Autowired
	EmpMapper empMapper;

	@Autowired
	AaaMapper aaaMapper;

	@Autowired
	@Override
	public List<EmpVO> getEmpAll() {
		return empMapper.selectEmpAllList();
	}

	@Override
	public EmpVO getEmp(EmpVO empVO) {
		return empMapper.selectEmpInfo(empVO);
	}

	@Override
	public int insertEmp(EmpVO empVO) {
		int result = empMapper.insertEmpInfo(empVO);
		if (result == 1) {
			return empVO.getEmployeeId();
		} else {
			return -1;
		}
	}

	@Override
	public String updateEmpSal(int empId, int raise) {
		String message = null;

		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(empId);

		int result = empMapper.updateEmpSal(empVO, raise);

		if (result == 1) {
			message = "정상적으로 급여를 갱신했습니다.";
		} else {
			message = "작업이 실패했습니다. 정보를 확인해주세요.";
		}
		return message;
	}

	@Override
	public Map<String, String> updateEmp(EmpVO empVO) {
		Map<String, String> map = new HashMap<>();
		
		map.put("사원번호", String.valueOf(empVO.getEmployeeId()));
		
		int result = empMapper.updateInfo(empVO);
		
		if(result ==1) {
			map.put("결과", "Success");
		}else {
			map.put("결과", "Fail");
		}
		return map;
	}

	@Override
	public Map<String, String> deleteEmp(int empId) {
		Map<String, String> map = new HashMap<>();
		
		map.put("사원번호", String.valueOf(empId));
		
		int result = empMapper.deleteEmpInfo(empId);
		
		if(result ==1) {
			map.put("결과", "Success");
		}else {
			map.put("결과", "Fail");
		}
		return map;
	}
}



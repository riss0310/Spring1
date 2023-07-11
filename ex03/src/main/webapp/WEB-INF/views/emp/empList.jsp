<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 우리나라 형식으로 표현하려면 따로 처리해야함 그 처리1 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
<style type="text/css">
table, th, td {
	border: 4px solid #af8acf;
	text-align: center;
	background-color: lavender
}
</style>
</head>
<body>
	<button type="button" onclick="location.href='empInsert'">등록</button>
	<table>
		<thead>
			<tr>
				<th>employee_id</th>
				<th>first_name</th>
				<th>last_name</th>
				<th>email</th>
				<th>hire_date</th>
				<th>job_id</th>
				<th>salary</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ empList }" var="emp">
				<tr onclick="location.href='empInfo?employeeId=${emp.employeeId}'">
					<td>${emp.employeeId }</td>
					<td>${emp.firstName }</td>
					<td>${emp.lastName }</td>
					<td>${emp.email }</td>
					<td><fmt:formatDate value="${emp.hireDate }"
							pattern="💜yy년MM월dd일💜" /> <!-- 우리나라 형식으로 표현하려면 따로 처리해야함 그 처리2 --></td>
					<!-- fmt는 일반적인 value속성에서도 사용할 수 있다.  -->
					<td>${emp.jobId }</td>
					<td>
						<!-- 주석은 자바주석이므로 jstl이나 el은 문법그대로 주석하지 않기--> <fmt:formatNumber
							value="${emp.salary }" pattern="$#,###" />
					</td>
					<td><button type="button">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script>
		printMessage(`${result}`)	//el태그는 출력만 함-> ','같은거 없음 ``를 사용하려 가둠
	
		function printMessage(msg){
			if(msg == null || msg == '') return;
			alert(msg);
		}
	</script>
</body>
</html>
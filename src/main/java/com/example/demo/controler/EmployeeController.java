package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/empName")
	public String getEmployeeName(Employee employee) {
		employee.setEmpName("srikanth");
		System.out.println("**************");
		System.out.println("MY EMPLOYEE NAME IS ::" + employee.getEmpName());
		System.out.println("**************");
		return employee.getEmpName();
	}

	@GetMapping("/empAdd")
	public String getEmployeeAddress(Employee employee) {
		employee.setEmpAddress("Hyderabad");
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		System.out.println("MY EMPLOYEE Address  IS ::" + employee.getEmpAddress());
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		return employee.getEmpAddress();
	}

	@GetMapping("/empSal")
	public String getEmployeeSalary(Employee employee) {
		employee.setEmpSal(60000.00);
		Double empSal = employee.getEmpSal();
		String string = empSal.toString();
		System.out.println("$$$$$$$$$$$$$$$$");
		System.out.println("MY EMPLOYEE Address  IS ::" + employee.getEmpSal());
		System.out.println("$$$$$$$$$$$$$$$$");
		return string;

	}

}

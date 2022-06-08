package com.simplilearn.ph2.service;
import java.util.Set;

import com.simplilearn.ph2.dto.Employee;
public interface EmployeeService {
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int emp_id);
	Set<Employee> getAllEmployees();
}

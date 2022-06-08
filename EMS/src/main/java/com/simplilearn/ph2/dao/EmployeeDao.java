package com.simplilearn.ph2.dao;

import java.util.Set;

import com.simplilearn.ph2.dto.Employee;

public interface EmployeeDao {
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int emp_id);
	Set<Employee> getAllEmployees();
}

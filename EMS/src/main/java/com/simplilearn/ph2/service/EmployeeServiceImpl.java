package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dao.EmployeeDao;
import com.simplilearn.ph2.dao.EmployeeDaoImpl;
import com.simplilearn.ph2.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int emp_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}

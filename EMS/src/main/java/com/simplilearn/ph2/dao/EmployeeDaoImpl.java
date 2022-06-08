package com.simplilearn.ph2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.simplilearn.ph2.dto.Employee;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class EmployeeDaoImpl implements EmployeeDao{
	private Connection connection;
	public EmployeeDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
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
		Set<Employee> allEmps = new HashSet<Employee>();
		String query = "select * from emp";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
				allEmps.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return allEmps;
	}

}

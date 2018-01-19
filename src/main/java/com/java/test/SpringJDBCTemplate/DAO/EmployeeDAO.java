package com.java.test.SpringJDBCTemplate.DAO;

import java.util.List;

import com.java.test.SpringJDBCTemplate.Bean.Employee;



/**
 * 
 * @author Adnaan
 *
 *
 */

public interface EmployeeDAO {

	public boolean addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public boolean deleteEmployee(Integer employeeId);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(int employeeid);
}

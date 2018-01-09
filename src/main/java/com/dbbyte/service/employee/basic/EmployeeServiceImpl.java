package com.dbbyte.service.employee.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbbyte.dao.employee.basic.EmployeeDao;
import com.dbbyte.model.employee.basic.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee obj = employeeDao.getEmployeeById(employeeId);
		return obj;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public synchronized boolean addEmployee(Employee employee) {
		if ( employeeDao.employeeExists(employee.getFirstName(), employee.getLastName() )) {
			return false;
		} else {
			employeeDao.addEmployee(employee);
			return true;
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

}

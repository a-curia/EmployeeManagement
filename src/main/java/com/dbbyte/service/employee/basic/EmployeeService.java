package com.dbbyte.service.employee.basic;

import java.util.List;

import com.dbbyte.model.employee.basic.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int employeeId);
    boolean addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int employeeId);
}

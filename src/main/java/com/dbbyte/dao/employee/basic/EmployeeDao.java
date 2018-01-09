package com.dbbyte.dao.employee.basic;

import java.util.List;

import com.dbbyte.model.employee.basic.Employee;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int employeeId);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int employeeId);
    boolean employeeExists(String title, String category);
}

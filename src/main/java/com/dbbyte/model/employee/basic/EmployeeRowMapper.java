package com.dbbyte.model.employee.basic;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet row, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(row.getInt("id"));
		employee.setFirstName(row.getString("firstName"));
		employee.setLastName(row.getString("lastName"));
		return employee;
	}

}

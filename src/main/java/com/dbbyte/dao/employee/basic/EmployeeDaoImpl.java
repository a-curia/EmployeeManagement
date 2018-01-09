package com.dbbyte.dao.employee.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dbbyte.model.employee.basic.Employee;
import com.dbbyte.model.employee.basic.EmployeeRowMapper;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee getEmployeeById(int employeeId) {
		String sql = "SELECT id, firstName, lastName FROM employees WHERE id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, employeeId);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "SELECT id, firstName, lastName FROM employees";
		// RowMapper<Employee> rowMapper = new
		// BeanPropertyRowMapper<Employee>(Employee.class);
		RowMapper<Employee> rowMapper = new EmployeeRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addEmployee(Employee employee) {
		// Add employee
		String sql = "INSERT INTO employees (id, firstName, lastName) values (?, ?, ?)";
		jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());

		// Fetch employee id
		sql = "SELECT id FROM employees WHERE firstName = ? and lastName=?";
		int employeeId = jdbcTemplate.queryForObject(sql, Integer.class, employee.getFirstName(), employee.getLastName());

		// Set employee id
		employee.setId(employeeId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		String sql = "UPDATE employees SET firstName = ?, lastName=? WHERE id=?";
		jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
	}

	@Override
	public void deleteEmployee(int employeeId) {
		String sql = "DELETE FROM employees WHERE id=?";
		jdbcTemplate.update(sql, employeeId);
	}

	@Override
	public boolean employeeExists(String title, String category) {
		String sql = "SELECT count(*) FROM employees WHERE firstName = ? and lastName=?";
		int count = jdbcTemplate.queryForObject(sql, Integer.class, title, category);
		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}
}

package com.dbbyte.model.employee.basic;

import java.time.LocalDate;

public class HolidayInformation {

	private int id;
	private int employee_id;

	private String holiday;

	private LocalDate monthlyFromDate;
	private LocalDate monthlyToDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public LocalDate getMonthlyFromDate() {
		return monthlyFromDate;
	}

	public void setMonthlyFromDate(LocalDate monthlyFromDate) {
		this.monthlyFromDate = monthlyFromDate;
	}

	public LocalDate getMonthlyToDate() {
		return monthlyToDate;
	}

	public void setMonthlyToDate(LocalDate monthlyToDate) {
		this.monthlyToDate = monthlyToDate;
	}

}

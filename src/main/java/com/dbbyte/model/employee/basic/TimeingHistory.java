package com.dbbyte.model.employee.basic;

import java.time.LocalDate;

public class TimeingHistory {

	private int id;
	private int employee_id;

	private double workedHours;
	private double offHours;
	private double daysOff;
	private double overTime;
	private double extraDays;

	private LocalDate startDate;
	private LocalDate endDate;

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

	public double getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(double workedHours) {
		this.workedHours = workedHours;
	}

	public double getOffHours() {
		return offHours;
	}

	public void setOffHours(double offHours) {
		this.offHours = offHours;
	}

	public double getDaysOff() {
		return daysOff;
	}

	public void setDaysOff(double daysOff) {
		this.daysOff = daysOff;
	}

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}

	public double getExtraDays() {
		return extraDays;
	}

	public void setExtraDays(double extraDays) {
		this.extraDays = extraDays;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}

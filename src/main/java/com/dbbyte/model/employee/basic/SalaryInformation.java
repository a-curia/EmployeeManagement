package com.dbbyte.model.employee.basic;

import java.time.LocalDate;

public class SalaryInformation {

	private int id;
	private int employee_id;

	private double monthlySalary;
	private double monthlyMoneyCurrency;
	private double monthlyTaxes;
	private double monthlyDeductions;
	private double monthlyInsurances;

	private LocalDate monthlyFromDate;
	private LocalDate monthlyToDate;

	private double weeklySalary;
	private double weeklyMoneyCurrency;
	private double weeklyTaxes;
	private double weeklyDeductions;
	private double weeklyInsurances;

	private LocalDate weeklyFromDate;
	private LocalDate weeklyToDate;

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

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlyMoneyCurrency() {
		return monthlyMoneyCurrency;
	}

	public void setMonthlyMoneyCurrency(double monthlyMoneyCurrency) {
		this.monthlyMoneyCurrency = monthlyMoneyCurrency;
	}

	public double getMonthlyTaxes() {
		return monthlyTaxes;
	}

	public void setMonthlyTaxes(double monthlyTaxes) {
		this.monthlyTaxes = monthlyTaxes;
	}

	public double getMonthlyDeductions() {
		return monthlyDeductions;
	}

	public void setMonthlyDeductions(double monthlyDeductions) {
		this.monthlyDeductions = monthlyDeductions;
	}

	public double getMonthlyInsurances() {
		return monthlyInsurances;
	}

	public void setMonthlyInsurances(double monthlyInsurances) {
		this.monthlyInsurances = monthlyInsurances;
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

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklyMoneyCurrency() {
		return weeklyMoneyCurrency;
	}

	public void setWeeklyMoneyCurrency(double weeklyMoneyCurrency) {
		this.weeklyMoneyCurrency = weeklyMoneyCurrency;
	}

	public double getWeeklyTaxes() {
		return weeklyTaxes;
	}

	public void setWeeklyTaxes(double weeklyTaxes) {
		this.weeklyTaxes = weeklyTaxes;
	}

	public double getWeeklyDeductions() {
		return weeklyDeductions;
	}

	public void setWeeklyDeductions(double weeklyDeductions) {
		this.weeklyDeductions = weeklyDeductions;
	}

	public double getWeeklyInsurances() {
		return weeklyInsurances;
	}

	public void setWeeklyInsurances(double weeklyInsurances) {
		this.weeklyInsurances = weeklyInsurances;
	}

	public LocalDate getWeeklyFromDate() {
		return weeklyFromDate;
	}

	public void setWeeklyFromDate(LocalDate weeklyFromDate) {
		this.weeklyFromDate = weeklyFromDate;
	}

	public LocalDate getWeeklyToDate() {
		return weeklyToDate;
	}

	public void setWeeklyToDate(LocalDate weeklyToDate) {
		this.weeklyToDate = weeklyToDate;
	}

}

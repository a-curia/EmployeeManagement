package com.dbbyte.model.employee.basic;

import java.time.LocalDate;

public class WorkingHistory {

	private int id;
	private int employee_id;

	private String companyName;
	private String employerName;
	private String companyEmployerAddress;
	private String companyEmployerMobilePhone;
	private String companyEmployerOfficePhone;
	private String previousQualification;
	private String previousExperience;

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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getCompanyEmployerAddress() {
		return companyEmployerAddress;
	}

	public void setCompanyEmployerAddress(String companyEmployerAddress) {
		this.companyEmployerAddress = companyEmployerAddress;
	}

	public String getCompanyEmployerMobilePhone() {
		return companyEmployerMobilePhone;
	}

	public void setCompanyEmployerMobilePhone(String companyEmployerMobilePhone) {
		this.companyEmployerMobilePhone = companyEmployerMobilePhone;
	}

	public String getCompanyEmployerOfficePhone() {
		return companyEmployerOfficePhone;
	}

	public void setCompanyEmployerOfficePhone(String companyEmployerOfficePhone) {
		this.companyEmployerOfficePhone = companyEmployerOfficePhone;
	}

	public String getPreviousQualification() {
		return previousQualification;
	}

	public void setPreviousQualification(String previousQualification) {
		this.previousQualification = previousQualification;
	}

	public String getPreviousExperience() {
		return previousExperience;
	}

	public void setPreviousExperience(String previousExperience) {
		this.previousExperience = previousExperience;
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

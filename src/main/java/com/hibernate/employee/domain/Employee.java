package com.hibernate.employee.domain;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="EMPLOYEES")
@Entity
public class Employee {

	@Id
	@Column(name="EMP_NO")
	private Integer employeeNummber;
	
	@Column(name="BIRTH_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dateOfBirth;

	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="GENDER")
	private Character gender;
	
	@Column(name="HIRE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar hireDate;
	
	@OneToMany(mappedBy = "salaryCompositeKey.employee", cascade = { CascadeType.ALL })
    private Set<Salary> salaries;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEmployeeNummber() {
		return employeeNummber;
	}

	public void setEmployeeNummber(Integer employeeNummber) {
		this.employeeNummber = employeeNummber;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Calendar getHireDate() {
		return hireDate;
	}

	public void setHireDate(Calendar hireDate) {
		this.hireDate = hireDate;
	}

	public Set<Salary> getSalaries() {
		return salaries;
	}

	public void setSalaries(Set<Salary> salaries) {
		this.salaries = salaries;
	}
}

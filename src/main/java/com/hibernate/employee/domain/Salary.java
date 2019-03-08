package com.hibernate.employee.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="SALARIES")
@Entity
public class Salary {

	@EmbeddedId
	private SalaryCompositeKey salaryCompositeKey;
	
	@Column(name="SALARY")
	private Integer salary;
	
	@Column(name="TO_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar toDate;
	
	public Salary() {
		
	}
	
	
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public Calendar getToDate() {
		return toDate;
	}
	public void setToDate(Calendar toDate) {
		this.toDate = toDate;
	}


	public SalaryCompositeKey getSalaryCompositeKey() {
		return salaryCompositeKey;
	}


	public void setSalaryCompositeKey(SalaryCompositeKey salaryCompositeKey) {
		this.salaryCompositeKey = salaryCompositeKey;
	}
	
	
	
}

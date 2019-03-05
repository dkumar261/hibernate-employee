package com.hibernate.employee;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.employee.domain.Employee;
import com.hibernate.employee.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();
		
		Employee employee = new Employee();
		employee.setEmployeeNummber(1);
		employee.setDateOfBirth(Calendar.getInstance());
		employee.setFirstName("Martin");
		employee.setLastName("Fowler");
		employee.setGender('M');
		employee.setHireDate(Calendar.getInstance());
		
		session.beginTransaction();
		session.saveOrUpdate(employee);
		session.getTransaction().commit();
	}
}

package com.nov19;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg2.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Address.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		try {
			// Create Address
			Address address1 = new Address();
			address1.setCity("Mumbai");
			address1.setState("Maharashtra");
			address1.setPin(400001);

			Address address2 = new Address();
			address2.setCity("Pune");
			address2.setState("Maharashtra");
			address2.setPin(411002);

			Address address3 = new Address();
			address3.setCity("Nanded");
			address3.setState("Maharashtra");
			address3.setPin(431604);

			// Create Students
			Student student1 = new Student();
			student1.setName("Omkar");
			student1.setMarks(90);
			student1.setAddress(address1);

			Student student2 = new Student();
			student2.setName("Pranav");
			student2.setMarks(85);
			student2.setAddress(address2);

			Student student3 = new Student();
			student3.setName("neha");
			student3.setMarks(85);
			student3.setAddress(address3);

			// Save Students (Addresses are saved automatically due to CascadeType.ALL)
			session.save(student1);
			session.save(student2);
			session.save(student3);

			transaction.commit();
			System.out.println("Data saved successfully!");
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		} finally {
			session.close();
			factory.close();
		}
	}
}

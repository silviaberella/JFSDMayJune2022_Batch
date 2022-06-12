package com.simplilearn.hibernate.xmlway.beans;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.simplilearn.hibernate.xmlway.beans.Student;

public class Client {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Student student1 = new Student("Silvia", "Berella", "A+");
		Student student2 = new Student("Jo", "Dow", "B");
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		int rollNo1= (int)session.save(student1);
		transaction.commit();
		System.out.println("rollNo is: "+rollNo1);
		factory.close();
	}

}

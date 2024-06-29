package com.hiberMap.DemoMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        for mapping example
//        Laptop laptop = new Laptop();
//        laptop.setLid(101);
//        laptop.setLname("Dell");
//        
//        
//        Student s = new Student();
//        s.setName("Utkarsh");
//        s.setRollno(1);
//        s.setMarks(100);
//        s.getLaptop().add(laptop);
//        laptop.getStudent().add(s);

//        Alien a = null;

		Configuration con = new Configuration().configure().addAnnotatedClass(ALaptop.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();

		// get and load
		session.beginTransaction();
		
		ALaptop lap1 = (ALaptop) session.get(ALaptop.class,6); // object
//		System.out.println(lap1);// every time you use get it will hit (quering) database
		// null pointer exception
		
		ALaptop lap2 = (ALaptop) session.load(ALaptop.class,7); // proxy object
		System.out.println(lap2);// it will not fire query but when use try to use object then it will fire query
		// object not found exception
		
		session.getTransaction().commit();
		
//		state management
//		session.beginTransaction();
		
//      first add data in database table
//		Random r = new Random();
//
//		for (int i = 1; i <= 100; i++) {
//			ALaptop l = new ALaptop();
//			l.setLid(i);
//			l.setBrand("Brand : "+ i);
//			l.setPrice(r.nextInt(10000)+40000);
//			session.save(l);
//		}
		
//		ALaptop l = new ALaptop();
//		l.setLid(102);
//		l.setBrand("Samsung");
//		l.setPrice(75000);
//		
//		session.save(l);
////		l.setPrice(80000);// it will change means it still in persistence state 
//		l.setPrice(85000);
//		
//		// 
//		
//		
//		session.getTransaction().commit();
//		session.evict(l);
//		l.setPrice(65000);
		
		// for HQL
//        Session session = sf.openSession();

//        session.beginTransaction();
////         first add data in database table
//        Random r = new Random();
//        
//        for(int i=1;i<=50;i++) {
//        	Student s = new Student();
//        	s.setRollno(i);
//        	s.setName("Name "+ i);
//        	s.setMarks(r.nextInt(100));
//        	session.save(s);
//        }

//        Query q = session.createQuery("from Student where marks > 50");
//        List<Student> students = q.list();

//        for(Student s: students) {
//        	System.out.println(s);
//        }
//        Query q = session.createQuery("from Student where rollno=7");
//        Student students = (Student)q.uniqueResult();  
//        System.out.print(students);

//        Query q = session.createQuery("select rollno,name,marks from Student where rollno=7");
//        Object[] student = (Object[]) q.uniqueResult();

//        for(Object o : student) {
//        	System.out.println(o);
//        }
//        System.out.println(student[0] + " " + student[1] + " " + student[2]);

//        Query q = session.createQuery("select rollno,name,marks from Student s where s.marks>60");
//        List<Object[]> students = (List<Object[]>) q.list();
//        
//        for(Object[] student : students) {
//        	System.out.println(student[0] + " " + student[1] + " " + student[2]);
//        }

//        int b = 90;
//        
//        Query q = session.createQuery("select sum(marks) from Student s where s.marks > :b");
//        q.setParameter("b", b);
//        Long marks = (Long) q.uniqueResult();
//        
//        System.out.println(marks);
//        

		// for sql
//        SQLQuery q = session.createSQLQuery("select * from Student where marks>60");
//        q.addEntity(Student.class);
//        List<Student> students = q.list();
//        
//        for(Student s : students) {
//        	System.out.println(s);
//        }

		// Native queries
//        SQLQuery q = session.createSQLQuery("select name,marks from Student where marks>60");
//        q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//        List students = q.list();
//        
//        for(Object o : students) {
//        	Map m = (Map)o;
//        	System.out.println(m.get("name") + " : "+m.get("marks"));
//        }
//          session.getTransaction().commit();

//        for mapping example
//        Session session1 = sf.openSession();
//        session1.beginTransaction();
//        // first level cache session same so it will cache and it is provided by hibernate so we dont need to use any extra library
//        
//        Query q1 = session1.createQuery("from Alien where aid=1");
//        q1.setCacheable(true);
//
//        
//        
////        a = (Alien) session1.get(Alien.class, 1);
//        a = (Alien) q1.uniqueResult();
//        System.out.println(a);
//        
//        session1.getTransaction().commit();

//        Session session2 = sf.openSession();
//        session2.beginTransaction();
//        
//        Query q2 = session2.createQuery("from Alien where aid=1");
//        q2.setCacheable(true);
//
//        
////        a = (Alien) session2.get(Alien.class, 1);
//        a = (Alien) q2.uniqueResult();
//
//        System.out.println(a);
//        
//        session2.getTransaction().commit();

//      fetch  
//        session.save(laptop);
//        session.save(s);

		// for fetching
//        Alien a1 = session.get(Alien.class, 1);
//        System.out.println(a1);

//        Lazy fetch
//        Collection<ALaptop> laps = a1.getLaps();
//        
//        for(ALaptop l : laps) {
//        	System.out.println(l);
//        }

	}
}

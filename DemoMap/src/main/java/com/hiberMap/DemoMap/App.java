package com.hiberMap.DemoMap;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Criteria;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.SQLQuery;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        
        
        
        // for HQL
        Session session = sf.openSession();
        
        session.beginTransaction();
        // first add data in database table
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
//        session.getTransaction().commit();
        
        // for sql
//        SQLQuery q = session.createSQLQuery("select * from Student where marks>60");
//        q.addEntity(Student.class);
//        List<Student> students = q.list();
//        
//        for(Student s : students) {
//        	System.out.println(s);
//        }
        
        // Native queries
        SQLQuery q = session.createSQLQuery("select name,marks from Student where marks>60");
        q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List students = q.list();
        
        for(Object o : students) {
        	Map m = (Map)o;
        	System.out.println(m.get("name") + " : "+m.get("marks"));
        }
        
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

package com.hiberMap.DemoMap;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

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
    	
        Alien a = null;
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session1 = sf.openSession();
        
//        for mapping example
        session1.beginTransaction();
        // first level cache
        a = (Alien) session1.get(Alien.class, 1);
        System.out.println(a);
        
        a = (Alien) session1.get(Alien.class, 1);
        System.out.println(a);
        
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
        
        session1.getTransaction().commit();
        session1.close();
        
    }
}

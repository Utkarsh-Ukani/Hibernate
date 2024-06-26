package com.hiber.DemoHibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    	
    	AlienName an = new AlienName();
    	an.setFname("Divy");
    	an.setMname("Sanjaybhai");
    	an.setLname("Thakkar");
    	
        Alien vike = new Alien();
        vike.setAid(101);
        vike.setColor("cyan");
        vike.setAname(an);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(vike);
        
        
        tx.commit();
  
        session.close();
    }
}

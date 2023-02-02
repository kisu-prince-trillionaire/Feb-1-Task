package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Adress;
import com.demo.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate_cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        Employee e1 = new Employee(103,"Ram Kumar",550000);
        System.out.println(e1);
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();
        session.close();
        
        Adress ad1 = new Adress();
        ad1.setStreet("Langarpur");
        ad1.setCity("Barh");
        ad1.setState("Bihar");
        ad1.setCountry("India");
        ad1.setZip(803213);
        System.out.println(ad1);
        
        //Reading image and storing in database
//        FileInputStream fis = new FileInputStream("src/main/java/pic.png");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        ad1.setImage(data);
        
        Session session1 = factory.openSession();
        session1.beginTransaction();
        session1.save(ad1);
        session1.getTransaction().commit();
        session1.close();
    }
}

package com.company.carrental.data.car_rental_data;

import org.hibernate.Session;

import com.company.carrental.data.car_rental_data.util.HibernateUtil;

/**
 * Hello world!
 * 
 */
public class App {
    public static void main(String[] args) {
        DriverMaster dm = new DriverMaster();
        Session session = HibernateUtil.getAnnotatedSessionFactory().openSession();
        session.beginTransaction();
        System.out.println("Hello World!");
        session.getTransaction().commit();
        session.close();
    }
}

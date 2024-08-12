package com.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.nio.file.Watchable;

public class Test {
    /* 1.create config object to get the services and load the config variables
        2.to load the driver create session factory
        3. to execute the quaary session
        4.if it non select quuary create trscation obj
        5.get the pojo call
        6.perform the data peamtion operation with update or save or delete or load
        7.commit or rollback the sql qauury
        8.close the seesion and session fatory
     */
    public static void main(String[] args) throws Exception {

        Configuration config = new Configuration();
        config.configure();
        SessionFactory sessionFactoryobj = config.buildSessionFactory();
        Session sessionobj = sessionFactoryobj.openSession();
        Transaction transactionobj = sessionobj.beginTransaction();
        Employee emp=new Employee();
        emp.setId(104);
        sessionobj.delete(emp.getId());
        System.out.println("delte done");
        transactionobj.commit();

        emp.setId(104);
        emp.setFname("giridhar");
        emp.setlName("n");
        emp.setAddress("kmm");
        emp.setSalary(30);

        int eno=(Integer)sessionobj.save(emp);
        System.out.println("done");
        transactionobj.commit();
        sessionobj.close();
        sessionFactoryobj.close();
    }
}

package com.Hcm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Studenttest {
    public static void main(String[] args) {

        Configuration configure=new Configuration().configure("Student.cfg.xml");

        SessionFactory sf= configure.buildSessionFactory();

        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();

        Student stu=new Student();

       stu.setId(10);
       stu.setName("rakesh");
       stu.setlName("cha");
       stu.setAdrs("kmm");
       stu.seteSalary(20f);

       session.save(stu);
       tr.commit();
       session.close();
       sf.close();
       System.out.println("done");
    }
}

package com.test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class CriteriaAPI_Tc_001 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("configure.cfg.xml");
       SessionFactory sf= configuration.buildSessionFactory();
       Session session=sf.openSession();
        Criteria criteria=session.createCriteria(Employee.class);
        List<Employee> emp1=criteria.list();
        for(Employee employee:emp1)
        {
            System.out.print(employee.getEid()+"      ");

            System.out.print(employee.getEname()+"      ");
            System.out.print(employee.getLeavesavalible()+"   ");
            System.out.println(employee.getNo_of_leaves()+"    ");
        }

    }
}

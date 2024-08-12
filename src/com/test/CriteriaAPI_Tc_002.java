package com.test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;

import java.util.List;

public class CriteriaAPI_Tc_002 {
    public static List<Employee> emp;
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("configure.cfg.xml");
       SessionFactory sf= configuration.buildSessionFactory();
        Session session= sf.openSession();
        Criteria criteria=session.createCriteria(Employee.class);
        Criterion criterion= Restrictions.ge("no_of_leaves",(Integer)5);
        criteria.add(criterion);
        emp=criteria.list();
       /* for(Employee e:emp)
        {
            System.out.print(e.getEid()+"  ");
            System.out.print(e.getEname()+" ");
            System.out.println(e.getNo_of_leaves());
        }
        //order by
        System.out.println("ordered by");
        Order order= Order.asc("no_of_leaves");
        criteria.addOrder(order);
        emp=criteria.list();
        for(Employee e:emp)
        {
            System.out.print(e.getEid()+"  ");
            System.out.print(e.getEname()+" ");
            System.out.println(e.getNo_of_leaves());
        }
        //select from specific columns
        //projection it help to get the data from specific columns
        //aggration operations*/
        Projection p1=Projections.count("eid");
        Projection p2=Projections.min("no_of_leaves");
        Projection p3=Projections.max("no_of_leaves");
        Projection p4=Projections.avg("no_of_leaves");

        ProjectionList pl=Projections.projectionList();
        pl.add(p1);
        pl.add(p2);
        pl.add(p3);
        pl.add(p4);

        criteria.setProjection(pl);
        List<Object[]> ll=criteria.list();
        for(Object[] objects:ll)
        {
            System.out.println(objects[0]);
            System.out.println(objects[1]);
            System.out.println(objects[2]);
            System.out.println(objects[3]);
        }



    }
}

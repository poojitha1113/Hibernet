package com.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class employeetest {
    public  static Query query;
    static int result;
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("configure.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
       Transaction tr= session.beginTransaction();

       //update the info
        query=session.createQuery("update Leave set no_of_leaves=? where eid=?");
        query.setInteger(0,2);
        query.setInteger(1,101);
        result=query.executeUpdate();
        System.out.println(result+" update");

        //delete
        query=session.createQuery("delete from  Leave where eid=?");
        query.setInteger(0,102);
        result=query.executeUpdate();
        System.out.println(result);
        tr.commit();

        //select the info
        query=session.createQuery("from Leave ");
        List<Leave> list=query.list();
        for(Leave l:list)
        {
            System.out.print(l.getEid()+""+ "   ");
            System.out.print(l.getEname()+""+"  ");
            System.out.print(l.getLeavesavalible()+"   ");
            System.out.println(l.getNo_of_leaves());
        }
       /* //insert onto other table
        query=session.createQuery("insert  into Leave(eid,ename,leavesavalible,no_of_leaves)" +" select eid,ename,leavesavalible,no_of_leaves from Employee");
        result=query.executeUpdate();
        System.out.println(result);*/

        session.close();
        sf.close();

        System.out.println("done");

    }
}

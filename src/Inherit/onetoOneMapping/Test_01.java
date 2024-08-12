package Inherit.onetoOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_01 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("Inherit.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();
        Logindetails reg=new Logindetails();
        reg.setEid(101);
        reg.setEname("poojitha");
        reg.setEadr("sb");
        reg.setMobileNumber(323232);

        reg.setUsername("pooji");
        reg.setPassword("***");

        //1.single entry process
        session.save(reg);

        tr.commit();

        System.out.println("done");
        session.close();

    }
}

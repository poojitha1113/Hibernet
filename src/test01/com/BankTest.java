package test01.com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BankTest {


    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure("Bank.cfg.xml");
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

       Query query;
        query= session.createQuery("insert  into Bank(Branch_Code,Bank_Name,Address)" + " select Branch_Code,Bank_Name,Address from Branch ");
        int result = query.executeUpdate();
        System.out.println(result);
        System.out.println("done");
        tr.commit();
        session.close();
        sf.close();
    }
}
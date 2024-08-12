package Inherit.annation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.awt.print.Book;

public class LibDatabse {
    public static void main(String[] args)
    {
        Configuration configuration=new Configuration().configure("lib.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        Libraory lib=new Libraory();
        lib.setBlockNo(1);
        lib.setBlockName("Jack brown");
        Book book=new Book();

    }
}

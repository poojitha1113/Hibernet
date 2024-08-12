import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class CustomerTest {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("customer.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
       Session session= sf.openSession();

       Transaction tr=session.beginTransaction();

       Customer customer=new Customer();
       customer.setId(3);
       customer.setName("poojitha");
       customer.setAge(19);
       session.update(customer);
       tr.commit();

       Query query=session.createQuery("from  Customer where age=?");
        query.setInteger(0,3);
        List<Customer> list=query.list();
        for(Customer lis:list)
        {
            System.out.print(lis.getId()+""+"   ");
            System.out.print(lis.getName()+""+"   ");
            System.out.println(lis.getAge()+""+"   ");
        }
       session.close();
       sf.close();

        System.out.println("done");
    }
}

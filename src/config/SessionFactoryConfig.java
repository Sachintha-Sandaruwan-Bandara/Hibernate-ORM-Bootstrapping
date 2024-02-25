package config;
/* 
    @author Sachi_S_Bandara
    @created 2/2/2024 - 3:54 PM 
*/


import entity.Customer;
import entity.Item;
import entity.Order;
import entity.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {
    private static SessionFactoryConfig sessionFactoryConfig;
    private final SessionFactory sessionFactory;
    private SessionFactoryConfig(){


        //3. Create a Session Factory
//        sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder()
//        .configure()
//        .build())
//        .addAnnotatedClass(Customer.class)
//        .getMetadataBuilder().build().buildSessionFactory();

        sessionFactory= new Configuration()
                .configure()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(OrderDetail.class)
                .buildSessionFactory();
    }
    public static SessionFactoryConfig getInstance(){
        return (sessionFactoryConfig==null)?sessionFactoryConfig=new SessionFactoryConfig(): sessionFactoryConfig;
    }

    public Session getSession(){
        //1. Create a Service Registry


        //Create and Open the session
        return sessionFactory.openSession();

        //5. close the session
    }

}


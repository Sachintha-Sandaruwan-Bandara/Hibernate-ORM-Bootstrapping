package config;
/* 
    @author Sachi_S_Bandara
    @created 2/2/2024 - 3:54 PM 
*/

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;

    private SessionFactoryConfig() {

    }

    public static SessionFactoryConfig getInstance() {
//        if (null == factoryConfig) {
//            factoryConfig = new SessionFactoryConfig();
//        } else {
//            return factoryConfig;
//        }
        return (null == factoryConfig)?factoryConfig=new SessionFactoryConfig():factoryConfig;


    }
    public Session getSession(){
        //1.create service registry
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

        //2.create a metadata object
        Metadata metadata= new MetadataSources(serviceRegistry).addAnnotatedClass(Customer.class).getMetadataBuilder().build();

        //3.create sessionFactory
        SessionFactory sessionFactory = metadata.buildSessionFactory();

        return sessionFactory.openSession();
    }
}

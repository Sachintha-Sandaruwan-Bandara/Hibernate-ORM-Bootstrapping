package repository;
/* 
    @author Sachi_S_Bandara
    @created 2/18/2024 - 9:52 AM 
*/

import config.SessionFactoryConfig;
import embedded.MobileNumber;
import embedded.NameIdentifier;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private Session session;
    public CustomerRepository() {
         session =  SessionFactoryConfig.getInstance().getSession();
    }

    public int saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        try {
            int customerID= (int) session.save(customer);
           transaction.commit();
           session.close();
           return customerID;
       }catch (Exception e){
           transaction.rollback();
           session.close();
           e.printStackTrace();
           return -1;
       }


    }
    public Customer getCustomer(int id)throws RuntimeException{
        try{
            Customer customer = session.get(Customer.class, id);
            session.close();
            return customer;
        }catch (Exception e){
            e.printStackTrace();
            throw e;

        }
    }

}

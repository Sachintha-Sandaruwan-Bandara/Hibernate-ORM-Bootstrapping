package repository;
/* 
    @author Sachi_S_Bandara
    @created 2/18/2024 - 9:52 AM 
*/

import config.SessionFactoryConfig;
import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

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

    public boolean updateCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        try{
            session.update(customer);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;

        }
    }

    public boolean deleteCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customer);
            transaction.commit();
            session.close();
            return true;
        }catch  (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }

    }
    public List<Objects[]> getAllCustomersNative(){ //Query object
        String sql = "SELECT * FROM customer";
        NativeQuery query = session.createSQLQuery(sql);
        List<Objects[]> list =query.list();
        for (Object customer1 : list){
            System.out.println(customer1);
        }
        session.close();
        return  list;
    }

    public List<Customer> getAllCustomersJPQL(){
        String sql="SELECT C FROM Customer As C";
        Query query = session.createQuery(sql);
        List<Customer> list = query.list();
        session.close();
        return list;

    }

    public List<Order>getOrderByCustomerId(int cusId){
        String sql="SELECT  O  FROM  Order AS O\n" +                    //order table eken ena result eka o kiyana namkinnganna e kiyana result eka select krala ganna
                "INNER JOIN Customer AS C ON O.customer.id = C.id\n" +
                "WHERE O.customer.id=:cus_id\n";

        Query query = session.createQuery(sql);
        query.setParameter("cus_id",cusId);
        List <Order> list = query.list();
        session.close();
        return list;
    }



}

/*
    @author Sachi_S_Bandara
    @created 2/25/2024 - 1:11 PM 
*/

import config.SessionFactoryConfig;
import entity.Customer;
import org.hibernate.Session;

public class TransientState {

    public static void main(String[] args) {
        Session session = SessionFactoryConfig.getInstance().getSession();


        //transient


        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("amal");
        customer.setAddress("galle");

        boolean isContained= session.contains(customer);

        if(isContained){
            System.out.println("this object is not transient");
        }else{
            System.out.println("this object is in Transient");
        }
    }
}

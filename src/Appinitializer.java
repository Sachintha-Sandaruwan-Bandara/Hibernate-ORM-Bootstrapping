/*
    @author Sachi_S_Bandara
    @created 2/2/2024 - 4:45 PM 
*/

import config.SessionFactoryConfig;
import embedded.MobileNumber;
import embedded.NameIdentifier;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class Appinitializer {
    public static void main(String[] args) {

//        1.save
// //object reuse
//      Session session =  SessionFactoryConfig.getInstance().getSession();
//
//        Transaction transaction = session.beginTransaction();
//      Customer customer = getCustomer();
//
//      session.save(customer);
//      transaction.commit();
//      session.close();
        //get

//      Session getSession = SessionFactoryConfig.getInstance().getSession();
//
//      Customer existignCustomer = getSession.get(Customer.class,1);
//      System.out.println("Existign Customer :" +existignCustomer);
//      getSession.close();


        //update

//        Session updateSession = SessionFactoryConfig.getInstance().getSession();
//         transaction = updateSession.beginTransaction();
//
//        Customer existignCustomerr = updateSession.get(Customer.class,1);
//        System.out.println(existignCustomerr);
//        existignCustomerr.setAddress("Galle");
//        updateSession.update(existignCustomerr);
//        transaction.commit();
//        updateSession.close();

//      System.out.println("----DELETE---");
//      Session deleteSession = SessionFactoryConfig.getInstance().getSession();//4
//      Transaction deletetransaction = deleteSession.beginTransaction();
//      Customer existignCustomerDelete =  deleteSession.get(Customer.class,1);
//      deleteSession.delete(existignCustomerDelete);
//      deletetransaction.commit();
//      deleteSession.close();

//save
      CustomerRepository customerRepository = new CustomerRepository();
      customerRepository.saveCustomer(getCustomer());

//get
      customerRepository = new CustomerRepository();
      Customer customer = customerRepository.getCustomer(1);
      System.out.println(customer);

//
////update
//       customerRepository = new CustomerRepository();
//       customer.setAddress("heh");
//       customerRepository.updateCustomer(customer);
////delete
//      customerRepository = new CustomerRepository();
//      customerRepository.deleteCustomer(customer);



        CustomerRepository customerRepository1 = new CustomerRepository();
        customerRepository1.getAllCustomersNative();

        CustomerRepository customerRepository2 = new CustomerRepository();
        customerRepository2.getAllCustomersJPQL();


    }
  private static Customer getCustomer() {
    Customer customer=new Customer();
     customer.setId(69);
     customer.setName("sami");
     customer.setAddress("galle");
    // customer.setName("Sachini");
//    NameIdentifier nameIdentifier = new NameIdentifier();
//    nameIdentifier.setFirstName("kamal");
//    nameIdentifier.setMiddleName("kumara");
//    nameIdentifier.setLastName("bandara");


    return customer;
  }




}

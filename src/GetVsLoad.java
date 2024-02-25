import entity.Customer;
import config.SessionFactoryConfig;
import org.hibernate.Session;

public class GetVsLoad {
    public static void main(String[] args) {
        //save
        Session session = SessionFactoryConfig.getInstance().getSession();

        Customer customer = new Customer();
        customer.setName("kamal");
        customer.setAddress("galle");
        session.save(customer);
        session.close();

        //1.Get method

        Session getSession = SessionFactoryConfig.getInstance().getSession();

        System.out.println("-------GET-------");
        Customer getCustomer = getSession.get(Customer.class, 1);
        if (getCustomer != null) {
            System.out.println("Customer Id of Get : " + getCustomer.getId());
            System.out.println("Customer Name of Get : " + getCustomer.getName());
        } else {
            System.out.println("Customer with ID 1 not found");
        }



        //2.Load method

        Session loadSession = SessionFactoryConfig.getInstance().getSession();

        System.out.println("-------LOAD-------");
        Customer loadCustomer = loadSession.load(Customer.class, 1);
        if (loadCustomer != null) {
            System.out.println("Customer Id of Load : " + loadCustomer.getId());
            System.out.println("Customer Name of Load : " + loadCustomer.getName());
        } else {
            System.out.println("Customer with ID 1 not found");
        }
        loadSession.close();
    }
}
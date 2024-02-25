package projection;
/* 
    @author Sachi_S_Bandara
    @created 2/25/2024 - 11:29 AM 
*/

import java.io.PrintWriter;
import java.security.PrivilegedExceptionAction;

public class CustomerProjection {
    private int customerId;
    private String customerName;

    public CustomerProjection() {
    }

    public CustomerProjection(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "CustomerProjection{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}

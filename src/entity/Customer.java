package entity;

import embedded.MobileNumber;
import embedded.NameIdentifier;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/*
    @author Sachi_S_Bandara
    @created 2/2/2024 - 4:26 PM 
*/
@Entity
//@Entity(name = "customer")
@Table(name = "customer")
public class Customer {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //generated value for id
    @Column(name = "customer_id")//column name
    private int id;

    //@Transient //only for entity class and not to database
    @Column(name = "customer_name")
   // private String name;
    private NameIdentifier nameIdentifier;
    @Column(name = "customer_address")
    private String address;

    @Column(name = "customer_salary")
    private double salary;

//    @Column(name =" mobile")
//    private int mobile;

    @ElementCollection
    @CollectionTable(name = "customer_mobile_nums",
    joinColumns = @JoinColumn(name = "customer_id"))

    private List<MobileNumber> mobileNumbers=new ArrayList<>();


    @CreationTimestamp
    private Timestamp createdDateTime;
    @UpdateTimestamp
    private Timestamp updateDateTime;

    public Customer() {
    }

    public Customer(int id, String name, String address, double salary) {
        this.id = id;
        //this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



//    public int getMobile() {
//        return mobile;
//    }

//    public void setMobile(int mobile) {
//        this.mobile = mobile;
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", salary=" + salary +
//                ", mobile=" + mobile +
                '}';
    }

    public NameIdentifier getNameIdentifier() {
        return nameIdentifier;
    }

    public void setNameIdentifier(NameIdentifier nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }
}

package entity;//package Entity;
//
//import embedded.MobileNumber;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//import embedded.NameIdentifier;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
////1.@Entity(name = "customer")
//
//@Entity
//@Table(name = "customer")
//
//
//public class OldCustomer {
//    @Id //thelss hibernate that is the primary key of this table
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "customer_id")
//    private int id;
//
//   @Column(name = "customer_name",length = 10,nullable = false)
////    private String name;
//   private NameIdentifier nameIdentifier;
//
//
//
//    @Column(name = "customer_address")
//    private String address;
//
//    @Transient//to create attributes only for table not in the database
//    @Column(name = "customer_salary")
//    private double salary;
//
//    @Column(name="customer_mobile_no")
//    private int number;
//
//
//
//    @CreationTimestamp //for create time and date
//    private Timestamp createdDateTime;
//
//    @UpdateTimestamp //for updateTime and Date
//    private Timestamp updatedTimeDate;
//
//    @ElementCollection
//    @CollectionTable(name = "customer_mobile_numbers",
//    joinColumns =@JoinColumn(name = "customer_id"))
//
//
//    private List<MobileNumber> mobileNumbers=new ArrayList<>();
//
//
//
//    public OldCustomer(){}
//
//    public NameIdentifier getNameIdentifier() {
//        return nameIdentifier;
//    }
//
//    public void setNameIdentifier(NameIdentifier nameIdentifier) {
//        this.nameIdentifier = nameIdentifier;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
////    public void setName(String name) {
////        this.name = name;
////    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
////    //public void setNumber(int number) {
////        this.number = number;
////    }
//
//    public int getId() {
//        return id;
//    }
//
//    public List<MobileNumber> getMobileNumbers() {
//        return mobileNumbers;
//    }
//
//    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
//        this.mobileNumbers = mobileNumbers;
//    }
////  //  public int getNumber() {
////        return number;
////    }
//
////    public String getName() {
////        return name;
////    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//               // ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", salary=" + salary +
////                ", number=" + number +
//                '}';
//    }
//}

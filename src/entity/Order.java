package entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Column(name = "order_id")
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "order_description")
    private String description;

    @CreationTimestamp
    @Column(name = "order_date_time")
    private Timestamp dateAndTime;

    public Order() {
    }
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;     //order ekk customerta tyenne many to one relationship ekak


//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<Item> items=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "order")
    private List<OrderDetail>orderDetails=new ArrayList<>();

    public Order(int id, String description, Timestamp dateAndTime) {
        this.id = id;
        this.description = description;
        this.dateAndTime = dateAndTime;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAndTime(Timestamp dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", dateAndTime=" + dateAndTime +
                '}';
    }
}

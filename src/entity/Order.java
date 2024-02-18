package entity;

import javax.persistence.*;
import java.sql.Timestamp;

/*
    @author Sachi_S_Bandara
    @created 2/18/2024 - 1:03 PM 
*/
@Entity
@Table(name = "`order`")
public class Order {
    @ManyToMany
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private int id;
    @Column(name = "order_discription")
    private String description;

    @Column(name = "order_date&time")
    private Timestamp orderDateTime;

    public Order() {
    }

    public Order(int id, String description, Timestamp orderDateTime) {
        this.id = id;
        this.description = description;
        this.orderDateTime = orderDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(Timestamp orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", orderDateTime=" + orderDateTime +
                '}';
    }
}

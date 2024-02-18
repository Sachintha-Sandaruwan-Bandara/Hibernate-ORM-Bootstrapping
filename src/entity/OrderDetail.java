package entity;

import embedded.OrderDetailPK;

import javax.persistence.*;

/*
    @author Sachi_S_Bandara
    @created 2/18/2024 - 2:42 PM 
*/
@Table(name = "order_detail")
public class OrderDetail {

    @Column(name = "order_qty")
    private int orderQty;

    @Column(name = "order_price")
    private double price;

    @EmbeddedId
    private OrderDetailPK orderDetailPK;
    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "order_id",insertable = false,updatable = false)
    private Order order;

    public OrderDetail() {
    }

    public OrderDetail(int orderQty, double price, OrderDetailPK orderDetailPK) {
        this.orderQty = orderQty;
        this.price = price;
        this.orderDetailPK = orderDetailPK;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderQty=" + orderQty +
                ", price=" + price +
                ", orderDetailPK=" + orderDetailPK +
                '}';
    }
}

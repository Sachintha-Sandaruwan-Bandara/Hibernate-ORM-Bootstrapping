package embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/*
    @author Sachi_S_Bandara
    @created 2/18/2024 - 2:44 PM 
*/
@Embeddable
public class OrderDetailPK implements Serializable {
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "item_id")
    private int itemId;

    public OrderDetailPK() {
    }

    public OrderDetailPK(int orderId, int itemId) {
        this.orderId = orderId;
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "OrderDetailPK{" +
                "orderId=" + orderId +
                ", itemId=" + itemId +
                '}';
    }
}

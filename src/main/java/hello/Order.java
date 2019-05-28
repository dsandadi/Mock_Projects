package hello;

import java.util.concurrent.atomic.AtomicLong;

public class Order {
    private AtomicLong orderID = new AtomicLong();
    private String orderDesc;
    private String paymentType;

    public Order(AtomicLong orderID, String orderDesc, String paymentType) {
        this.orderID = orderID;
        this.orderDesc = orderDesc;
        this.paymentType = paymentType;
    }

    public AtomicLong getOrderID() {
        return orderID;
    }

    public void setOrderID(AtomicLong orderID) {
        this.orderID = orderID;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}

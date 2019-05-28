package hello;

import java.util.concurrent.atomic.AtomicLong;

public class Users {
    private AtomicLong userId = new AtomicLong();
    private AtomicLong orderId = new AtomicLong();

    public AtomicLong getUserId() {
        return userId;
    }

    public void setUserId(AtomicLong userId) {
        this.userId = userId;
    }

    public AtomicLong getOrderId() {
        return orderId;
    }

    public void setOrderId(AtomicLong orderId) {
        this.orderId = orderId;
    }

    public Users(AtomicLong userId, AtomicLong orderId) {
        this.userId = userId;
        this.orderId = orderId;
    }
}

package generics.InventoryLab;

public class Order implements Comparable<Order>{
    private String orderId;
    public enum OrderType {
        STANDARD,
        EXPRESS
    }
    private OrderType orderType;

    public Order(String orderId, OrderType orderType) {
        this.orderId = orderId;
        this.orderType = orderType;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public OrderType getOrderType() {
        return orderType;
    }
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderType=" + orderType +
                '}';
    }

    @Override
    public int compareTo(Order otherOrder) {
        if (!this.orderType.equals(otherOrder.orderType)){
            if (this.orderType == OrderType.EXPRESS) return -1;
            else return 1;
        }
        return this.orderId.compareTo(otherOrder.orderId);
    }
}

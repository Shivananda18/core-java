package com.xworkz.cart.orderimpl;

public class Order {

    private int orderId;
    private String orderName;
    private double orderPrice;
    private double discount;
    private double potectPromiseFees;
    private double couponsForYou;
    private String warranty;
    private double deliveryFees;

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public double getDeliveryFees() {
        return deliveryFees;
    }

    public void setDeliveryFees(double deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPotectPromiseFees() {
        return potectPromiseFees;
    }

    public void setPotectPromiseFees(double potectPromiseFees) {
        this.potectPromiseFees = potectPromiseFees;
    }

    public double getCouponsForYou() {
        return couponsForYou;
    }

    public void setCouponsForYou(double couponsForYou) {
        this.couponsForYou = couponsForYou;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderPrice=" + orderPrice +
                ", discount=" + discount +
                ", potectPromiseFees=" + potectPromiseFees +
                ", couponsForYou=" + couponsForYou +
                '}';
    }
}

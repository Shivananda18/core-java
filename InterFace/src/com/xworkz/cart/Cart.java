package com.xworkz.cart;

import com.xworkz.cart.orderimpl.Order;

public interface Cart {
    boolean addOrders(Order order);
    void getOrders();
    String getOrderNameById(int orderId);
    int getOrderIdByOrderName(String orderName );
    double getOrderDiscountByOrderPrice(double orderPrice);
    double getPotectPromiseFeesByOrderWarranty(String orderWarranty);
    double getOrderPriceByOrderCoupon(double OrderCoupon);
    String getWarrantyByOrderPrice(double orderPrice);
    boolean updateOrderNameByOrderId(String newName,int id);
    boolean updateOrderIdByOrderName(int newId,String name);
    boolean updateOrderPriceByOrderDiscount(double newPrice,double discount);
    boolean updateOrderPromiseFeesBYOrderWarranty(double newProtectPromiseFees,String warranty);
    boolean updateOrderPriceByOrderCoupon(double newPrice,double coupon);
    boolean updateOrderWarrantyBYOrderPrice(String newWarranty,double price);

}

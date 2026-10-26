package com.xworkz.cart.orderimpl;

import com.xworkz.cart.Cart;

public class OrderImpl implements Cart {

    public Order[] order;
    public OrderImpl(int size){
        order= new Order[size];
    }
    int index;
    @Override
    public boolean addOrders(Order order) {
        boolean isOrderAdedd=false;
        boolean isOderId=false;
        boolean isOrderName=false;
        boolean orderPrice=false;
        boolean isDiscount=false;
        boolean isPotectPromiseFees=false;
        boolean isDeliveryFess=false;
        boolean isWarranty=false;
        boolean isCouponAvailable=false;
        if(order.getOrderId()>0){
            isOderId=true;
        }
        if(order.getOrderName()!=null && !order.getOrderName().isEmpty()){
            isOrderName=true;
        }
        if(order.getOrderPrice()>0){
            orderPrice=true;
        }
        if(order.getDiscount()>0){
            isDiscount=true;
        }
        if(order.getPotectPromiseFees()>0){
            isPotectPromiseFees=true;
        }
        if(order.getCouponsForYou()>0){
            isCouponAvailable=true;
        }
        if(order.getDeliveryFees()>0){
            isDeliveryFess=true;
        }
        if(order.getWarranty()!=null && order.getWarranty().isEmpty()){
            isWarranty=true;
        }
        if(isOderId && isOrderName && orderPrice && isDiscount && isPotectPromiseFees && isCouponAvailable && isDeliveryFess && isWarranty){
            isOrderAdedd=true;
            this.order[index++]=order;
        }
        return isOrderAdedd;
    }
    @Override
    public void getOrders() {
for (Order order1:order){
    System.out.println(order1);
}
    }
    @Override
    public String getOrderNameById(int orderId) {
       String  orderName=null;

       for(Order order1:order){
           if(order1!=null && orderId==order1.getOrderId()){
               orderName=order1.getOrderName();
           }else{
               System.out.println("order Id not match");
           }
       }
        return orderName ;
    }
    @Override
    public int getOrderIdByOrderName(String orderName) {
        int orderId=0;
        for(Order order1:order){
            if(orderName.equals(order1.getOrderName())){
                orderId=order1.getOrderId();
                break;
            }else{
                System.out.println("orderName not match");
            }
        }
        return orderId;
    }

    @Override
    public double getOrderDiscountByOrderPrice(double orderPrice) {
        double orderDiscount=0;
        for(Order order1:order){
            if(orderPrice==order1.getOrderPrice()){
                orderDiscount=order1.getDiscount();
            }else{
                System.out.println("order price not match");
            }
        }
        return orderDiscount;
    }

    @Override
    public double getPotectPromiseFeesByOrderWarranty(String orderWarranty) {
        double protectPromiseFess=0;
        for(Order order1:order){
            if(orderWarranty.equals(order1.getWarranty())){
                protectPromiseFess=order1.getPotectPromiseFees();
            }else{
                System.out.println("warranty not match");
            }
        }
        return protectPromiseFess;
    }
    public double getOrderPriceByOrderCoupon(double orderCoupon){
        double orderPrice=0.0;
        for(Order order1:order){
            if(orderCoupon==order1.getCouponsForYou()){
                orderPrice=order1.getOrderPrice();
            }else {
                System.out.println("orderCoupon not match");
            }
        }
        return orderPrice;
    }

    @Override
    public String getWarrantyByOrderPrice(double orderPrice) {
       String  warranty=null;
       for(Order order1:order) {
           if (orderPrice == order1.getOrderPrice()) {
               warranty = order1.getWarranty();
           }else{
               System.out.println("price not match");
           }
       }
        return warranty;
    }

    @Override
    public boolean updateOrderNameByOrderId(String newName, int id) {
        boolean updatename=false;
        for(Order order1:order){
            if(id==order1.getOrderId()){
                order1.setOrderName(newName);
                updatename=true;
                System.out.println("name is updated");
            }
        }
        return updatename;
    }

    @Override
    public boolean updateOrderIdByOrderName(int newId, String name) {
        boolean updateId=false;
        for(Order order1:order){
            if(name.equals(order1.getOrderName())){
                order1.setOrderId(newId);
                updateId=true;
                System.out.println("id is updated");
            }
        }
        return updateId;
    }

    @Override
    public boolean updateOrderPriceByOrderDiscount(double newPrice, double discount) {
        boolean updatePrice=false;
        for(Order order1:order){
            if(discount==order1.getDiscount()){
                order1.setOrderPrice(newPrice);
                updatePrice=true;
                System.out.println("price updated");
            }
        }
        return updatePrice;
    }

    @Override
    public boolean updateOrderPromiseFeesBYOrderWarranty(double newProtectPromiseFees, String warranty) {
        boolean updateFees=false;
        for(Order order1:order){
            if(warranty.equals(order1.getWarranty())){
                order1.setPotectPromiseFees(newProtectPromiseFees);
                updateFees=true;
                System.out.println("Protect Promise Fees is updated");
            }
        }
        return updateFees;
    }

    @Override
    public boolean updateOrderPriceByOrderCoupon(double newPrice, double coupon) {
        boolean updatePrice=false;
        for(Order order1:order){
            if(coupon==order1.getCouponsForYou()){
                order1.setOrderPrice(newPrice);
                updatePrice=true;
            }
        }
        return updatePrice;
    }

    @Override
    public boolean updateOrderWarrantyBYOrderPrice(String newWarranty, double price) {
        boolean updateWarranty=false;
        for(Order order1:order){
            if(price==order1.getOrderPrice()){
                order1.setWarranty(newWarranty);
                updateWarranty=true;
                System.out.println("warranty is updated");
            }
        }
        return updateWarranty;
    }
}

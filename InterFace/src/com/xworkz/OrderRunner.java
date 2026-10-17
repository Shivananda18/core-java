package com.xworkz;

import com.xworkz.cart.Cart;
import com.xworkz.cart.orderimpl.Order;
import com.xworkz.cart.orderimpl.OrderImpl;

import java.util.Scanner;

public class OrderRunner {

    public static void main(String[] args) {
        System.out.println("enter number of order ");
        Scanner scanner=new Scanner(System.in);
         int  size=scanner.nextInt();
        Cart orderImpl=new OrderImpl(size);

        for(int i=0;i<size;i++) {
            Order order1=new Order();
            System.out.println("enter order Id");
            order1.setOrderId(scanner.nextInt());
            System.out.println("enter order name ");
            order1.setOrderName(scanner.next());

            System.out.println("enter order price");
            order1.setOrderPrice(scanner.nextDouble());

            System.out.println("enter order discount ");
            order1.setDiscount(scanner.nextDouble());

            System.out.println("enter order protectPromiseFees");
            order1.setPotectPromiseFees(scanner.nextDouble());

            System.out.println("enter order coupon fees");
            order1.setCouponsForYou(scanner.nextDouble());

            System.out.println("enter order Warranty years");
            order1.setWarranty(scanner.nextLine());

            System.out.println("enter order Delivery Fees");
            order1.setDeliveryFees(scanner.nextDouble());

          boolean added =orderImpl.addOrders(order1);
          if(!added){
              System.out.println("orders not add");
          }
        }
        orderImpl.getOrders();

        System.out.println("fetching the orderId by orderName");
        orderImpl.getOrderNameById(20);

        System.out.println("fetching the orderName by Id");
        orderImpl.getOrderIdByOrderName("laptop");

        System.out.println("fetching the orderPrice by discount");
        orderImpl.getOrderDiscountByOrderPrice(25000.0);

        System.out.println("fetching the warranty by protect promise fees");
        orderImpl.getPotectPromiseFeesByOrderWarranty("1 years");

        System.out.println("fetching the order price by coupon");
        orderImpl.getOrderPriceByOrderCoupon(1000.0);

        System.out.println("fetching the order Warranty by price");
        orderImpl.getWarrantyByOrderPrice(50000.0);



    }

}

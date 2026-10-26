package com.xworkz;

import com.xworkz.cart.Cart;
import com.xworkz.cart.orderimpl.Order;
import com.xworkz.cart.orderimpl.OrderImpl;

import java.util.Scanner;

public class OrderRunner {

    public static void main(String[] args) {
        System.out.println("enter number of order ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Cart orderImpl = new OrderImpl(size);

        for (int i = 0; i < size; i++) {
            Order order1 = new Order();
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
            scanner.nextLine();
            order1.setWarranty(scanner.nextLine());

            System.out.println("enter order Delivery Fees");
            order1.setDeliveryFees(scanner.nextDouble());

            boolean added = orderImpl.addOrders(order1);
            if (!added) {
                System.out.println("orders not add");
            }
        }
String yesOrNo=null;
        do {
            System.out.println("press 1 to get all doctors");
            System.out.println("press 2 to get OrderName Based on Id");
            System.out.println("press 3 to get OrderId Based on OrderName");
            System.out.println("press 4 to getOrderDiscount Based on OrderPrice");
            System.out.println("press 5 to getProtectPromiseFees Based on OrderWarranty");
            System.out.println("press 6 to getOrderPrice based on OrderCoupon");
            System.out.println("press 7 to getWarranty Based on OrderPrice");
            //System.out.println("press 8 to get all doctors");


            System.out.println("please enter option");
            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    System.out.println("all order details");
                    orderImpl.getOrders();
                    break;

                case 2:
                    System.out.println("fetching the orderId by orderName");
                    orderImpl.getOrderNameById(20);
                    break;

                case 3:
                    System.out.println("fetching the orderName by Id");
                    int id = orderImpl.getOrderIdByOrderName("laptop");
                    break;

                case 4:
                    System.out.println("fetching the orderPrice by discount");
                    orderImpl.getOrderDiscountByOrderPrice(25000.0);
                    break;

                case 5:
                    System.out.println("fetching the warranty by protect promise fees");
                    orderImpl.getPotectPromiseFeesByOrderWarranty("1 years");
                    break;

                case 6:
                    System.out.println("fetching the order price by coupon");
                    orderImpl.getOrderPriceByOrderCoupon(1000.0);
                    break;

                case 7:
                    System.out.println("fetching the order Warranty by price");
                    orderImpl.getWarrantyByOrderPrice(50000.0);
                    break;

                case 8:
                    System.out.println("updating the order name based on id ");
                    orderImpl.updateOrderNameByOrderId("laptop",2);
                    break;

                case 9:System.out.println("update OrderId Based on OrderName");
                    orderImpl.updateOrderIdByOrderName(1,"watch");
                    break;

                case 10:
                    System.out.println("update OrderPrice ased on OrderDiscount");
                    orderImpl.updateOrderPriceByOrderDiscount(10000,500);
                    break;

                case 11:
                    System.out.println("update OrderPromiseFees Based on OrderWarranty");
                    orderImpl.updateOrderPromiseFeesBYOrderWarranty(200,"1 years");
                    break;

                case 12:
                    System.out.println("update OrderPrice Based on OrderCoupon");
                    orderImpl.updateOrderPriceByOrderCoupon(600,500);
                    break;

                case  13 :
                    System.out.println("update OrderWarranty Based on OrderPrice");
                  orderImpl.updateOrderWarrantyBYOrderPrice("1 years",10000);
                    break;

                default:
                    System.out.println("invalid option entry");
            }
            System.out.println("do you want continue ");
           yesOrNo= scanner.next();
        }while(yesOrNo.equalsIgnoreCase("y"));

        }
    }



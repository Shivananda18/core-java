package com.xworkz.demo;

import java.util.Scanner;

public class DemoException {

    public static void main(String[] args) {

             /*

//Arithmetic Exception

        System.out.println("main started");

     try {
         String str = "watch";
         Integer.parseInt(str);
         System.out.println(str);
     } catch (NumberFormatException e) {
         System.out.println("watch can't convert to number");
     }

//NullPointerException
        String yesOrNo=null;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a customer name");
            String customerName = scanner.next();
            try {
                System.out.println("customer Name is : " + customerName.length());
            } catch (NullPointerException e) {
                if (customerName == null && !customerName.isEmpty()) {
                    System.out.println("Please enter  name");
                } else {
                    System.out.println("please enter valid name");
                }
            }
            System.out.println("do you want to continue Y/N");
            yesOrNo= scanner.next();
        }while (yesOrNo.equalsIgnoreCase("y"));
    }

    {
        System.out.println("program continue executing");


 /*
     try {
         int balance = 500;
         int divide = balance / 0;
         System.out.println(divide);
     } catch ( ArithmeticException e) {
         System.out.println("balance amount can't divided by zero");
     }

     String yesOrNo=null;
do {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter amount ");
    double amount = scanner.nextDouble();
    System.out.println("please enter a installment amount");
    double installment = scanner.nextDouble();
    try {
        double amountPerInstallment = amount / installment;

        System.out.println(amountPerInstallment);
    } catch (ArithmeticException exception) {
        if (installment >= 0) {
            System.out.println(" please enter a valid installment amount");
        } else {
            double amountPerInstallment1 = amount / installment;

            System.out.println("installment amount : "+amountPerInstallment1);
        }
        System.out.println("installment can't be zero");
    } finally {
        System.out.println("program continue execution");
    }
    System.out.println("do you want to continue Y/N");
    yesOrNo=scanner.next();
}while (yesOrNo.equalsIgnoreCase("y"));



        String yesOrNo = null;
        do {


            Scanner scanner = new Scanner(System.in);
            System.out.println("enter amount");
            String amount = scanner.next();
            try {
                int amount1 = Integer.parseInt(amount);
                System.out.println(amount1+" is invalid amount ");
                if (amount != null && !amount.isEmpty()) {
                    System.out.println(amount1);
                }
            } catch (NumberFormatException e) {

                System.out.println("please enter a  amount number");
               }
            System.out.println("Do you want to continue with Y/N");
            yesOrNo = scanner.next();
        } while (yesOrNo.equalsIgnoreCase("y"));
*/
        System.out.println("enter arr size");
        Scanner scanner = new Scanner(System.in);

        int arr = scanner.nextInt();
        try {
            System.out.println("enter names");
            String[] names = scanner.next().split(",");
            String[] names1 = names;
            for (int i = 0; i <= arr; i++) {
                System.out.println(names1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("array size is full");

        }

    }
}



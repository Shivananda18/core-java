package com.xworkz;

import com.xworkz.aadhaarCard.AadhaarCard;
import com.xworkz.aadhaarCard.aadhaarCardImpl.AadhaarCardImpl;
import com.xworkz.aadhaarCard.aadhaarCardImpl.AadhaarUser;

import java.util.Scanner;

public class AadhaarRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of users");
        int size = sc.nextInt();
        AadhaarCard aadhaarCardImpl = new AadhaarCardImpl(size);
        for (int i = 0; i < size; i++) {
            AadhaarUser aadhaarUser = new AadhaarUser();
            System.out.println("enter the user Id");
            aadhaarUser.setId(sc.nextInt());

            System.out.println("enter the user name");
            aadhaarUser.setName(sc.next());

            System.out.println("enter the Aadhaar number ");
            aadhaarUser.setAadhaarNumber(sc.nextLong());

            System.out.println("enter the Aadhaar data of birth");
            aadhaarUser.setDateOfBirth(sc.next());

            System.out.println("enter the Mobile Number");
            aadhaarUser.setMobileNumber(sc.nextLong());

            System.out.println("enter the email");
            aadhaarUser.setEmail(sc.next());

            System.out.println("enter the address");
            aadhaarUser.setAddress(sc.next());

            System.out.println("enter the gender");
            aadhaarUser.setGender(sc.next());

            aadhaarCardImpl.addUser(aadhaarUser);
        }
String yesOrNo=null;
        do {


            System.out.println("enter option");
            int option = sc.nextInt();

            System.out.println("press 1 get all Aadhaar details");
            System.out.println("press 2 getUserIdByUserName");
            System.out.println("press 3 getUserAadhaarNumberByUserMobileNumber");
            System.out.println("press 4 getUserEmailBYUserAddress");
            System.out.println("press 5 getUserGenderByUserName");
            System.out.println("press 6 getUserEmailByUserMobileNumber");
            System.out.println("press 7 getUserEmailByUserMobileNumber");

            switch (option) {
                case 1:
                    System.out.println("Aadhaar user details are :");
                    aadhaarCardImpl.getAllUser();
                    break;

                case 2:
                    System.out.println("get UserIdByUserName");
                    aadhaarCardImpl.getUserIdByUserName("Shiva");
                    break;

                case 3:
                    System.out.println("get UserAadhaarNumberByUserMobileNumber");
                    aadhaarCardImpl.getUserAadhaarNumberByUserMobileNumber(7760291885L);
                    break;

                case 4:
                    System.out.println("getUserEmailBYUserAddress");
                    aadhaarCardImpl.getUserEmailBYUserAddress("Arebasaapura");
                    break;


                case 5:
                    System.out.println("getUserGenderByUserName");
                    aadhaarCardImpl.getUserGenderByUserName("Kalmesh");
                    break;

                case 6:
                    System.out.println("getUserEmailByUserMobileNumber");
                    aadhaarCardImpl.getUserEmailByUserMobileNumber(8970327195L);
                    break;

                case 7:
                    System.out.println("getUserAddressByUserAadhaarNumber");
                    aadhaarCardImpl.getUserAddressByUserAadhaarNumber(934415514393L);
                    break;

                case 8:
                    System.out.println("update Id Based on Name");
                    aadhaarCardImpl.updateIdByName(102, "pradeep");
                    System.out.println(aadhaarCardImpl.getUserIdByUserName("pradeep"));

                case 9:
                    System.out.println("");
                    aadhaarCardImpl.updateAadhaarNumberByMobileNumber(11515156515L, 7760291885L);
                    System.out.println(aadhaarCardImpl.getUserAddressByUserAadhaarNumber(7760291885L));

                case 10:
                    System.out.println("updateGenderByname");
                    aadhaarCardImpl.updateGenderByname("male", "pradeep");
                    System.out.println(aadhaarCardImpl.getUserIdByUserName("praddep"));
                    break;

                case 11:
                    System.out.println("");
                    aadhaarCardImpl.updateEmailByAddress("shiva@gmail.com", "Bangalore");
                    System.out.println(aadhaarCardImpl.getUserEmailBYUserAddress("Bangalore"));
                    break;
                default:
                    System.out.println("please enter valid option");
            }
            System.out.println("do you want to continue Y/N");
            yesOrNo=sc.next();
        } while (yesOrNo.equalsIgnoreCase("y"));
    }
}

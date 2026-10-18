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
        aadhaarCardImpl.getAllUser();
        System.out.println("get UserIdByUserName");
        aadhaarCardImpl.getUserIdByUserName("Shiva");
        System.out.println("get UserAadhaarNumberByUserMobileNumber");
        aadhaarCardImpl.getUserAadhaarNumberByUserMobileNumber(7760291885L);
        System.out.println("getUserEmailBYUserAddress");
        aadhaarCardImpl.getUserEmailBYUserAddress("Arebasaapura");
        System.out.println("getUserGenderByUserName");
        aadhaarCardImpl.getUserGenderByUserName("Kalmesh");
        System.out.println("getUserEmailByUserMobileNumber");
        aadhaarCardImpl.getUserEmailByUserMobileNumber(8970327195L);
        System.out.println("getUserAddressByUserAadhaarNumber");
        aadhaarCardImpl.getUserAddressByUserAadhaarNumber(934415514393L);

    }
}

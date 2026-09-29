package com.xworkz.book.book1.poduct1.product;

public class AccountRunner {

    public static void main(String[] args) {


        Account account = new Account();
        account.setBankName("SBI");
        System.out.println("Bank_Name : " + account.getBankName());

        account.setCustomerId(1);
        System.out.println("customer_ID : " + account.getCustomerId());
        account.setUserName("Shiva");
        account.setBalance(500);
        System.out.println("Balance : " + account.getBalance());
        account.setAccountNumber(10644101021790L);
        System.out.println("Account_Number ; " + account.getAccountNumber());
        account.setAddress("Hiremegalagere");
        System.out.println("address : " + account.getAddress());
        account.setAccountOpenDate("10/20/2009");
        System.out.println("Account_Open_Date : " + account.getAccountOpenDate());
        account.setIfscCode("PKGB106012");
        System.out.println("IFSC_Code : " + account.getIfscCode());
        account.setEmail("shivu@gamil.com");
        System.out.println("email : "+account.getEmail());


        Account account1 = new Account();
        account1.setBankName("SBI");
        System.out.println("Bank_Name : " + account.getBankName());
        account1.setCustomerId(1);
        System.out.println("customer_ID : " + account.getCustomerId());
        account1.setUserName("Shiva");
        System.out.println("User_name : ");
        account1.setBalance(500);
        System.out.println("Balance : " + account.getBalance());
        account1.setAccountNumber(10644101021790L);
        System.out.println("Account_Number ; " + account.getAccountNumber());
        account1.setAddress("Hiremegalagere");
        System.out.println("address : " + account.getAddress());
        account1.setAccountOpenDate("10/20/2009");
        System.out.println("Account_Open_Date : " + account.getAccountOpenDate());
        account1.setIfscCode("PKGB106012");
        System.out.println("IFSC_Code : " + account.getIfscCode());
        account1.setEmail("shivu@gamil.com");
        System.out.println("email : "+account.getEmail());

        System.out.println("String representation of Account : "+account);
        System.out.println("String representation of Account1 : "+account1);



    }
}
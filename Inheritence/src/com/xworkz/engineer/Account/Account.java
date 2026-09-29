package com.xworkz.engineer.Account;

public class Account {

    private String bankName;
    private int customerId;
    private String userName;
    private double balance;
    private long accountNumber;
    private String address;
    private String accountOpenDate;
    private String ifscCode;
    private String email;


    public void setBankName(String bankName){
        this.bankName=bankName;
    }
    public String getBankName(){
        return this.bankName;
    }

    public void setCustomerId(int id){
        customerId=id;
    }
    public int getCustomerId(){
        return customerId;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getCustomerName(){
        return this.userName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }


    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }


    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setAccountOpenDate(String accountOpenDate){
        this.accountOpenDate=accountOpenDate;
    }
    public String getAccountOpenDate(){
        return this.accountOpenDate;
    }

    public void setIfscCode(String ifscCode){
        this.ifscCode=ifscCode;
    }
    public String getIfscCode(){
        return this.ifscCode;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }

    public String toString(){

        return "Account : {BankName : "+bankName+"Customer_Id : "+customerId+"User_name : "+userName+"Balance : "+balance+"Account_Number : "+accountNumber+"Address : "+address+"AccountOpenDate : "+accountOpenDate+"IFSC_Code : "+ifscCode+"Email : "+email;

    }
}





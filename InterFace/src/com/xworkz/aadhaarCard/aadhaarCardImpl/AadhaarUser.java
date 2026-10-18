package com.xworkz.aadhaarCard.aadhaarCardImpl;

import java.util.Date;

public class AadhaarUser {

    private int id;
    private String name;
    private long aadhaarNumber;
    private String dateOfBirth;
    private long mobileNumber;
    private String email;
    private String address;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(long aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dob) {
        this.dateOfBirth = dob;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AadhaarUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aadhaarNumber=" + aadhaarNumber +
                ", dob=" + dateOfBirth +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

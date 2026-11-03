package com.xworkz.hospital.hospitalException;

public class InvalidDoctorFeesException extends RuntimeException{

    public InvalidDoctorFeesException(String message){
        super(message);
    }
}

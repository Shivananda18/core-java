package com.xworkz.aadhaarException;

public class InvalidUpdateEmailException extends RuntimeException{

    public InvalidUpdateEmailException(String message){
        super(message);
    }
}

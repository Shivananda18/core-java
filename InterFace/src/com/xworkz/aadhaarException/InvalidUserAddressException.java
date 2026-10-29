package com.xworkz.aadhaarException;

public class InvalidUserAddressException extends RuntimeException{

    public InvalidUserAddressException(String message){
        super(message);
    }
}

package com.xworkz.aadhaarException;

public class InvalidUserEmailException extends RuntimeException{


    public InvalidUserEmailException(String message){
        super(message);
    }
}

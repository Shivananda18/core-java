package com.xworkz.aadhaarException;

public class InvalidUserGenderException extends RuntimeException{

    public InvalidUserGenderException(String message){
        super(message);
    }
}

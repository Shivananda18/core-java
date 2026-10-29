package com.xworkz.aadhaarException;

public class InvalidEmailException extends RuntimeException{

    public  InvalidEmailException(String message ){
        super(message);
    }
}

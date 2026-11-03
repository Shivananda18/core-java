package com.xworkz.hospital.hospitalException;

public class SpecializationNotFoundException extends RuntimeException {
    public SpecializationNotFoundException(String message) {
        super(message);
    }
}

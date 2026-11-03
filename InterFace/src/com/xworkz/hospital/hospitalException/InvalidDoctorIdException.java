package com.xworkz.hospital.hospitalException;

public class InvalidDoctorIdException extends RuntimeException {
    public InvalidDoctorIdException(String message) {
        super(message);
    }
}

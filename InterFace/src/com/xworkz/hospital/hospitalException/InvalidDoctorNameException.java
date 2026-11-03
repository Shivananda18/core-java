package com.xworkz.hospital.hospitalException;

public class InvalidDoctorNameException extends RuntimeException {
    public InvalidDoctorNameException(String message) {
        super(message);
    }
}

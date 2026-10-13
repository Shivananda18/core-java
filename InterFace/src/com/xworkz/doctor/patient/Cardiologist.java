package com.xworkz.doctor.patient;

import com.xworkz.doctor.Doctor;

public  class Cardiologist extends Doctor {

    @Override
    protected void helpPeople() {
        System.out.println("protected access specifiers can be used inside same class , same package  and sub class in other package . ");

    }
    public void freeService(){
        System.out.println("free services to Cardiologist patients");
    }
}

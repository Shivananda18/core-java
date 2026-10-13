package com.xworkz.doctor;

import com.xworkz.doctor.patient.Cardiologist;

public class DoctorRunner {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        //doctor.giveTablet();--we cannot access givetablet method because it is private.

        Doctor cardiologist = new Cardiologist();
        cardiologist.helpPeople();

        Doctor dummy=new Fever();
        dummy.checkBp();

        Doctor fever=new Fever();
        fever.freeService();

        Doctor cardiologist1=new Cardiologist();
        cardiologist1.freeService();
    }
}
package com.xworkz.fortisapp.runner;

import com.xworkz.fortisapp.doctor.Doctor;
import com.xworkz.fortisapp.fortis.Hospital;

public class HospitalRunner {

    public static void main(String[] args) {

        String[] specialization = {"Diabetology/Endocrinology", " Endocrinology"};
        String[] specialization1 = {"General Surgery", "Bariatric Surgery ", "Robotic Surgery ", "General Surgery", " General and Minimal Access Surgery", "General and Laparoscopic Surgery", " Oncology "};
        String[] specialization2 = {"Cardiac Sciences", "Interventional Cardiology"};
        String[] specialization3 = {"Support Specialties ", "General Physician", "Internal Medicine ", "Internal Medicine"};
        String[] specialization4 = {};

        Hospital hospital = new Hospital();
        Doctor doctor = new Doctor();
        doctor.setDoctorId(1);
        doctor.setDoctorName("Anoop Mishra");
        doctor.setDesignation("Executive Chairman Fortis C Doc | Fortis C-Doc");
        doctor.setSpecialization(specialization);
        doctor.setExperience("40 years");
        doctor.setFees(3000);

        hospital.addDoctors(doctor);


        Doctor doctor1 = new Doctor();
        doctor1.setDoctorId(2);
        doctor1.setDoctorName("Dr. (Prof.) Amit Javed");
        doctor1.setDesignation("Principal Director & HOD Lap GI, GI Onco, Bariatric & MIS Surgery | FMRI Gurgaon");
        doctor1.setSpecialization(specialization1);
        doctor1.setExperience("25 years");
        doctor1.setFees(1500);

        hospital.addDoctors(doctor1);

        Doctor doctor2 = new Doctor();
        doctor2.setDoctorId(3);
        doctor2.setDoctorName("Dr. (Col) Manjinder Sandhu");
        doctor2.setDesignation("Principal Director Cardiology | FMRI Gurgaon");
        doctor2.setSpecialization(specialization2);
        doctor2.setExperience("35 years");
        doctor2.setFees(2000);

        hospital.addDoctors(doctor2);


        Doctor doctor3 = new Doctor();
        doctor3.setDoctorId(4);
        doctor3.setDoctorName("Dr. Ajay Agarwal");
        doctor3.setDesignation("Chairman - Internal Medicine | Fortis Noida");
        doctor3.setSpecialization(specialization3);
        doctor3.setExperience("35 years");
        doctor3.setFees(2000);

        hospital.addDoctors(doctor3);

        Doctor doctor4 = new Doctor();
        doctor4.setDoctorId(5);
        doctor4.setDoctorName("Dr. Ajay Kaul");
        doctor4.setDesignation("Chairman Cardiac Science | Fortis Noida");
        doctor4.setSpecialization(specialization4);
        doctor4.setExperience("35 years");
        doctor4.setFees(2000);

        hospital.addDoctors(doctor4);


        hospital.getAllDoctors();


    }
}

package com.xworkz;

import com.xworkz.hospital.Hospital;
import com.xworkz.hospital.fortisHospitalImpl.Doctors;
import com.xworkz.hospital.fortisHospitalImpl.FortisHospitalImpl;

import java.util.Scanner;

public class FortisRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number doctors to be add");
        int size = sc.nextInt();
        Hospital fortisHospital1 = new FortisHospitalImpl(size);

        for (int i = 1; i <= size; i++) {
            Doctors doctors = new Doctors();

            System.out.println("enter doctor id");
            doctors.setDoctorId(sc.nextInt());

            System.out.println("enter doctor name");
            sc.nextLine();

            doctors.setDoctorName(sc.nextLine());
            System.out.println("enter doctor designation");

            doctors.setDesignation(sc.nextLine());
            System.out.println("enter doctor exp");

            doctors.setExperience(sc.nextLine());
            System.out.println("enter doctor fees");

            doctors.setFees(sc.nextInt());
            System.out.println("enter the specializations");

            String specializations = sc.next();
            String[] specailizations = specializations.split(",");
            doctors.setSpecialization(specailizations);

            fortisHospital1.addDoctors(doctors);
        }
        fortisHospital1.getDoctors();
        System.out.println("fetching doctors info  by id");
        Doctors doctors = fortisHospital1.getDoctorsByID(1);
        System.out.println(doctors);
        System.out.println("fetching DoctorName inf by DoctorFess");
        String doctorName = fortisHospital1.getDoctorNameBYDoctorFess(2000);
        System.out.println(doctorName);

        System.out.println("fetching doctor experience");
        int doctorFess = fortisHospital1.getDoctorFeesBYExperience("2 years");
        System.out.println(doctorFess);

        System.out.println("fetching the doctor name by Designation ");
        String designation = fortisHospital1.getDesignationBYDoctorName("cardilogist");
        System.out.println(designation);

        System.out.println("fetching doctor name by id");
        int doctorId = fortisHospital1.getDoctorIdByDoctorName("shivu");
        System.out.println(doctorId);

        System.out.println("fetching doctor specialization info by designation");
        String[] s=fortisHospital1.getSpecializationByDesignation("dc");
        System.out.println(s);

        System.out.println("fetching doctorDesignation info by experience ");
        System.out.println(fortisHospital1.getDoctorExperienceByDoctorDesignation("sdv"));


    }

    }




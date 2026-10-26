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

        String YesOrNo = null;
        do {
            System.out.println("press 1 to get all doctors");
            System.out.println("press 2 to fetch Doctors Based on ID");
            System.out.println("press 3 to fetch DoctorName Based on DoctorFess ");
            System.out.println("press 4 to fetch DoctorFees Based on Experience");
            System.out.println("press 5 to fetch Designation Based on DoctorName");
            System.out.println("press 6 to fetch DoctorId Based on DoctorName");
            System.out.println("press 7 to fetch Specialization based on Designation ");
            System.out.println("press 8 to fetch DoctorExperience Based on DoctorDesignation ");
            System.out.println("press 9 to  updateDoctorFess Based on DoctorName");
            System.out.println("press 10 to updateDoctor based on ExperienceByDoctorId ");
            System.out.println("press 11 to updateDoctorDesignation Based on DoctorName ");
            System.out.println("press 12 to updateDoctorName Based on DoctorId ");

            System.out.println("please enter option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("all doctors details");
                    fortisHospital1.getDoctors();

                    break;

                case 2:
                    System.out.println("fetching doctors info  by id");
                    Doctors doctors = fortisHospital1.getDoctorsByID(1);
                    System.out.println(doctors);
                    break;

                case 3:
                    System.out.println("fetching DoctorName inf by DoctorFess");
                    String doctorName = fortisHospital1.getDoctorNameBYDoctorFess(2000);
                    System.out.println(doctorName);
                    break;

                case 4:
                    System.out.println("fetching doctor experience");
                    int doctorFess = fortisHospital1.getDoctorFeesBYExperience("2 years");
                    System.out.println(doctorFess);
                    break;

                case 5:
                    System.out.println("fetching the doctor name by Designation ");
                    String designation = fortisHospital1.getDesignationBYDoctorName("cardilogist");
                    System.out.println(designation);
                    break;

                case 6:
                    System.out.println("fetching doctor name by id");
                    int doctorId = fortisHospital1.getDoctorIdByDoctorName("Dr. Ajay  Agarwal");
                    System.out.println(doctorId);
                    break;

                case 7:
                    System.out.println("fetching doctor specialization info by designation");
                    String[] s = fortisHospital1.getSpecializationByDesignation("dc");
                    System.out.println(s);
                    break;

                case 8:
                    System.out.println("fetching doctorDesignation info by experience ");
                    System.out.println(fortisHospital1.getDoctorExperienceByDoctorDesignation("sdv"));
                    break;

                case 9:
                    System.out.println("update doctor fees by doctor name");
                    boolean updateFees = fortisHospital1.updateDoctorFessByDoctorName(5000, "Dr. Ajay  Agarwal");
                    System.out.println("doctor fees Updated" + updateFees);
                    System.out.println(fortisHospital1.getDesignationBYDoctorName("shiva"));
                    break;

                case 10:
                    System.out.println("update doctor experience by Doctor id");
                    boolean updateExperience = fortisHospital1.updateDoctorExperienceByDoctorId("5 years", 1);
                    System.out.println("updateExperience ; " + updateExperience);
                    System.out.println(fortisHospital1.getDoctorFeesBYExperience("1 years"));
                    break;

                case 11:
                    System.out.println("update doctor designation by doctor name");
                    boolean updateDesignation = fortisHospital1.updateDoctorDesignationByDoctorName("Principle", "Dr. Ajay  Agarwal");
                    System.out.println("updateDesignation :" + updateDesignation);
                    System.out.println(fortisHospital1.getSpecializationByDesignation("cardiology"));
                    break;

                case 12:
                    System.out.println("__");
                    System.out.println("update doctor name by doctor Id");
                    boolean updateName = fortisHospital1.updateDoctorNameBYDoctorId("shiva", 1);
                    System.out.println("updateName :" + updateName);
                    System.out.println(fortisHospital1.getDoctorsByID(1));
                    break;

                case 13:
                    System.out.println("update doctor specialization by experience");
                    boolean updateSpecialization = fortisHospital1.updateDoctorSpecializationByDoctorExperience("sdv,wf,wa".split(","), "2 years");
                    System.out.println(updateSpecialization);
                    fortisHospital1.getDoctorFeesBYExperience("1 years");
                    break;

                case 14:
                    System.out.println("update doctor id based on name");
                    boolean updateId = fortisHospital1.updateDoctorIdByDoctorName(5, "Dr. Ajay  Agarwal");
                    System.out.println(updateId);
                    fortisHospital1.getDoctorsByID(1);
                    break;

                default:
                    System.out.println("please enter a valid option");
            }
            System.out.println("do you want to continue Y/N");
            YesOrNo = sc.next();
        } while (YesOrNo.equalsIgnoreCase("Y"));

    }
}





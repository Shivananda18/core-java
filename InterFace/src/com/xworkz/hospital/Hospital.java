package com.xworkz.hospital;

import com.xworkz.hospital.fortisHospitalImpl.Doctors;

public interface Hospital {

    boolean addDoctors(Doctors doctors);
    void getDoctors();
   Doctors getDoctorsByID(int id);
  String getDoctorNameBYDoctorFess(int fees);
  int getDoctorFeesBYExperience(String doctorExperience);
  String getDesignationBYDoctorName(String doctorName);
  int getDoctorIdByDoctorName(String doctorName);
  String [] getSpecializationByDesignation(String DoctorDesignation);
  String getDoctorExperienceByDoctorDesignation(String doctorDesignation);
}

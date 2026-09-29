package com.xworkz.fortisapp.doctor;

import java.util.Arrays;

public class Doctor {

    private int doctorId;
    private String doctorName;
    private String designation;
    private String[] specialization;
    private String experience;
    private int fees;


    public void setDoctorId(int doctorId){
        this.doctorId=doctorId;
    }
    public int getDoctorId(){
        return this.doctorId;
    }
    public void setDoctorName(String doctorName){
        this.doctorName=doctorName;
    }
    public String getDoctorName(){
        return this.doctorName;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public String getDesignation(){
        return this.designation;
    }
    public void setSpecialization(String[] specialization){
        this.specialization=specialization;
    }
    public String[] getSpecialization(){
        return this.specialization;
    }
    public void setExperience(String experience){
        this.experience = experience;
    }
    public String getExperience(){
        return this.experience;
    }
    public void setFees(int fees){
        this.fees=fees;
    }
    public int getFees(){
        return this.fees;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", designation='" + designation + '\'' +
                ", specialization=" + Arrays.toString(specialization) +
                ", experience='" + experience + '\'' +
                ", fees=" + fees +
                '}';
    }
}

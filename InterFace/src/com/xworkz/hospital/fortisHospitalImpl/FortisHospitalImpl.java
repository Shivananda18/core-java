package com.xworkz.hospital.fortisHospitalImpl;

import com.xworkz.hospital.Hospital;

public class FortisHospitalImpl implements Hospital {

  private Doctors[] doctors;
  int index;
  public FortisHospitalImpl(int size){
      doctors=new Doctors[size];
  }
    @Override
    public boolean addDoctors(Doctors doctors) {
        boolean isAdded=false;
        boolean idAdded=false;
        boolean nameIsAdded=true;
        boolean designationAdded=false;
        boolean specializationAdded=false;
        boolean experienceIsAdded=false;
        boolean feesAdded=false;

        if(doctors.getDoctorId() >0){
            idAdded=true;
        }
        if(doctors.getDoctorName() != null && !doctors.getDoctorName().isEmpty()){
            nameIsAdded=true;
        }
        if(doctors.getDesignation() !=null && !doctors.getDesignation().isEmpty()){
            designationAdded=true;
        }
        if(doctors.getSpecialization() !=null){
            specializationAdded=true;
        }
        if(doctors.getExperience()!=null && !doctors.getExperience().isEmpty()){
            experienceIsAdded=true;
        }
        if(doctors.getFees()>0){
            feesAdded=true;
        }
        if(idAdded && nameIsAdded && designationAdded && experienceIsAdded && feesAdded && specializationAdded ){
            this.doctors[index++]=doctors;
            isAdded=true;
        }
        
        return isAdded;
    }

    @Override
    public void getDoctors() {
        for(Doctors doctors : doctors){
        }
        }

    @Override
    public Doctors getDoctorsByID(int id) {

        System.out.println("invoking getDoctorsByID ");
      Doctors doctors1=null;
      for(Doctors doctor:doctors){

          if(doctor.getDoctorId()    ==   id){
                    doctors1   =  doctor;
                    break;
          }else{
              System.out.println("doctor id not matching");
          }
      }
        return doctors1;
    }

    @Override
    public String getDoctorNameBYDoctorFess(int fees) {
        System.out.println("invoking getDoctorNameBYDoctorFess ");
      String doctorName=null;
      for(Doctors doctors: doctors){
          if(fees==doctors.getFees()){
               doctorName = doctors.getDoctorName();
              break;
          }else{
              System.out.println("doctor fees not matching");
          }
      }
        return doctorName;
    }

    @Override
    public int getDoctorFeesBYExperience(String doctorExperience) {
        int doctorFess = 0;
        System.out.println("invoking getDoctorFeesBYExperience ");
        for (Doctors doctors : doctors) {
            if (doctorExperience.equals(doctors.getExperience()) ){
                doctorFess = doctors.getFees();

            } else {
                System.out.println("doctor experience not matching");
            }
        }
            return doctorFess;
        }

    @Override
    public  String getDesignationBYDoctorName(String doctorName){
      String designation=null;

      for(Doctors doctors1:doctors){
          if(doctorName.equals(doctors1.getDoctorName())){
              designation=doctors1.getDesignation();
              break;
          }else{
              System.out.println("doctor name not matching");
          }
      }
      return designation;
    }
    @Override
    public int getDoctorIdByDoctorName(String doctorName){
      int doctorId=0;

      for(Doctors doctors1:doctors){
          if(doctorName.equals(doctors1.getDoctorName())){
              doctors1.getDoctorId();
              break;
          }else{
              System.out.println("doctor name not matching");
          }
      }
      return doctorId;
    }

    @Override
    public String[] getSpecializationByDesignation(String DoctorDesignation) {
      String[] specialization=null;

      for(Doctors doctors1:doctors){
          if(DoctorDesignation.equals(doctors1.getDesignation())){
              String[] specialization1=doctors1.getSpecialization();
              break;
          }else{
              System.out.println("doctor designation not matching");
          }
      }
        return specialization;
    }

    @Override
    public String getDoctorExperienceByDoctorDesignation(String doctorDesignation) {
      String experience=null;
      for(Doctors doctors1:doctors){
          if(doctorDesignation.equals(doctors1.getDesignation())){
             experience= doctors1.getExperience();
          }else{
              System.out.println("designation not matching");
          }
      }
      return experience;
    }

}


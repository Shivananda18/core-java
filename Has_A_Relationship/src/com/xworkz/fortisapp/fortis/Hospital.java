package com.xworkz.fortisapp.fortis;

import com.xworkz.fortisapp.doctor.Doctor;

public class Hospital {


   private Doctor[] doctors=new Doctor[5];
   int index;

    public boolean  addDoctors(Doctor doctors) {
          boolean isAdded = false;

          boolean isIdValid = false;
          boolean isDoctorNameValid = false;
          boolean isDoctorDesignationValid=false;
          boolean isSpecializationValid=false;
          boolean isexpirienceValid=true;
          boolean isFeesVAlid=false;

         int id= doctors.getDoctorId();
         if(id > 0){
             isIdValid = true;
         }else System.out.println("doctor_Id is  in_Valid ");

           String doctorName =  doctors.getDoctorName();
           if(doctorName != null && !doctorName.isEmpty()){
               isDoctorNameValid = true;
           }
           else {
               System.out.println("doctor name is in_valid");
           }
        String designation=doctors.getDesignation();
           if(designation !=null && !designation.isEmpty()){
               isDoctorDesignationValid=true;
           }else{
               System.out.println("designation is inValid ");
           }
           String[] specialization=doctors.getSpecialization();
           if(specialization!=null){
               isSpecializationValid=true;
           }else{
               System.out.println("specialization is inValid ");
           }
           String experience=doctors.getExperience();
           if(experience!=null && !experience.isEmpty()){
               isexpirienceValid=true;
           }else{
               System.out.println("expirience is invlaid ");
           }
          int fees= doctors.getFees();
           if(fees>0 ){
               isFeesVAlid=true;
           }else{
               System.out.println("doctor fees invalid ");
           }


           if(isIdValid && isDoctorNameValid && isDoctorDesignationValid && isSpecializationValid && isexpirienceValid && isFeesVAlid){
               this.doctors[index++]=  doctors;
               isAdded = true;
           }else{
               System.out.println("doctor data is not added ");
           }
        return isAdded;
    }
    public boolean getAllDoctors() {
        for (Doctor doctors1 : doctors) {
            System.out.println(doctors1);
        }

        return false;
    }

}

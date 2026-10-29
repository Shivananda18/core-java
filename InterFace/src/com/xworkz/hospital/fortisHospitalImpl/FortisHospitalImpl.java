package com.xworkz.hospital.fortisHospitalImpl;

import com.xworkz.hospital.Hospital;

import javax.print.Doc;

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
            doctors = null;
            try{
            System.out.println(doctors.hashCode());
        }catch (NullPointerException e){
                e.printStackTrace();
            }
        }
        }

    @Override
    public Doctors getDoctorsByID(int id) {

        System.out.println("invoking getDoctorsByID ");
        try {
            Doctors doctors1 = null;
            for (Doctors doctor : doctors) {

                if (doctor.getDoctorId() == id) {
                    doctors1 = doctor;
                    break;
                } else {
                    System.out.println("doctor id not matching");
                }
            }


            return doctors1;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    return  null;
    }

    @Override
    public String getDoctorNameBYDoctorFess(int fees) {
        System.out.println("invoking getDoctorNameBYDoctorFess ");

      String doctorName=null;
      try{
      for(Doctors doctors: doctors){
          if(fees==doctors.getFees()){
               doctorName = doctors.getDoctorName();
              break;
          }else{
              System.out.println("doctor fees not matching");
          }
      }
        return doctorName;
    } catch (Exception e) {
         e.printStackTrace();

        }
        return doctorName;
  }


    @Override
    public int getDoctorFeesBYExperience(String doctorExperience) {
        int doctorFess = 0;
        System.out.println("invoking getDoctorFeesBYExperience ");
        try{
        for (Doctors doctors : doctors) {
            if (doctorExperience.equals(doctors.getExperience()) ){
                doctors=null;
                doctorFess = doctors.getFees();

            } else {
                System.out.println("doctor experience not matching");
            }
        }
            return doctorFess;
        }catch(NullPointerException e){
          e.printStackTrace();

      }
        return doctorFess;
    }

    @Override
    public  String getDesignationBYDoctorName(String doctorName){
      String designation=null;

      try{
      for(Doctors doctors1:doctors){
          if(doctorName.equals(doctors1.getDoctorName())){
              doctors1=null;
              designation=doctors1.getDesignation();
              break;
          }else{
              System.out.println("doctor name not matching");
          }
      }
      return designation;
    }catch (NullPointerException e){
      e.printStackTrace();
      }
      return designation;
    }
    @Override
    public int getDoctorIdByDoctorName(String doctorName){
      int doctorId=0;
try{
      for(Doctors doctors1:doctors){
          if(doctorName.equals(doctors1.getDoctorName())){
              doctors1=null;
              doctors1.getDoctorId();
              break;
          }else{
              System.out.println("doctor name not matching");
          }
      }
      return doctorId;
    }catch (NullPointerException e){
    e.printStackTrace();
}
return doctorId;
    }

    @Override
    public String[] getSpecializationByDesignation(String DoctorDesignation) {
      String[] specialization=null;
try{
      for(Doctors doctors1:doctors){
          if(DoctorDesignation.equals(doctors1.getDesignation())){
              String[] specialization1=doctors1.getSpecialization();
              break;
          }else{
              System.out.println("doctor designation not matching");
          }
      }
        return specialization;
    }catch (NullPointerException e){
    e.printStackTrace();
}
return specialization;
    }

    @Override
    public String getDoctorExperienceByDoctorDesignation(String doctorDesignation) {
      String experience=null;
      try{
      for(Doctors doctors1:doctors){
          if(doctorDesignation.equals(doctors1.getDesignation())){
              doctors1=null;
             experience= doctors1.getExperience();
          }else{
              System.out.println("designation not matching");
          }
      }
      return experience;
    }catch (NullPointerException e){
      e.printStackTrace();
      }
      return experience;
    }

    @Override
    public boolean updateDoctorFessByDoctorName(int newFees, String doctorName) {
       boolean isDoctorFessUpdate=false;

       try{
       for(Doctors doctors1:doctors){
           if(doctorName.equals(doctors1.getDoctorName())){
               doctors1.setFees(newFees);
               isDoctorFessUpdate=true;
               System.out.println("update doctor fees");
           }else{
               System.out.println("doctor fees not updated");
           }
       }
        return isDoctorFessUpdate;
    }catch (NullPointerException e){
       e.printStackTrace();
       }
       return isDoctorFessUpdate;
    }

    @Override
    public boolean updateDoctorExperienceByDoctorId(String newExperience, int doctorId) {
        boolean updateExperience=false;
        for(Doctors doctors1:doctors) {

            try {
                if (doctorId == doctors1.getDoctorId()) {
                    doctors1.setExperience(newExperience);
                    updateExperience = true;
                    System.out.println("update doctor Experience");
                }
            }catch(NullPointerException e){
                e.printStackTrace();
            }

        }

      return updateExperience;
    }

    @Override
    public boolean updateDoctorDesignationByDoctorName(String newDesignation, String name) {
      boolean updateDesignation=false;
      try{
      for(Doctors doctors1:doctors){

          if(name.equals(doctors1.getDoctorName())){
                  doctors1.setDoctorName(newDesignation);
                  updateDesignation=true;
              }
          }
        return updateDesignation;
    }catch (NullPointerException e){
      e.printStackTrace();
      }
      return updateDesignation;
    }

    @Override
    public boolean updateDoctorNameBYDoctorId(String newName, int id) {
      boolean updateName=false;
      try{
      for(Doctors doctors1:doctors){
          if(id==doctors1.getDoctorId()){
              doctors1.setDoctorName(newName);
              updateName=true;
          }
      }
        return updateName;
    }catch (NullPointerException e){
      e.printStackTrace();
      }
      return updateName;
    }

    @Override
    public boolean updateDoctorSpecializationByDoctorExperience(String[] newDesignation, String experience) {
      boolean updateSpecialization=false;
      try{
      for(Doctors doctors1:doctors){
          if(experience.equals(doctors1.getExperience())){
              doctors1.setSpecialization(newDesignation);
              updateSpecialization=true;
              System.out.println("specialization is updated");
          }else{
              System.out.println("specialization is not updated");
          }
      }
      return updateSpecialization;
    }catch (NullPointerException e){
      e.printStackTrace();
      }
      return updateSpecialization;
    }

    @Override
    public boolean updateDoctorIdByDoctorName(int newId, String name) {
      boolean updateDoctorId=false;
      try{
      for(Doctors doctors1:doctors){
          if(name.equals(doctors1.getDoctorName())){
              doctors1.setDoctorId(newId);
              System.out.println("doctor id is updated");
          }
      }
        return updateDoctorId;
    }catch (NullPointerException e){
      e.printStackTrace();
      }
      return updateDoctorId;
    }

}


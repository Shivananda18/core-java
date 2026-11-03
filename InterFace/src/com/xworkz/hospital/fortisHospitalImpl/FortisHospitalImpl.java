package com.xworkz.hospital.fortisHospitalImpl;

import com.xworkz.hospital.Hospital;
import com.xworkz.hospital.hospitalException.*;

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
      try{
        for(Doctors doctors : doctors){
            System.out.println(doctors);
        }
            }catch (NullPointerException e){
          e.printStackTrace();
        }
        }

    @Override
    public Doctors getDoctorsByID(int id) {

        System.out.println("invoking getDoctorsByID ");
            Doctors doctors1 = null;
        try {
            for (Doctors doctor : doctors) {

                if (doctor.getDoctorId() == id) {
                    doctors1 = doctor;
                }
                }
            if(doctors1==null){
                throw new UpdateDoctorException("update doctor not available");
            }
        } catch (UpdateDoctorException e) {
            e.printStackTrace();
        }
       return doctors1;
    }

    @Override
    public String getDoctorNameBYDoctorFess(int fees) {
        System.out.println("invoking getDoctorNameBYDoctorFess ");

      String doctorName=null;
      try{
      for(Doctors doctors: doctors) {
          if (fees == doctors.getFees()) {
              doctorName = doctors.getDoctorName();
          }
          if (doctorName == null) {
              throw new InvalidDoctorNameException("doctor name not found");
          }
      }
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
                doctorFess = doctors.getFees();
            }
            }
        if(doctorFess==0){
            throw new InvalidDoctorFeesException("invalid Doctor Fees");
        }
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
          }
          }
      if(designation==null){
          throw new InvaliddoctorDesignationException("doctor designation not found");
      }
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
          }
          }
      if(doctorId==0){
          throw  new InvalidDoctorIdException(" doctor id not found ");
      }
    }catch (NullPointerException e){
    e.printStackTrace();
}
return doctorId;
    }

    @Override
    public String[] getSpecializationByDoctorName(String DoctorName) {
        String[] specialization = null;
        try {
            for (Doctors doctors1 : doctors) {
                if (DoctorName.equals(doctors1.getDoctorName())) {
                     specialization = doctors1.getSpecialization();
                }
            }
            if (specialization == null) {
                SpecializationNotFoundException specializationNotFoundException = new SpecializationNotFoundException("Specialization not found");
                throw specializationNotFoundException;
            }
            }catch(SpecializationNotFoundException e){
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
          }
          }
      if(experience==null) {
          throw new DoctorExperienceNotFoundException("experience not found");
      }
    }catch (DoctorExperienceNotFoundException e){
      e.printStackTrace();
      }
      return experience;
    }

    @Override
    public boolean updateDoctorFessByDoctorName(int newFees, String doctorName) {
       boolean isDoctorFessUpdate=false;

       try {
           for (Doctors doctors1 : doctors) {
               if (doctorName.equals(doctors1.getDoctorName())) {
                   doctors1.setFees(newFees);
                   isDoctorFessUpdate = true;
                   System.out.println("update doctor fees");
               }
           }
           if (isDoctorFessUpdate == false) {
               UpdateDoctorFeesNotFoundException updateDoctorFeesNotFound = new UpdateDoctorFeesNotFoundException("Updated fees not found");
               throw updateDoctorFeesNotFound;
           }
           }catch(UpdateDoctorFeesNotFoundException e){
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
                if(updateExperience==false) {
                    UpdateDoctorExperienceNotFoundException updateDoctorExperienceNotFoundException = new UpdateDoctorExperienceNotFoundException("updated Experience not found");
                    throw updateDoctorExperienceNotFoundException;
                }
            }catch(UpdateDoctorFeesNotFoundException e){
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
      if(updateDesignation==false) {
          UpdateDoctorDesignationNotFoundException updateDoctorDesignationNotFoundException = new UpdateDoctorDesignationNotFoundException("update Designation not found");
          throw updateDoctorDesignationNotFoundException;
      }
    }catch (UpdateDoctorDesignationNotFoundException e){
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
      }if(updateName==false) {
              UpdateDoctorNameException updateDoctorNameException = new UpdateDoctorNameException("update Doctor name not found");
              throw updateDoctorNameException;
          }
    }catch (UpdateDoctorNameException e){
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
          }
      }
      if(updateSpecialization==false){
          throw new UpdateDoctorSpecializationNotFoundException("update Specialization not found");
      }
    }catch (UpdateDoctorSpecializationNotFoundException e){
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


package com.xworkz.aadhaarCard.aadhaarCardImpl;

import com.xworkz.aadhaarCard.AadhaarCard;
import com.xworkz.aadhaarException.*;
import com.xworkz.dummy.Dummy;

public class AadhaarCardImpl implements AadhaarCard {

   private  AadhaarUser[] aadhaarUsers;
   int index;
  public  AadhaarCardImpl(int size){
        aadhaarUsers=new AadhaarUser[size];
    }
    @Override
    public boolean addUser(AadhaarUser user) {
        boolean addUser=false;
        boolean getId=false;
        boolean getName=false;
        boolean getDateOfBirth=false;
        boolean getAadhaarNumber=false;
        boolean getMobileNumber=false;
        boolean getUserAddress=false;
        boolean getEmail=false;
        boolean getGender=false;
        if(user.getId()>0){
            getId=true;
        }
        if(user.getName()!=null && !user.getName().isEmpty()){
            getName=true;
        }if(user.getAadhaarNumber()>0){
            getAadhaarNumber=true;
        }
        if(user.getDateOfBirth()!=null){
            getDateOfBirth=true;
        }
        if (user.getMobileNumber()>0){
            getMobileNumber=true;
        }
        if(user.getAddress()!=null && !user.getAddress().isEmpty()){
            getUserAddress=true;
        }
        if(user.getGender()!=null && !user.getGender().isEmpty()){
            getGender=true;
        }
        if(user.getEmail()!=null && !user.getEmail().isEmpty()){
            getEmail=true;
        }if(getId && getName && getAadhaarNumber && getDateOfBirth && getMobileNumber && getEmail && getGender && getUserAddress){
            this.aadhaarUsers[index++]=user;
        }
        return addUser;
    }

    @Override
    public void getAllUser() {
      try{
        for(AadhaarUser aadhaarUser:aadhaarUsers) {
            if (aadhaarUser != null) {
                System.out.println(aadhaarUser);
            }
            if (aadhaarUser == null) {
                DoctorsNotFoundException noResultFoundException = new DoctorsNotFoundException("Aadhaar user not added");
                throw noResultFoundException;
            }
        }
    }catch (DoctorsNotFoundException e){
      e.printStackTrace();
      }
    }

    @Override
    public int getUserIdByUserName(String userName) {
      int getUserId=0;
      try{
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userName.equals(aadhaarUser.getName())) {
              getUserId = aadhaarUser.getId();
          }
          }if(getUserId==0){
              IdNotFoundException invalidIdException=new IdNotFoundException("Invalid user Id");
              throw invalidIdException;
          }
    }catch (IdNotFoundException e){
      e.printStackTrace();
      }
      return getUserId;
    }

    @Override
    public long getUserAadhaarNumberByUserMobileNumber(long userMobileNumber) {
      long getAadhaarNumber=0;
      try {
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userMobileNumber==aadhaarUser.getMobileNumber()){
              getAadhaarNumber=aadhaarUser.getAadhaarNumber();
          }
          }
      if(getAadhaarNumber==0){
          AadhaarNumberNotFoundException aadhaarNumberNotFoundException=new AadhaarNumberNotFoundException("Aadhaar Number not found ");
          throw aadhaarNumberNotFoundException;
      }
      }catch (AadhaarNumberNotFoundException e){
          e.printStackTrace();
      }
        return getAadhaarNumber;
    }

    @Override
    public String getUserEmailBYUserAddress(String userAddress) {
      String getEmail=null;
      try{
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userAddress.equals(aadhaarUser.getAddress())){
              getEmail=aadhaarUser.getEmail();
          }
          }
      if(getEmail==null){
          UserEmailNotFoundException userEmailNotFoundException=new UserEmailNotFoundException("Email not Found");
          throw userEmailNotFoundException;
      }
      }catch (UserEmailNotFoundException e){
          e.printStackTrace();
      }
        return getEmail;
    }

    @Override
    public String getUserGenderByUserName(String userName) {
      String getGender=null;
      try {
          for (AadhaarUser aadhaarUser : aadhaarUsers) {
              if (userName.equals(aadhaarUser.getName())) {
                  getGender = aadhaarUser.getGender();
              }
          }
              if (getGender == null) {
                  UserGenderNotFoundException userGenderNotFoundException = new UserGenderNotFoundException("Gender not Found");
                  throw userGenderNotFoundException;
              }
      }catch (UserGenderNotFoundException e){
          e.printStackTrace();
      }
        return getGender;
    }

    @Override
    public String getUserEmailByUserMobileNumber(long userMobileNumber) {
      String getEmail=null;
      try {
          for (AadhaarUser aadhaarUser : aadhaarUsers) {
              if (userMobileNumber > 0) {
                  getEmail = aadhaarUser.getEmail();
              }
          }if(getEmail==null){
                  EmailNotFoundException invalidEmailException=new EmailNotFoundException("invalid email");
                  throw  invalidEmailException;
              }
      }catch (EmailNotFoundException e){
          e.printStackTrace();
      }
        return getEmail;
    }

    @Override
    public String getUserAddressByUserAadhaarNumber(long userAadhaarNumber) {
      String getAddress=null;
      try {
          for (AadhaarUser aadhaarUser : aadhaarUsers) {
              if (userAadhaarNumber > 0) {
                  getAddress = aadhaarUser.getAddress();
              }
          }if(getAddress==null){
                  UserAddressNotFoundException invalidUserAddressException=new UserAddressNotFoundException("Invalid User Address ");
                  throw invalidUserAddressException;
              }
      }catch (UserAddressNotFoundException e){
          e.printStackTrace();
      }
        return getAddress;
    }

    @Override
    public boolean updateIdByName(int newId, String name) {
      boolean updateId=false;
      try {
          for (AadhaarUser aadhaarUser : aadhaarUsers) {
              if (name.equals(aadhaarUser.getName())) {
                  aadhaarUser.setId(newId);
                  updateId = true;
              }
          }if(updateId==false){
                  throw new UpdateIdNotFoundException("invalid user ID updated");
              }
      }catch (UpdateIdNotFoundException e){
          e.printStackTrace();
      }
        return updateId;
    }

    @Override
    public boolean updateAadhaarNumberByMobileNumber(long newAadhaarNumber, long mobileNumber) {
      boolean updateAadhaarNumber=false;
      try {
          for (AadhaarUser aadhaarUser : aadhaarUsers) {
              if (mobileNumber == aadhaarUser.getMobileNumber()) {
                  aadhaarUser.setAadhaarNumber(newAadhaarNumber);
                  updateAadhaarNumber = true;
              }
          }if(updateAadhaarNumber==false){
                  AadhaarNumberNotFoundException invalidAadhaarNumberException=new AadhaarNumberNotFoundException("invalid AadhaarNumber Updated ");
                  throw invalidAadhaarNumberException;
              }
      }catch (UpdateAadhaarNumberNotFoundException e){
          e.printStackTrace();
      }
        return updateAadhaarNumber;
    }

    @Override
    public boolean updateGenderByname(String newGender, String name) {
      boolean updateGender=false;
      try {
          for (AadhaarUser aadhaarUser : aadhaarUsers) {
              if (name.equals(aadhaarUser.getName())) {
                  aadhaarUser.setGender(newGender);
                  updateGender = true;
                  System.out.println("gender is updated");
              }
          }if(updateGender==false){
                  UpdateGenderNotFoundException invalidUpdateGenderException=new UpdateGenderNotFoundException("gender not updated");
                  throw invalidUpdateGenderException;
              }
      }catch (UpdateGenderNotFoundException e){
          e.printStackTrace();
      }
        return updateGender;
    }

    @Override
    public boolean updateEmailByAddress(String newEmail, String address) {
      boolean updateEmail=false;
      try {
          for (AadhaarUser aadhaarUser : aadhaarUsers) {
              if (aadhaarUser.equals(aadhaarUser.getAddress())) {
                  aadhaarUser.setEmail(newEmail);
                  updateEmail = true;
                  System.out.println("email is updated");
              }
          }if(updateEmail==false){
                  UpdateEmailNotFoundException invalidUpdateEmailException=new UpdateEmailNotFoundException("Invalid update Email");
                  throw invalidUpdateEmailException;
              }
      }catch (UpdateEmailNotFoundException e){
          e.printStackTrace();
      }
        return updateEmail;
    }
}

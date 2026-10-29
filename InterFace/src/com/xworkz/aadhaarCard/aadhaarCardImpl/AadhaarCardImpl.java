package com.xworkz.aadhaarCard.aadhaarCardImpl;

import com.xworkz.aadhaarCard.AadhaarCard;
import com.xworkz.aadhaarException.*;

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
        for(AadhaarUser aadhaarUser:aadhaarUsers){
            if(aadhaarUser!=null){
                System.out.println(aadhaarUser);
            }else{
                NoResultFoundException noResultFoundException=new NoResultFoundException("Aadhaar user not added");
                throw noResultFoundException;

            }
        }
    }catch (NoResultFoundException e){
      e.printStackTrace();
      }
    }

    @Override
    public int getUserIdByUserName(String userName) {
      int getUserId=0;
      try{
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userName.equals(aadhaarUser.getName())){
              getUserId=aadhaarUser.getId();
          }else{
              InvalidIdException invalidIdException=new InvalidIdException("Invalid user Id");
              throw invalidIdException;
          }
      }
      return getUserId;
    }catch (InvalidIdException e){
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
          }else{
              InvalidAadhaarNumberException aadhaarNumberException=new InvalidAadhaarNumberException("invalid Aadhaar Exception");
              throw aadhaarNumberException;
          }
      }
      }catch (InvalidAadhaarNumberException e){
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
          }else{
              InvalidUserEmailException invalidUserEmailException=new InvalidUserEmailException("invalid user email");
              throw  invalidUserEmailException;
          }
      }
      }catch (InvalidUserEmailException e){
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
              }else{
                  InvalidUserGenderException invalidUserGenderException=new InvalidUserGenderException("Invalid Gender");
                  throw invalidUserGenderException;
              }
          }
      }catch (InvalidUserGenderException e){
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
              }else{
                  InvalidEmailException invalidEmailException=new InvalidEmailException("invalid email");
                  throw  invalidEmailException;
              }
          }
      }catch (InvalidEmailException e){
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
              }else{
                  InvalidUserAddressException invalidUserAddressException=new InvalidUserAddressException("Invalid User Address ");
                  throw invalidUserAddressException;
              }
          }
      }catch (InvalidUserAddressException e){
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
              }else{
                  throw new InvalidUpdateIdException("invalid user ID updated");

              }
          }
      }catch (InvalidUpdateIdException e){
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
              }else{
                  InvalidAadhaarNumberException invalidAadhaarNumberException=new InvalidAadhaarNumberException("invalid AadhaarNumber Updated ");
                  throw invalidAadhaarNumberException;
              }
          }
      }catch (InvalidUpdateAadhaarNumberException e){
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
              }else{
                  InvalidUpdateGenderException invalidUpdateGenderException=new InvalidUpdateGenderException("gender not updated");
                  throw invalidUpdateGenderException;
              }
          }
      }catch (InvalidUpdateGenderException e){
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
              }else{
                  InvalidUpdateEmailException invalidUpdateEmailException=new InvalidUpdateEmailException("Invalid update Email");
                  throw invalidUpdateEmailException;
              }
          }
      }catch (InvalidUpdateEmailException e){
          e.printStackTrace();
      }
        return updateEmail;
    }
}

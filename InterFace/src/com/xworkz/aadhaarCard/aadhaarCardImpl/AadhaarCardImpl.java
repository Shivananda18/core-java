package com.xworkz.aadhaarCard.aadhaarCardImpl;

import com.xworkz.aadhaarCard.AadhaarCard;

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
        for(AadhaarUser aadhaarUser:aadhaarUsers){
            if(aadhaarUser!=null){
                System.out.println(aadhaarUser);
            }else{
                System.out.println("Aadhaar user not added");
            }
        }
    }

    @Override
    public int getUserIdByUserName(String userName) {
      int getUserId=0;
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userName.equals(aadhaarUser.getName())){
              getUserId=aadhaarUser.getId();
          }
      }
      return getUserId;
    }

    @Override
    public long getUserAadhaarNumberByUserMobileNumber(long userMobileNumber) {
      long getAadhaarNumber=0;
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userMobileNumber==aadhaarUser.getMobileNumber()){
              getAadhaarNumber=aadhaarUser.getAadhaarNumber();
          }
      }
        return getAadhaarNumber;
    }

    @Override
    public String getUserEmailBYUserAddress(String userAddress) {
      String getEmail=null;
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userAddress.equals(aadhaarUser.getAddress())){
              getEmail=aadhaarUser.getEmail();
          }
      }
        return getEmail;
    }

    @Override
    public String getUserGenderByUserName(String userName) {
      String getGender=null;
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userName.equals(aadhaarUser.getName())){
              getGender=aadhaarUser.getGender();
          }
      }
        return getGender;
    }

    @Override
    public String getUserEmailByUserMobileNumber(long userMobileNumber) {
      String getEmail=null;
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userMobileNumber>0){
              getEmail=aadhaarUser.getEmail();
          }
      }
        return getEmail;
    }

    @Override
    public String getUserAddressByUserAadhaarNumber(long userAadhaarNumber) {
      String getAddress=null;
      for(AadhaarUser aadhaarUser:aadhaarUsers){
          if(userAadhaarNumber>0){
              getAddress=aadhaarUser.getAddress();
          }
      }
        return getAddress;
    }
}

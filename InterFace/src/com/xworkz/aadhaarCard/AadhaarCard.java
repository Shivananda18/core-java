package com.xworkz.aadhaarCard;

import com.xworkz.aadhaarCard.aadhaarCardImpl.AadhaarUser;

public interface AadhaarCard {

    boolean addUser(AadhaarUser user);
    void getAllUser();
     int getUserIdByUserName(String userName);
     long getUserAadhaarNumberByUserMobileNumber(long userMobileNumber);
     String getUserEmailBYUserAddress(String userAddress);
     String getUserGenderByUserName(String userName);
     String getUserEmailByUserMobileNumber(long userMobileNumber);
     String getUserAddressByUserAadhaarNumber(long userAadhaarNumber);
     boolean updateIdByName(int newId,String name);
     boolean updateAadhaarNumberByMobileNumber(long newAadhaarNumber,long mobileNumber);
     boolean updateGenderByname(String newGender,String name);
     boolean updateEmailByAddress(String newEmail,String address);
}

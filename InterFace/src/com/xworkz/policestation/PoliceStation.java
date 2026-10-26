package com.xworkz.policestation;

import com.xworkz.policestation.police.PoliceOfficer;

public interface PoliceStation {

    int addPoliceOfficer(PoliceOfficer policeOfficer);
    void getPoliceOfficer();
    String getPoliceOfficerNameByPoliceOfficerId(int policeOfficerId);
     String getPoliceOfficerDepartmentByPoliceOfficerName(String policeOfficerName);
     String getPoliceOfficerBadgeNumberByPoliceOfficerRank(int policeOfficerRank);
     boolean getPoliceOfficerOnDutyByPoliceOfficerAge(int policeOfficerAge);
     int getPoliceOfficerRankBypoliceOfficerId(int policeOfficerId);
     String getPoliceOfficerNameByPoliceOfficerRank(int rank);
     boolean updateOfficerNameById(String newName,int id);
     boolean updateDepartmentByName(String newDepartment,String name);
     boolean updateBadgeNumberByRank(String newBadgeNumber,int rank);
     boolean updateonDutyBYAge(boolean newOnduty,int age);

}

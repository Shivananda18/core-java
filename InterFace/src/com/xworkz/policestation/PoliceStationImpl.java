package com.xworkz.policestation;

import com.xworkz.policestation.police.PoliceOfficer;

public class PoliceStationImpl implements PoliceStation {

    PoliceOfficer[] policeOfficer;
    int index;

    public PoliceStationImpl(int size) {
        policeOfficer = new PoliceOfficer[size];
    }

    @Override
    public int addPoliceOfficer(PoliceOfficer policeOfficer) {
        int addPoliceOfficer = 0;
        boolean policeIdAdded = false;
        boolean policeNameAdded = false;
        boolean policerDeparmentAded = false;
        boolean badgeNumberAdded = false;
        boolean policeRankAdded = false;
        boolean isOnDuty = false;
        boolean policeOfficerAge=false;
        if (policeOfficer.getPoliceId() > 0) {
            policeIdAdded = true;
        }
        if (policeOfficer.getOfficerName() != null && !policeOfficer.getOfficerName().isEmpty()) {
            policeNameAdded = true;
        }
        if (policeOfficer.getDepartment() != null && !policeOfficer.getDepartment().isEmpty()) {
            policerDeparmentAded = true;
        }
        if (policeOfficer.getBadgeNumber() != null && !policeOfficer.getBadgeNumber().isEmpty()) {
            badgeNumberAdded = true;
        }
        if (policeOfficer.getRank() >0) {
            policeRankAdded = true;
        }
        if (policeOfficer.getOnDuty() == true) {
            isOnDuty = true;
        }
        if(policeOfficer.getpoliceOfficerAge()>0){
            policeOfficerAge=true;
        }
        if (policeIdAdded && policeNameAdded && policerDeparmentAded && policeRankAdded && badgeNumberAdded && isOnDuty && policeOfficerAge) {
            this.policeOfficer[index++] = policeOfficer;
        }
        return addPoliceOfficer;
    }

    @Override
    public void getPoliceOfficer() {
        for (PoliceOfficer policeOfficer1 : policeOfficer) {
            System.out.println(policeOfficer1);
            if (policeOfficer1 != null) {
            } else {
                System.out.println("policer not added");
            }
        }
    }

    @Override
    public String getPoliceOfficerNameByPoliceOfficerId(int policeOfficerId) {
        String getPoliceName=null;

        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(policeOfficerId==policeOfficer1.getPoliceId()){
                getPoliceName=policeOfficer1.getOfficerName();
            }
        }
        return getPoliceName;
    }

    @Override
    public String getPoliceOfficerDepartmentByPoliceOfficerName(String policeOfficerName) {
        String getPoliceOfficerDepartment=null;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(policeOfficerName.equals(policeOfficer1.getOfficerName())){
                getPoliceOfficerDepartment=policeOfficer1.getDepartment();
            }
        }
        return getPoliceOfficerDepartment;
    }

    @Override
    public String getPoliceOfficerBadgeNumberByPoliceOfficerRank(int policeOfficerRank) {
        String getBadgeNumber=null;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(policeOfficerRank==policeOfficer1.getRank()){
                getBadgeNumber=policeOfficer1.getBadgeNumber();
            }
        }
        return getBadgeNumber;
    }

    @Override
    public boolean getPoliceOfficerOnDutyByPoliceOfficerAge(int policeOfficerAge) {
        boolean getPoliceOfficerOnduty=false;

        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(policeOfficerAge==policeOfficer1.getpoliceOfficerAge()){
                getPoliceOfficerOnduty=policeOfficer1.getOnDuty();
            }
        }
        return getPoliceOfficerOnduty;
    }

    @Override
    public int getPoliceOfficerRankBypoliceOfficerId(int policeOfficerId) {
        int getRank=0;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(policeOfficerId==policeOfficer1.getPoliceId()){
                getRank=policeOfficer1.getRank();
            }
        }
        return getRank;
    }

    @Override
    public String getPoliceOfficerNameByPoliceOfficerRank(int rank) {
        String getOfficerName=null;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(rank==policeOfficer1.getRank()){
                getOfficerName=policeOfficer1.getOfficerName();
            }
        }
        return getOfficerName;
    }

    @Override
    public boolean updateOfficerNameById(String newName, int id) {
        boolean updateName=false;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(id==policeOfficer1.getPoliceId()){
                policeOfficer1.setOfficerName(newName);
                updateName=true;
                System.out.println("name is updated");
            }
        }
        return updateName;
    }

    @Override
    public boolean updateDepartmentByName(String newDepartment, String name) {
        boolean updateDepartment=false;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(name.equals(policeOfficer1.getOfficerName())){
                policeOfficer1.setDepartment(newDepartment);
                updateDepartment=true;
                System.out.println("Department is updated");
            }
        }
        return updateDepartment;
    }

    @Override
    public boolean updateBadgeNumberByRank(String newBadgeNumber, int rank) {
        boolean updateBadgeNumber=false;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(rank==policeOfficer1.getRank()){
                policeOfficer1.setBadgeNumber(newBadgeNumber);
                updateBadgeNumber=true;
                System.out.println("badge number is updated");
            }
        }
        return updateBadgeNumber;
    }

    @Override
    public boolean updateonDutyBYAge(boolean newOnduty, int age) {
        boolean updateOnDuty=false;
        for(PoliceOfficer policeOfficer1:policeOfficer){
            if(age==policeOfficer1.getpoliceOfficerAge()){
                policeOfficer1.setOnDuty(newOnduty);
                updateOnDuty=true;
                System.out.println("OnDuty is updated");
            }
        }
        return updateOnDuty;
    }
}




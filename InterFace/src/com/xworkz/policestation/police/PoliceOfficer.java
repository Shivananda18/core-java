package com.xworkz.policestation.police;

public class PoliceOfficer {

    private int policeId;
    private String officerName;
    private String department;
    private String badgeNumber;
    private int rank;
    private boolean isOnDuty;
    private int policeOfficerAge;

    public int getPoliceId() {
        return policeId;
    }

    public void setPoliceId(int policeId) {
        this.policeId = policeId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean getOnDuty() {
        return isOnDuty;
    }

    public void setOnDuty(boolean onDuty) {
        isOnDuty = onDuty;
    }
    public int getpoliceOfficerAge(){
        return policeOfficerAge;
    }
    public void setPoliceOfficerAge(int age){
        policeOfficerAge=age;
    }

    @Override
    public String toString() {
        return "PoliceOfficer{" +
                "policeId=" + policeId +
                ", officerName='" + officerName + '\'' +
                ", department='" + department + '\'' +
                ", badgeNumber='" + badgeNumber + '\'' +
                ", rank='" + rank + '\'' +
                ", isOnDuty=" + isOnDuty +"policeOfficerAge= "+policeOfficerAge+
                '}';
    }
}
package com.xworkz.equalsmethodapp.drivingLicence;

public class DrivingLincenceRunner {

    public static void main(String[] args) {

        DrivingLicence drivingLicence=new DrivingLicence();
        drivingLicence.name="shivu";
        drivingLicence.dlNumber="ljdg26";
        drivingLicence.dateOfBirth="25/10/1998";
        drivingLicence.address="Bang//alore";
        drivingLicence.bloodGroup="B+";

        DrivingLicence drivingLicence1=new DrivingLicence();
        drivingLicence1.name="shivu";
        drivingLicence1.dlNumber="ljdg26";
        drivingLicence1.dateOfBirth="25/10/1998";
        drivingLicence1.address="Bang//alore";
        drivingLicence1.bloodGroup="B+";

        System.out.println("drivingLicence and drivingLicence1 are same : "+drivingLicence.equals(drivingLicence1));
        System.out.println(drivingLicence.hashCode());
        System.out.println(drivingLicence1.hashCode());
        System.out.println(drivingLicence);
        System.out.println(drivingLicence1);

    }
}

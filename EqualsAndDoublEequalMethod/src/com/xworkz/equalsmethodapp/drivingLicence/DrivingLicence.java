package com.xworkz.equalsmethodapp.drivingLicence;

import java.util.Objects;

public class DrivingLicence {

    public String name;
    public String dlNumber;
    public  String dateOfBirth;
    public String address;
    public String bloodGroup;


    @Override
    public boolean equals(Object object) {

        DrivingLicence drivingLicence = (DrivingLicence) object;

        if (this.name.equals(drivingLicence.name))
            return true;

        return false;
    }
    public int hashCode(){
        return Objects.hash(name,dlNumber,dateOfBirth,address,bloodGroup);
    }
    public String toString(){
        return "Driving Licence : {name : "+name
                +"dlnumber : "+dlNumber
                +"dateOfBirth : "
                +dateOfBirth+"address : "
                +address+"bloodGroup : "
                +bloodGroup+"}";
    }
}

package com.xworkz.equalsmethodapp;

public class Watch {

    public int watchId;
    public String watchName;
    public double price;
    public String bandColor;
    public String countryOfOrigin;


    @Override
    public boolean equals(Object object) {

        Watch watch1 = (Watch) object;

        if(this.watchId==watch1.watchId && this.watchName.equals(watch1.watchName) && this.price==watch1.price && this.bandColor.equals(watch1.bandColor) && this.countryOfOrigin.equals(watch1.countryOfOrigin))
            return true;

        return false;

    }
}

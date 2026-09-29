package com.xworkz.equalsmethodapp;

public class Swiggy {

    public int swiggyId;
    public String swiggyOrderName;
    public int swiggyOrderNumber;
    public int orederPrice;
    public String orderLocation;

    public boolean equals(Object object) {

        Swiggy swiggy = (Swiggy) object;
        if (this.swiggyId == swiggy.swiggyId && this.swiggyOrderName.equals(swiggy.swiggyOrderName) && this.swiggyOrderNumber == swiggy.swiggyOrderNumber && this.orederPrice == swiggy.orederPrice && this.orderLocation.equals(swiggy.orderLocation))

            return true;

return  false;
    }
}
package com.xworkz.equalsmethodapp.washingMachine;

import java.util.Objects;

public class WashingMachine {

    public String machineName;
    public String Product;
    public String Dimensions;
    public String brand;
    public String accessLocation;

    @Override
    public boolean equals(Object object){

        WashingMachine washingMachine=(WashingMachine)object;
    if(this.machineName.equals(washingMachine.machineName)
            && this.Product.equals(washingMachine.Product)
            && this.Dimensions.equals(washingMachine.Dimensions)
            && this.brand.equals(washingMachine.brand)
            && this.accessLocation.equals(washingMachine.accessLocation))
        return true;
    return false;
    }

    public int hashcode(){
        return Objects.hash(machineName,Product,Dimensions,brand,accessLocation);
    }
}

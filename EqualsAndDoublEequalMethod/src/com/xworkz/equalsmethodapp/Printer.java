package com.xworkz.equalsmethodapp;

import java.util.Objects;

public class Printer {

    public String brandName;
    public String connectingTechnology;
    public String printing;
    public String specialFeature;
    public String itemWeight;
    public String modelName;

    @Override
    public boolean equals(Object object){

        com.xworkz.equalsmethodapp.Printer printer =(Printer)object;

if(this.brandName.equals(printer.brandName) && this.connectingTechnology.equals(connectingTechnology) && this.printing.equals(printer.printing) && this.specialFeature.equals(printer.specialFeature) && this.itemWeight.equals(printer.itemWeight) && this.modelName.equals(printer.modelName))
        return true;

return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, connectingTechnology, printing, specialFeature, itemWeight, modelName);
    }


    @Override
    public String toString() {
        return "Printer{" +"brandName='" + brandName + '\'' +
                ", connectingTechnology='" + connectingTechnology + '\'' +
                ", printing='" + printing + '\'' +
                ", specialFeature='" + specialFeature + '\'' +
                ", itemWeight='" + itemWeight + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}

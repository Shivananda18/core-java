package com.xworkz.equalsmethodapp.laptop;

import java.util.Objects;

public class Laptop {

    public String laptopName;
    public String modelName;
    public String color;
    public  int hardDiskSizeinMB;


    @Override
    public boolean equals(Object object){

        Laptop laptop=(Laptop)object;

        if(this.laptopName.equals(laptop.laptopName) && this.modelName.equals(laptop.modelName) && this.color.equals(laptop.color) && this.hardDiskSizeinMB==laptop.hardDiskSizeinMB)
        return  true;

        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(laptopName,modelName,color,hardDiskSizeinMB);
    }
    public String toString(){
        return "Laptop :{laptopName : "+laptopName+"modelName : "+modelName+"color : "+color+"HardDiskSizeInMB : "+hardDiskSizeinMB+"}";
    }
}

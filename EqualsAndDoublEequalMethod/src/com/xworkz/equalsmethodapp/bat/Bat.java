package com.xworkz.equalsmethodapp.bat;

import java.util.Objects;

public class Bat {

    public String brandName;
    public int batSize;
    public String materialType;
    public String color;

@Override
    public  boolean equals(Object object){

    System.out.println("executing the equals method...........");
    Bat bat=(Bat)object;//down casting
    if(this.brandName == bat.brandName && this.batSize==bat.batSize && this.materialType.equals(bat.materialType) && this.color.equals(bat.color))
    return true;
    return  false;
}
public int hashCode(){
    System.out.println("executing the hashCode method.............");
    return Objects.hash(brandName,batSize,materialType,color);
}
public  String toString(){
    System.out.println("executing the toString method.............");
    return "Bat : {brandName : "+brandName+"batSize : "+batSize+"materialType : "+materialType+"color : "+color+"}";
}
}

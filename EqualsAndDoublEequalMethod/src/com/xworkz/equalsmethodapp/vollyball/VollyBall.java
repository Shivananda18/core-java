package com.xworkz.equalsmethodapp.vollyball;

import java.util.Objects;

public class VollyBall {

    public String ballName;
    public String material;
    public String ageRange;
    public String itemWeight;
    public  String color;
    public int price;

@Override
    public boolean equals(Object object){

        VollyBall vollyBall=(VollyBall)object;

        if(this.ballName.equals(vollyBall.ballName) && this.material.equals(material) && this.ageRange.equals(vollyBall.ageRange) && this.itemWeight.equals(vollyBall.itemWeight) && this.color.equals(vollyBall.color) && this.price==vollyBall.price)
            return true;

        return false;
    }
    public int hashCode(){
    return Objects.hash(ballName,material,ageRange,itemWeight,color,price);
    }
}

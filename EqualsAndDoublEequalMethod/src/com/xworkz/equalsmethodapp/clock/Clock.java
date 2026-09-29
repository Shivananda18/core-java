package com.xworkz.equalsmethodapp.clock;

import java.util.Objects;

public class Clock {

    public String brand;
    public  String style;
    public String specialFeature;
    public String displayType;
    public  int productPrice;

    @Override
    public  boolean equals(Object object)
    {
        Clock clock=(Clock)object;
        if(this.brand.equals(clock.brand) && this.style.equals(clock.style) && this.specialFeature.equals(clock.specialFeature) && this.displayType.equals(clock.displayType) && this.productPrice==clock.productPrice )
            return true;
        return false;
    }
    public int hashCode(){
        return Objects.hash(brand,style,specialFeature,displayType,productPrice);
    }
    public  String toString(){
        return "Clock :{brand : "+brand+"style : "+style+"specialFeature : "+specialFeature+"displaytype : "+displayType+"productPrice : "+productPrice+"}";
    }
}

package com.xworkz.equalsmethodapp.Bikeapp;

import java.util.Objects;

public class Bike {

    public String bikeName;
    public String bikeNumber;
    public int bikePrice;
    public String engineCC;

@Override
public boolean equals(Object object){
    Bike bike=(Bike)object;
    if(this.bikeName.equals(bike.bikeName) && this.bikeNumber == bikeNumber && this.bikePrice==bike.bikePrice && this.engineCC.equals(bike.engineCC))
    return true;
    return false;
}
@Override
public int hashCode(){
    return Objects.hash(bikeName,bikeNumber,bikePrice,engineCC);
}

}

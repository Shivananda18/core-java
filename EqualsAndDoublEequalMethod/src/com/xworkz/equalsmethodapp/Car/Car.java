package com.xworkz.equalsmethodapp.Car;

import java.util.Objects;

public class Car {

    public String carName;
    public String carNumber;
    public  int price;
    public String color;

    @Override
public boolean equals(Object object){

        Car car=(Car)object;
        if(this.price==car.price)
        return true;
        return false;
    }
    public int hashCode(){
        return Objects.hash(carName,carNumber,price,color);
    }
    public String toString(){

        return "Car : {" +"carName : "+carName+"carNumber : "+carNumber+"price :"+price+"color : "+color;}
    }


package com.xworkz.equalsmethodapp.Car;

public class CarRunner {
    public static void main(String[] args) {

        Car car=new Car();
        car.carName="Range Rover";
        car.carNumber="KA 16 1360";
        car.color="Balck";
        car.price=30000000;

        Car car1=new Car();
        car1.carName="Range Rover";
        car1.carNumber="KA 16 1360";
        car1.color="Balck";
        car1.price=30000000;

        System.out.println("car and car1 are same : "+car.equals(car1));
        System.out.println("car hashCode : "+car.hashCode());
        System.out.println("car1 hashCode : "+car1.hashCode());

        System.out.println(car);
        System.out.println(car1);
    }
}

package com.xworkz.equalsmethodapp.Bikeapp;

public class BikeRunner {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.bikeName = "tvs";
        bike.bikeNumber = "KA 16 1360";
        bike.bikePrice = 120000;
        bike.engineCC = "125cc";

        Bike bike1 = new Bike();
        bike1.bikeName = "tvs";
        bike1.bikeNumber = "KA 16 1360";
        bike1.bikePrice = 120000;
        bike1.engineCC = "125cc";

        System.out.println("tvs and hero honda are same location : "+bike.equals(bike1));
        System.out.println("bike ref hashcode : "+bike.hashCode());
        System.out.println("bike1 ref hashcode : "+bike1.hashCode());





    }
}

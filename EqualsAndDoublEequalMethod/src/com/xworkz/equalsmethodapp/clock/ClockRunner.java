package com.xworkz.equalsmethodapp.clock;

public class ClockRunner {
    public static void main(String[] args) {

        Clock clock=new Clock();
        clock.brand="Ajantha";
        clock.displayType="Analog";
        clock.style="Modern";
        clock.specialFeature="step Movement";
        clock.productPrice=300;

        Clock clock1=new Clock();
        clock1.brand="Ajantha";
        clock1.displayType="Analog";
        clock1.style="Modern";
        clock1.specialFeature="step Movement";
        clock1.productPrice=300;

        System.out.println("clock and clock1 are equal : "+clock.equals(clock1));
        System.out.println("hashCode value of clock "+clock.hashCode());
        System.out.println("hash value of clock1 :  "+clock1.hashCode());

        System.out.println("string representatioon of clock : "+clock);
        System.out.println("string representation of clock1 : "+clock1);


    }
}

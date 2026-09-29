package com.xworkz.equalsmethodapp.washingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {

        WashingMachine washingMachine=new WashingMachine();
        washingMachine.machineName="LG Smart";
        washingMachine.Product="44D x 60W x 85H";
        washingMachine.Dimensions="Centimeters";
        washingMachine.brand="LG";
        washingMachine.accessLocation="Front Load";

        WashingMachine washingMachine1=new WashingMachine();
        washingMachine1.machineName="LG Smart";
        washingMachine1.Product="44D x 60W x 85H";
        washingMachine1.Dimensions="Centimeters";
        washingMachine1.brand="LG";
        washingMachine1.accessLocation="Front Load";

        System.out.println("washing Machine and washingMachine1 are same location : "+washingMachine.equals(washingMachine1));

        System.out.println("washing machine hashcode : "+washingMachine.hashcode());
        System.out.println("washing machine1 hashcode : "+washingMachine1.hashcode());
    }
}

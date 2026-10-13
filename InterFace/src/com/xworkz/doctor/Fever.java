package com.xworkz.doctor;

public class Fever extends Doctor{

    @Override
    void checkBp(){
        System.out.println("default access specifiers  can used be used inside class and same package ");

    }
    @Override
    public void freeService(){
        System.out.println("free services fever patients ");
    }
}

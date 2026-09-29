package com.xworkz.inheritance.parent.methods;

public class StaticMethod {
    public static void method(){
        System.out.println("calling the static method by using the class name");
    }
   static void main(String[] a) {
        method();
        StaticMethod staticMethod =new StaticMethod();
        StaticMethod.method();
    }


}


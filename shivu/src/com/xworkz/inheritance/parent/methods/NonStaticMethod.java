package com.xworkz.inheritance.parent.methods;

public class NonStaticMethod {
    public void method(){
        System.out.println(" call the non-static method by using the Object");
    }
    static void main(String[] a) {
        NonStaticMethod nonStaticMethod=new NonStaticMethod();
        nonStaticMethod.method();
    }
}

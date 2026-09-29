package com.xworkz.inheritance.parent;

import com.xworkz.inheritance.parent.childclass.ChildClass;

public class ParentClass {

    public Object method1(){ // object class is parent class of every class and  it is default class
        System.out.println("method1 from parent class");
        return ' ';//return anything form below Object class it can be primitive or object reference data types
    }
    public  void method2(){
        System.out.println("method2 from parent class ");
    }
    public  void method3() {
        System.out.println("methods3 form child class");
    }
}

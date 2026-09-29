package com.xworkz.inheritance.parent.Runner;

import com.xworkz.inheritance.parent.ParentClass;
import com.xworkz.inheritance.parent.childclass.ChildClass;

public class ParentRunner {

    public static void main(String[] args) {

        ParentClass parentClass =new ParentClass();
        parentClass.method1();
        parentClass.method2();//in a parent class object we call only parent methods


        ChildClass childClass=new ChildClass();
        childClass.method1();
        childClass.method2();//in  a child class object we can call parent methods and child methods

        ParentClass ref=new ChildClass();//polymorphism / upcasting
        ref.method1();//method call form child object reference and which reference we use to call the functions that ref object functions only we call
        ref.method2();

        ChildClass ref1 =(ChildClass)ref;//down casting or explicit casting
        ref1.method1();
        ref1.method2();

    }
}

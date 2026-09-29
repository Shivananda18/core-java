package com.xworkz.inheritance.parent.childclass;

import com.xworkz.inheritance.parent.ParentClass;

public class ChildClass extends ParentClass {

    @Override
    public String method1() {
        System.out.println("method1 from child class");
        return "";
    }

    public void method2() {
        System.out.println("method2 from child class ");
    }
    @Override
    public void method3() {
        System.out.println("methods3 form child class override");
    }
}

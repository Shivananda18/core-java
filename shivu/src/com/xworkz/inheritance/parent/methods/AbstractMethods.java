package com.xworkz.inheritance.parent.methods;

abstract class AbstractMethod {

  abstract void method(String name);

}
public  class AbstractMethods extends AbstractMethod {

    @Override
    void method(String name) {
        System.out.println(name);
    }
    static void main(String[] a) {
        AbstractMethods abstractMethod= new AbstractMethods();
        abstractMethod.method("shivu");
    }
}

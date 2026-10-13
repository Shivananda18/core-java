package com.xworkz.doctor;

public  class Doctor {

    // functional interfaces means the interface class have a exactly one abstract method
    private void treatment() {
        System.out.println("interface allow the private fields or methods");
        System.out.println("private methods or variable access inside the class only");
    }
     private void giveTablet(){
         System.out.println("private access specifiers can use inside class only. if we want to access by using accessors and mutators(getter and setter)");
      }

    void checkBp(){
        System.out.println("doctor check bp");
    }

    protected void helpPeople(){
        System.out.println("Doctor help people");
    }
public void freeService(){
    System.out.println("doctor give free services for patient");
}

}

package engg.EngineeringBranches.childclass;

public class Engineer {//for every class have a parent  class-->that is "Object class"==> this concept is called "implicit inheritance" and also this is single level inheritance

    public Engineer() {

        System.out.println("default Engineer constructor is invoked in parent class");

    }
    public Engineer(String name) {

       // call the current class constructor
        System.out.println(" 1 parameterized Constructor is invoked in parent class================ "+name);

    }
    public void buildSoftware1() {
        System.out.println("developer use the tool to build the software1");
    }
}

package engg.parent;

import engg.EngineeringBranches.childclass.Engineer;

public class Runner {

    public static void main(String[] args) {

        Engineer engineer =new Engineer();//object behave differently at given instant time
        engineer.buildSoftware1();


       CSEngineer csEngineer3= new CSEngineer();
        csEngineer3.buildSoftware2();
        csEngineer3.buildSoftware1();

        Engineer engineer1=new Engineer("kalmesh");

        Engineer csEngineer=new CSEngineer("shivu");//up casting
        csEngineer.buildSoftware1();

        CSEngineer csEngineer1=(CSEngineer)csEngineer;// explicit method //down casting-->To access the child class fields or methods
       csEngineer1.buildSoftware1();
       csEngineer1.buildSoftware2();


    }
}

package engg.parent;

import com.sun.source.tree.ClassTree;
import engg.EngineeringBranches.childclass.Engineer;

public class CSEngineer extends Engineer {

    public CSEngineer(){

        System.out.println("default CS Engineer constructor invoked in child class ");
    }
    public CSEngineer(String name){
        this();

        System.out.println("1 parameterized constructor is invoked in child class +++++++++++++++"+name);
    }
    public void buildSoftware2(){
        System.out.println("developer use the tool to build the software2");
    }
    @Override
    public void buildSoftware1() {
        System.out.println("developer use the tool to build the software cs Engineer");
    }

}//explicit--> lower range to higher range casting (like. byte to short or int )
//implicit--> higher range casting to lower range casting ( like. int to short or byte)
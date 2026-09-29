package com.xworkz.fortisapp.Bakery;

import com.xworkz.fortisapp.Bakery.condiment.Condiment;

public class Bakery {

   private Condiment[] condiments=new Condiment[17];
    int index;
    public boolean addCondiments(Condiment condiment){
        boolean isCondimentsAdded=false;
        boolean isCondimentIDValid=false;
        boolean isCondimentNameValid=false;
        boolean isCondimentPriceValid=false;


        if(condiment.getCandimentId()>0){
            isCondimentIDValid=true;
        }
        if(condiment.getCandimentName() !=null && !condiment.getCandimentName().isEmpty()){
            isCondimentNameValid=true;
        }
        if(condiment.getPrice() >0) {
            isCondimentPriceValid = true;
        }
        if(isCondimentIDValid && isCondimentNameValid && isCondimentPriceValid){
            this.condiments[index++]=condiment;
            isCondimentsAdded=true;
        }
        return isCondimentsAdded;
    }
    public void getAllCondiments(){
        for(Condiment condiment:condiments){
            System.out.println(condiment);
        }
    }

}

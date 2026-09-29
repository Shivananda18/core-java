package com.xworkz.fortisapp.showroom;

import com.xworkz.fortisapp.showroom.model.Models;

public class RoyalEnfieldShowRoom {

   private  Models[] models=new Models[23];
   int index;//instance variable

    public boolean addModels(Models models){//models is  locale variable || to access the private fields by using methods
        boolean isModelsAdded=false;
        boolean modelIdisValid=false;
        boolean isModelNameIsValid=false;
        boolean isModelOnroadPriceIsValid=false;
        boolean isBrakesAndWheelsIsValid=false;
        boolean isRearBrakeTypeValid=false;
        boolean tyreTypeIsValid=false;
        boolean isColorIsValid=false;
        boolean isBrakingSystemisValid=false;

        if(models.getModelID()>0 ){
            modelIdisValid=true;

        }
        if(models.getModelName() != null && !models.getModelName().isEmpty()){
            isModelNameIsValid=true;
        }
        if(models.getOnRoadPrice()>0 ){
            isModelOnroadPriceIsValid=true;
        }
        if(models.getBrakesAndWheels() !=null && !models.getBrakesAndWheels().isEmpty()){
             isBrakesAndWheelsIsValid=true;
        }
        if(models.getRearBrakeType() !=null && !models.getRearBrakeType().isEmpty()){
             isRearBrakeTypeValid=true;
        }
        if(models.getTyreType() !=null && !models.getTyreType().isEmpty()){
             tyreTypeIsValid=true;
        }
        if(models.getColor() !=null && !models.getColor().isEmpty()){
             isColorIsValid=true;
        }
        if(models.getBrakingSystem() !=null && !models.getBrakingSystem().isEmpty()){
             isBrakingSystemisValid=true;
        }
        if(modelIdisValid && isModelNameIsValid && isModelOnroadPriceIsValid && isBrakesAndWheelsIsValid && isColorIsValid && isBrakingSystemisValid && isRearBrakeTypeValid && tyreTypeIsValid ){

           this.models[index++] = models;
           isModelsAdded=true;

        }
        return isModelsAdded;
    }
    public void getAllModels(){
        for(Models models1 : models){
            System.out.println(models1);
        }
    }


}

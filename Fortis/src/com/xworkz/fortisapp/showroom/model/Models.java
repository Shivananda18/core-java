package com.xworkz.fortisapp.showroom.model;

public class Models {

private int modelID;
private String modelName;
private double onRoadPrice;
private String brakesAndWheels;
private String rearBrakeType;
private String tyreType;
private String color;
private String brakingSystem;


    public int getModelID() {
        return modelID;
      }

    public void setModelID(int modelID) {
        this.modelID = modelID;
       }

    public String getModelName() {
        return modelName;
      }

    public void setModelName(String modelName) {
        this.modelName = modelName;
       }

    public double getOnRoadPrice() {
        return onRoadPrice;
      }

    public void setOnRoadPrice(double onRoadPrice) {
        this.onRoadPrice = onRoadPrice;
       }

    public String getBrakesAndWheels() {
        return brakesAndWheels;
       }

    public void setBrakesAndWheels(String brakesAndWheels) {
        this.brakesAndWheels = brakesAndWheels;
       }

    public String getRearBrakeType() {
        return rearBrakeType;
       }

    public void setRearBrakeType(String rearBrakeType) {
        this.rearBrakeType = rearBrakeType;
       }

    public String getTyreType() {
        return tyreType;
       }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
       }

    public String getColor() {
        return color;
       }

    public void setColor(String color) {
        this.color = color;
       }
       public void setBrakingSystem(String brakingSystem){
       this.brakingSystem=brakingSystem;
       }
       public String getBrakingSystem(){
        return  this.brakingSystem;
       }

    @Override
    public String toString() {
        return "Models{ : " +
                "modelID=" + modelID +
                ", modelName='" + modelName+
                ", onRoadPrice=" + onRoadPrice+
                ", brakesAndWheels='" + brakesAndWheels+
                ", rearBrakeType='" + rearBrakeType+
                ", tyreType='" + tyreType+
                ", color='" + color+"BrakingSystem=" +brakingSystem+'}';
    }
}

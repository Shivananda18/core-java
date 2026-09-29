package com.xworkz.fortisapp.bmtc.platform;

public class PlatForm {

    private int platFormId;
    private String platformNumber;
    private String routNumber;
    private String rout;
    private String destination;

    public void setPlatformId(int platFormId){
        this.platFormId=platFormId;
    }
    public int getPlatFormId(){
        return this.platFormId;
    }
    public void setPlatformNumber(String platformNumber){
        this.platformNumber=platformNumber;
    }
    public String getPlatformNumber(){
        return this.platformNumber;
    }
    public void setRout(String rout){
        this.rout=rout;
    }
    public String getRout(){
        return this.rout;
    }
    public void setRoutNumber(String routNumber){
        this.routNumber=routNumber;
    }
    public String getRoutNumber(){
        return this.routNumber;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public String getDestination(){
        return destination;
    }

    public String toString(){
        return "Platform ={platformId : "+platFormId+"platFormNumber : "+platformNumber+"RoutNumber : "+routNumber+"Rout : "+rout


        '}';
    }
}

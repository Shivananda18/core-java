package com.xworkz.fortisapp.bar;

import com.xworkz.fortisapp.bar.alcohal.Alcohol;

public class Bar {

 Alcohol[]  alcohols = new Alcohol[17];
int index;
public boolean addAlcohal(Alcohol alcohols){
    boolean isAdded=false;

    boolean isAlcoholValid=false;
    boolean isAlcohalNameValid=false;
    boolean isalcoholsAromaValid=false;
    boolean isAppearenceValid=false;
    boolean isPalate=false;
    boolean isFinish=false;



    int alcoholId=alcohols.getAlcoholId();
    if(alcoholId >0){
         isAlcoholValid=true;
    }else{
        System.out.println("Alcohol id invalid");
    }
    String alcoholName=alcohols.getAlcoholName();
    if(alcoholName !=null && !alcoholName.isEmpty()){
        isAlcohalNameValid=true;
    }
    else{
        System.out.println("alcohol_Name is inValid ");
    }
    String alcoholsAroma=alcohols.getAroma();

    if(alcoholsAroma !=null && !alcoholsAroma.isEmpty()){
        isalcoholsAromaValid=true;
    }else{
        System.out.println("alcohol Aroma invalid ");
    }
    if(alcohols.getAppearance() !=null){
        isAppearenceValid=true;
    }else{
        System.out.println("appearance invalid");
    }

    if( alcohols.getPalate() !=null && !alcohols.getPalate().isEmpty()){
        isPalate=true;
    }else{
        System.out.println("Palete invalid");
    }
    if(alcohols.getFinish() !=null && !alcohols.getFinish().isEmpty()){
        isFinish=true;
    }else{
        System.out.println("finish invalid ");
    }

    if(isAlcohalNameValid && isAlcoholValid && isalcoholsAromaValid && isPalate  && isFinish && isalcoholsAromaValid){
        this.alcohols[index++]=alcohols;
        isAdded=true;
    }else {
        System.out.println("alcohol not added ");
    }
    return isAdded;
}

public boolean getAllAlcohol(){

    for(Alcohol alcohol : alcohols){
        System.out.println("alcohol : "+alcohol);
    }
    return false ;
}
}

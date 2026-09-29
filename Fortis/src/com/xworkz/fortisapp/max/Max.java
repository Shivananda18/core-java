package com.xworkz.fortisapp.max;

import com.xworkz.fortisapp.max.cloth.Cloth;

public class Max {

    private Cloth[] clothes = new Cloth[24];
int index;
    public boolean addClothes(Cloth cloth) {

        boolean isClothesAdded = false;
        boolean isClothIdValid = false;
        boolean isClothSizeValid = false;
        boolean isbrandAvailable=false;
        boolean isGenderValid=false;
        boolean isCountryOFOriginValid=false;
        boolean isDesignAvailable=false;

        if (cloth.getClothId() > 0) {
            isClothIdValid = true;
        }
        if (cloth.getSize() > 0) {
            isClothSizeValid = true;
        }
        if(cloth.getBrand() !=null && !cloth.getBrand().isEmpty()){
            isbrandAvailable=true;
        }
        if(cloth.getDiscount() !=null && !cloth.getDiscount().isEmpty()){

        }
        if(cloth.getGender() !=null && !cloth.getGender().isEmpty()){
            isGenderValid=true;
        }
        if(cloth.getCountryOfOrigin()!=null && !cloth.getCountryOfOrigin().isEmpty()){
            isCountryOFOriginValid=true;
        }else{
            System.out.println("Country OF Origin inValid");
        }
        if(cloth.getDesign() !=null && !cloth.getDesign().isEmpty() ){
            isDesignAvailable=true;
        }

        if(isClothIdValid && isClothSizeValid && isbrandAvailable && isGenderValid && isCountryOFOriginValid && isDesignAvailable){
            this.clothes[index++]=cloth;
            isClothesAdded=true;
        }
        return isClothesAdded;
    }
    public void getAllClothes(){

        for(Cloth cloth:clothes){
            System.out.println(cloth);
        }
    }
}


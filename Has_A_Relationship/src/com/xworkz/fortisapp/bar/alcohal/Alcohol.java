package com.xworkz.fortisapp.bar.alcohal;

public class Alcohol {

    private int alcoholId;
    private String alcoholName;
    private String aroma;
    private String appearance;
    private String palate;
    private String finish;



    public void  setAlcoholId(int   alcoholId){
        this.alcoholId = alcoholId;
    }
    public int getAlcoholId(){
        return this.alcoholId;
    }
    public void setAlcoholName(String alcoholName){
        this.alcoholName =alcoholName;
    }
    public String getAlcoholName(){
        return this.alcoholName;
    }
    public void setAroma(String aroma){
        this.aroma=aroma;
    }
    public String getAroma(){
        return this.aroma;
    }
    public void setAppearance(String appearance){
        this.appearance =appearance;
    }
    public String getAppearance(){
        return  this.appearance;
    }
    public void setPalate(String palate){
        this.palate=palate;
    }
    public String getPalate(){
        return this.palate;
    }
    public void setFinish(String finish){
        this.finish=finish;
    }
    public String getFinish() {
        return this.finish;
    }

    @Override
    public String toString(){
        return "Alcohol = {Alcohol_ID : "+this.alcoholId+
                " alcoholName : "+
                this.alcoholName+" aroma  : "+
                this.aroma+" appearance : "+
                this.appearance+"Palate :"+
                this.palate+"Finish  : "+
                this.finish;
    }
}

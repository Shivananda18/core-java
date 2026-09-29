package com.xworkz;

import com.xworkz.commercialbuilding.*;

public class CommercialBuildingRunner {
    public static void main(String[] args) {


        //abstraction
        CommercialBuilding commercialBuilding=new HariSuperSandWich();//implementation
        double hari=commercialBuilding.doBusiness();
        System.out.println(hari);

        CommercialBuilding commercialBuilding1=new Xworkz();
        commercialBuilding1.doBusiness();

        CommercialBuilding commercialBuilding2=new PanShop();
        commercialBuilding2.doBusiness();

        CommercialBuilding commercialBuilding3=new WatchShop();
        commercialBuilding3.doBusiness();

        CommercialBuilding commercialBuilding4=new ToyShop();
        commercialBuilding4.doBusiness();
}
}


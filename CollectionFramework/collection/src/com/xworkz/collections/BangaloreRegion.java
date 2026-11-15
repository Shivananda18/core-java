package com.xworkz.collections;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BangaloreRegion {

    public static void main(String[] args) {

        List<String> bangaloreRuralRegion=new ArrayList();
        bangaloreRuralRegion.add("Devanahalli");
        bangaloreRuralRegion.add("Doddaballapura");
        bangaloreRuralRegion.add("hoskote");
        System.out.println("bangaloreRuralRegion : "+bangaloreRuralRegion);
        System.out.println(bangaloreRuralRegion.get(0));
        bangaloreRuralRegion.add(0,"Davanagere");
        System.out.println(bangaloreRuralRegion);

        List<String> bangaloreUrbanRegion=new ArrayList();
        bangaloreUrbanRegion.add("Anekal");
        bangaloreUrbanRegion.add("Yalahanka");
        bangaloreUrbanRegion.add("whiteField");
        System.out.println("bangaloreUrbanRegion : "+bangaloreUrbanRegion);
        System.out.println(bangaloreUrbanRegion.get(2));


        Collection bangaloreEstRegion=new ArrayList();
        bangaloreEstRegion.add("Indiranagar");
        bangaloreEstRegion.add("marathahalli");
        bangaloreEstRegion.add("mahadevapura");
        bangaloreEstRegion.add("RajajiNagar");
        System.out.println("bangaloreEstRegion :" +bangaloreEstRegion);


        Collection bangaloreWestRegion=new ArrayList();
        bangaloreWestRegion.add("RajajiNagar");
        bangaloreWestRegion.add("vijayanagar");
        bangaloreWestRegion.add("malleshwaram");
        bangaloreWestRegion.add("mahadevapura");
        System.out.println("bangaloreWestRegion : "+bangaloreWestRegion);
        bangaloreEstRegion.retainAll(bangaloreWestRegion);
        System.out.println(bangaloreEstRegion);

/*

        System.out.println(bangaloreRegion.size());
        bangaloreRegion.removeAll(bangaloreEstRegion);
        System.out.println(bangaloreRegion.size());
        System.out.println("bangaloreRegion : "+bangaloreRegion);
        System.out.println(bangaloreRegion.size());
        System.out.println(bangaloreRegion.retainAll(bangaloreNorthRegion));
        System.out.println(bangaloreRegion);

        /*

        System.out.println("no of Bangalore region size : "+bangaloreRegion.size());
        System.out.println(" Bangalore region is added using addAll method :  "+bangaloreRegion.addAll(bangaloreRegion));

        System.out.println("remove bangaloreEst Region : "+bangaloreEstRegion.remove("Indiranagar"));//remove or delete single object
        System.out.println("bangaloreEstRegion : "+bangaloreEstRegion);

        System.out.println("remove all bangaloreEst Region : "+bangaloreEstRegion.removeAll(bangaloreEstRegion));
        System.out.println("remove all bangaloreEst Region : "+bangaloreEstRegion);//removeAll delete that particular Collection

        System.out.println("bangaloreRegion contains : "+bangaloreEstRegion.contains("Indiranagar"));
        System.out.println("bangaloreRegion contains bangaloreUrbanRegion : "+bangaloreRegion.containsAll(bangaloreUrbanRegion));

        System.out.println("bangaloreRuralRegion equals bangaloreUrbanRegion : "+bangaloreRuralRegion.equals(bangaloreUrbanRegion));

        System.out.println(bangaloreRegion.hashCode());
        System.out.println(bangaloreEstRegion.hashCode());
        System.out.println(bangaloreUrbanRegion.hashCode());


        System.out.println("bangaloreRegion is empty : "+bangaloreRegion.isEmpty());

        System.out.println("bangaloreRegion iterator : "+bangaloreRegion.iterator());

        System.out.println(bangaloreRegion);
        System.out.println(bangaloreRegion.size());


       */
    }
}

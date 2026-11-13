package com.xworkz.collections.cities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BangaloreCitiesRunner {

    public static void main(String[] args) {

        Collection  bangaloreAreas=new ArrayList();

        bangaloreAreas.add("Rajaji NAgar");
        bangaloreAreas.add("malleshwaram");
        bangaloreAreas.add("vijayangar");
        bangaloreAreas.add("Yashwantpura");
        bangaloreAreas.add("Indiranagar");
        bangaloreAreas.add("Basavangudi");
        bangaloreAreas.add("jayanagar");
        bangaloreAreas.add("Jp nagar");
        bangaloreAreas.add("nandini layout");
        bangaloreAreas.add("Btm layout");
        bangaloreAreas.add("Whitefield");
        bangaloreAreas.add("raja rajeshwarinagar");
        bangaloreAreas.add("Electronic city");
        bangaloreAreas.add("Hebbal");
        bangaloreAreas.add("kengri");
        bangaloreAreas.add("yelahanka");
        bangaloreAreas.add("peenya");
        bangaloreAreas.add("Jalihalli");
        bangaloreAreas.add("HSR layout");
        bangaloreAreas.add("Bommanahalli");
        bangaloreAreas.add("Kr puram");
        bangaloreAreas.add("marathahalli");
        bangaloreAreas.add("Koramangala");
        bangaloreAreas.add("Mysore road");
        bangaloreAreas.add("Banashankari");
        bangaloreAreas.add("Nagarbhavi");

        Collection bangaloreRegion=new ArrayList();
        System.out.println(bangaloreAreas.containsAll(bangaloreRegion));

        System.out.println(bangaloreRegion.addAll(bangaloreAreas));
        System.out.println(bangaloreAreas.remove("Koramangala"));
        System.out.println(bangaloreAreas);
        System.out.println("bangaloreRegion.retainAll : "+bangaloreRegion.retainAll(bangaloreAreas));
        System.out.println(bangaloreAreas);
        System.out.println("bangaloreRegion.removeAll : "+bangaloreRegion.removeAll(bangaloreAreas));

        System.out.println(bangaloreAreas.size());

        System.out.println(bangaloreAreas.remove("Nagarbhavi"));
        System.out.println(bangaloreAreas);

        System.out.println(bangaloreRegion.removeAll(bangaloreAreas));
        System.out.println(bangaloreRegion);

        System.out.println("bangaloreAreas contains : "+bangaloreAreas.contains("Whitefield"));
        System.out.println(bangaloreRegion.containsAll(bangaloreAreas));

        System.out.println(bangaloreAreas.isEmpty());
        System.out.println("bangaloreRegion : "+bangaloreRegion);
        System.out.println("bangaloreAreas : "+bangaloreAreas);
        System.out.println(bangaloreAreas.retainAll(bangaloreRegion));
        System.out.println("bangaloreAreas : "+bangaloreAreas);
        System.out.println("bangaloreRegion : "+bangaloreRegion);


    }
}

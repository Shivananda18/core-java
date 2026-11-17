package com.xworkz.collections;

import java.util.*;

public class EarthRunner {

    public static void main(String[] args) {


        List southAsia=new ArrayList();
        southAsia.add("India");
        southAsia.add("Pakistan");
        southAsia.add("Afaghanistan");
        southAsia.add("nepal");
        southAsia.add("bangladesh");
        southAsia.add("iran");
        southAsia.add("Bhutan");
        southAsia.add("malvadis");
        southAsia.add("shrilaka");


        Collection estasia=new ArrayList();
        estasia.add("china");
        estasia.add("India");
        estasia.add("japan");
        estasia.add("south_korea");
        estasia.add("North_korea");
        estasia.add("Mangolia");
        estasia.add("Taiwan");



        Collection southeaEstAsia=new PriorityQueue();
        southeaEstAsia.add("Indonesia");
        southeaEstAsia.add("vietnam");
        southeaEstAsia.add("thailand");
        southeaEstAsia.add("philippines");
        southeaEstAsia.add("malaysia");
        southeaEstAsia.add("singapore");
        southeaEstAsia.add("myanmar");
        southeaEstAsia.add("cambodia");
        southeaEstAsia.add("Laos");
        southeaEstAsia.add("Brunei");
        southeaEstAsia.add("timor-leste");


        Collection centralAsia=new TreeSet<>();
        centralAsia.add("kazakhisan");
        centralAsia.add("uzbekistan");
        centralAsia.add("tukmenistan");
        centralAsia.add("kyrgyzstan");
        centralAsia.add("tajikistan");



        Collection northernAmerica = new ArrayList();
        northernAmerica.add("United States");
        northernAmerica.add("Canada");
        northernAmerica.add("Greenland");
        northernAmerica.add("Bermuda");


        Collection centralAmerica = new ArrayList();
        centralAmerica.add("Mexico");
        centralAmerica.add("Guatemala");
        centralAmerica.add("Belize");
        centralAmerica.add("El Salvador");
        centralAmerica.add("Honduras");
        centralAmerica.add("Nicaragua");
        centralAmerica.add("Costa Rica");
        centralAmerica.add("Panama");


       Collection southAmerica = new PriorityQueue();
        southAmerica.add("Brazil");
        southAmerica.add("Argentina");
        southAmerica.add("Colombia");
        southAmerica.add("Peru");
        southAmerica.add("Venezuela");
        southAmerica.add("Chile");
        southAmerica.add("Ecuador");
        southAmerica.add("Bolivia");
        southAmerica.add("Paraguay");
        southAmerica.add("Uruguay");
        southAmerica.add("Guyana");
        southAmerica.add("Suriname");


      Collection caribbean = new TreeSet();
        caribbean.add("Cuba");
        caribbean.add("Jamaica");
        caribbean.add("Haiti");
        caribbean.add("Dominican Republic");
        caribbean.add("Puerto Rico");
        caribbean.add("Bahamas");
        caribbean.add("Trinidad and Tobago");
        caribbean.add("Barbados");
        caribbean.add("Saint Lucia");
        caribbean.add("Grenada");
        caribbean.add("Antigua and Barbuda");


        Collection westernEurope = new ArrayList();
        westernEurope.add("France");
        westernEurope.add("Germany");
        westernEurope.add("Netherlands");
        westernEurope.add("Belgium");
        westernEurope.add("Austria");
        westernEurope.add("Switzerland");
        westernEurope.add("Luxembourg");
        westernEurope.add("Monaco");
        westernEurope.add("Liechtenstein");


        Collection northernEurope = new HashSet();
        northernEurope.add("United Kingdom");
        northernEurope.add("Ireland");
        northernEurope.add("Sweden");
        northernEurope.add("Norway");
        northernEurope.add("Denmark");
        northernEurope.add("Finland");
        northernEurope.add("Iceland");
        northernEurope.add("Estonia");
        northernEurope.add("Latvia");
        northernEurope.add("Lithuania");


        Collection southernEurope = new PriorityQueue();
        southernEurope.add("Italy");
        southernEurope.add("Spain");
        southernEurope.add("Portugal");
        southernEurope.add("Greece");
        southernEurope.add("Croatia");
        southernEurope.add("Serbia");
        southernEurope.add("Bosnia and Herzegovina");
        southernEurope.add("Albania");
        southernEurope.add("North Macedonia");
        southernEurope.add("Montenegro");
        southernEurope.add("Slovenia");
        southernEurope.add("Malta");
        southernEurope.add("San Marino");
        southernEurope.add("Vatican City");


        Collection easternEurope = new TreeSet();
        easternEurope.add("Russia");
        easternEurope.add("Ukraine");
        easternEurope.add("Poland");
        easternEurope.add("Romania");
        easternEurope.add("Czechia");
        easternEurope.add("Hungary");
        easternEurope.add("Belarus");
        easternEurope.add("Bulgaria");
        easternEurope.add("Slovakia");
        easternEurope.add("Moldova");


        Collection northernAfrica = new ArrayList();
        northernAfrica.add("Egypt");
        northernAfrica.add("Libya");
        northernAfrica.add("Tunisia");
        northernAfrica.add("Algeria");
        northernAfrica.add("Morocco");
        northernAfrica.add("Sudan");


        Collection westernAfrica = new ArrayList();
        westernAfrica.add("Nigeria");
        westernAfrica.add("Ghana");
        westernAfrica.add("Senegal");
        westernAfrica.add("Ivory Coast");
        westernAfrica.add("Niger");
        westernAfrica.add("Mali");
        westernAfrica.add("Burkina Faso");
        westernAfrica.add("Guinea");
        westernAfrica.add("Benin");
        westernAfrica.add("Togo");
        westernAfrica.add("Sierra Leone");
        westernAfrica.add("Liberia");
        westernAfrica.add("Mauritania");
        westernAfrica.add("Gambia");
        westernAfrica.add("Guinea-Bissau");
        westernAfrica.add("Cape Verde");


        Collection easternAfrica = new PriorityQueue();
        easternAfrica.add("Kenya");
        easternAfrica.add("Ethiopia");
        easternAfrica.add("Tanzania");
        easternAfrica.add("Uganda");
        easternAfrica.add("Somalia");
        easternAfrica.add("Zimbabwe");
        easternAfrica.add("Zambia");
        easternAfrica.add("Mozambique");
        easternAfrica.add("Madagascar");
        easternAfrica.add("Malawi");
        easternAfrica.add("Rwanda");
        easternAfrica.add("Burundi");
        easternAfrica.add("South Sudan");
        easternAfrica.add("Eritrea");
        easternAfrica.add("Djibouti");
        easternAfrica.add("Mauritius");
        easternAfrica.add("Comoros");
        easternAfrica.add("Seychelles");



        Collection centralAfrica = new TreeSet();
        centralAfrica.add("Democratic Republic of the Congo");
        centralAfrica.add("Angola");
        centralAfrica.add("Central African Republic");
        centralAfrica.add("Chad");
        centralAfrica.add("Republic of the Congo");
        centralAfrica.add("Gabon");
        centralAfrica.add("Equatorial Guinea");
        centralAfrica.add("Sao Tome and Principe");


        Collection southernAfrica = new LinkedList();
        southernAfrica.add("South Africa");
        southernAfrica.add("Namibia");
        southernAfrica.add("Botswana");
        southernAfrica.add("Lesotho");
        southernAfrica.add("Eswatini");


        Collection australasia = new ArrayList();
        australasia.add("Australia");
        australasia.add("New Zealand");


        Collection melanesia = new ArrayList();
        melanesia.add("Papua New Guinea");
        melanesia.add("Fiji");
        melanesia.add("Solomon Islands");
        melanesia.add("Vanuatu");


        Collection micronesia = new PriorityQueue<>();
        micronesia.add("Federated States of Micronesia");
        micronesia.add("Palau");
        micronesia.add("Marshall Islands");
        micronesia.add("Kiribati");
        micronesia.add("Nauru");


        Collection polynesia = new TreeSet();
        polynesia.add("Samoa");
        polynesia.add("Tonga");
        polynesia.add("Tuvalu");
        polynesia.add("Cook Islands");
        polynesia.add("Niue");


        Collection asia=new ArrayList();
        asia.addAll(southAsia);
        asia.addAll(estasia);
        asia.addAll(southeaEstAsia);
        asia.addAll(centralAsia);
        System.out.println("Asia : "+asia);

        Collection america=new ArrayList();
        america.addAll(northernAmerica);
        america.addAll(southAmerica);
        america.addAll(centralAmerica);
        america.addAll(caribbean);
        System.out.println("America : "+america);

        Collection europe=new ArrayList();
        europe.addAll(northernEurope);
        europe.addAll(southernEurope);
        europe.addAll(westernEurope);
        europe.addAll(easternEurope);
        System.out.println("Europe : "+europe);


        Collection africa=new ArrayList();
        africa.addAll(northernAfrica);
        africa.addAll(southernAfrica);
        africa.addAll(westernAfrica);
        africa.addAll(centralAfrica);
        System.out.println("Africa  : "+africa);


        Collection oceania=new ArrayList();
        oceania.addAll(australasia);
        oceania.addAll(polynesia);
        oceania.addAll(micronesia);
        oceania.addAll(melanesia);
        System.out.println("Oceania : "+oceania);

        System.out.println(oceania.removeAll(australasia));
      //  System.out.println(oceania);

        System.out.println(oceania.size());

        Collection earth=new ArrayList();
        earth.addAll(oceania);
        earth.addAll(africa);
        earth.addAll(asia);
        earth.addAll(europe);
        earth.addAll(america);
        System.out.println(earth);
        earth.removeAll(oceania);
        System.out.println(earth);


        estasia.retainAll(southAsia);
        System.out.println(estasia);
    }
}

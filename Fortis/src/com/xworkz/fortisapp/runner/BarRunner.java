package com.xworkz.fortisapp.runner;

import com.xworkz.fortisapp.bar.Bar;
import com.xworkz.fortisapp.bar.alcohal.Alcohol;

public class BarRunner {

    public static void main(String[] args) {

        Bar bar=new Bar();


        Alcohol alcohol=new Alcohol();
        alcohol.setAlcoholId(1);
        alcohol.setAlcoholName("Johnnie Walker");
        alcohol.setAroma("Sweetness wrapped in smoke. A hint of pepper.");
        alcohol.setAppearance("Deep golden, with darker depths.");
        alcohol.setPalate("Sweet vanilla and creamy toffee.");
        alcohol.setFinish("Sweet fruit and smoky peat with mixed peels.");

        bar.addAlcohal(alcohol);

        Alcohol alcohol1=new Alcohol();
        alcohol1.setAlcoholId(2);
        alcohol1.setAlcoholName("Smirnoff Green Apple Vodka");
        alcohol1.setAroma("Fresh green apple notes with a hint of tart brightness.");
        alcohol1.setAppearance("Clear liquid.");
        alcohol1.setPalate("Crisp apple tang layered with gentle sweetness and smooth vodka character.");
        alcohol1.setFinish("Bright and clean with a refreshing fruity after taste.");
        bar.addAlcohal(alcohol1);

        Alcohol alcohol3=new Alcohol();
        alcohol3.setAlcoholId(3);
        alcohol3.setAlcoholName("Tequila Don Julio Resposado");
        alcohol3.setAroma("A mellow, elegant flavour and aroma.");
        alcohol3.setAppearance("Golden amber.");
        alcohol3.setPalate("Hints of orange, apple, chocolate and vanilla.");
        alcohol3.setFinish("Rich, smooth finish.");

        bar.addAlcohal(alcohol3);

        Alcohol alcohol4=new Alcohol();
        alcohol4.setAlcoholId(4);
        alcohol4.setAlcoholName("Antiquity Blue Whisky");
        alcohol4.setAroma("A light yet complex aroma with hints of vanilla, chocolate, and gentle oak. The nose opens with a malty sweetness and subtle spice, layered with delicate notes of dried fruit and honey.");
        alcohol4.setAppearance("Right from the blue bottle to the golden yellow, semi-transparent liquid inside, Antiquity Blue is all about elegance. The whisky’s rich colour, inspired by the hue of antique gold, is supplemented by tasting notes that are malty, slightly woody and fruity, with a moderate body and smooth effect. Radiant deep golden hue — reminiscent of antique gold — with a rich, semi-transparent clarity that exudes sophistication.");
        alcohol4.setPalate("Smooth and rounded with a moderate body. Opens with malty and woody notes, followed by subtle smokiness and hints of fruit and vanilla. The balanced sweetness and gentle spice make it both elegant and versatile.");
        alcohol4.setFinish("Clean, slightly astringent, and lingering with malty warmth and woody undertones. The final impression is one of mellow smoothness with a touch of sweetness and spice that invites another sip");

        bar.addAlcohal(alcohol4);


        Alcohol alcohol5=new Alcohol();
        alcohol5.setAlcoholId(5);
        alcohol5.setAlcoholName("Talisker 10 Year Old Single Malt Scotch");
        alcohol5.setAroma("Whiffs of warm peat and coastal air.");
        alcohol5.setAppearance("A warm, golden colour.");
        alcohol5.setPalate("Rich, powerful peat-smoke flavour.");
        alcohol5.setFinish("Long finish, with a peppery taste at the back of the mouth.");

        bar.addAlcohal(alcohol5);

        Alcohol alcohol6=new Alcohol();
        alcohol6.setAlcoholId(6);
        alcohol6.setAlcoholName("Baileys Original");
        alcohol6.setAroma("A complex chocolate aroma with hints of exotic vanilla and the soft aroma of Irish Whiskey.");
        alcohol6.setAppearance("te aroma with hints of exotic vanilla and the ");
        alcohol6.setPalate("Silky smooth mouth feel from the fresh cream and a warming sensation coming from the Irish whiskey.");
        alcohol6.setFinish("Creamy chocolaty finish.");

        bar.addAlcohal(alcohol6);

        Alcohol alcohol7=new Alcohol();
        alcohol7.setAlcoholId(7);
        alcohol7.setAlcoholName("Johnnie Walker Black Label Blended Scotch Whisky");
        alcohol7.setAroma("Sweetness wrapped in smoke. A hint of pepper.");
        alcohol7.setAppearance("Deep golden, with darker depths.");
        alcohol7.setPalate("Sweet vanilla and creamy toffee.");
        alcohol7.setFinish("Sweet fruit and smoky peat with mixed peels.");

        bar.addAlcohal(alcohol7);

        Alcohol alcohol8=new Alcohol();
        alcohol8.setAlcoholId(8);
        alcohol8.setAlcoholName("Ketel One Vodka");
        alcohol8.setAroma("A fresh nose with hints of citrus and honey.");
        alcohol8.setAppearance("Crystal clear, which reminds you of its quality.");
        alcohol8.setPalate("A crisp taste with a lively tingle.");
        alcohol8.setFinish("Silky smooth and soft with a long finish of subtle flavours.");

        bar.addAlcohal(alcohol8);

        Alcohol alcohol9=new Alcohol();
        alcohol9.setAlcoholId(9);
        alcohol9.setAlcoholName("Johnnie Walker Gold Label Reserve Blended Scotch Whisky");
        alcohol9.setAroma("Sweeter with notes of honey and caramel, with a hint of fresh banana.");
        alcohol9.setAppearance("A rich golden glow.");
        alcohol9.setPalate("Vibrant and tropical fruit with smooth, creamy vanilla.");
        alcohol9.setFinish("A lingering sweet, smoky finish.");

        bar.addAlcohal(alcohol9);


        Alcohol alcohol10=new Alcohol();
        alcohol10.setAlcoholId(10);
        alcohol10.setAlcoholName("Ketel One Vodka");
        alcohol10.setAroma("A fresh nose with hints of citrus and honey.");
        alcohol10.setAppearance("Crystal clear, which reminds you of its quality.");
        alcohol10.setPalate("A crisp taste with a lively tingle.");
        alcohol10.setFinish("Silky smooth and soft with a long finish of subtle flavours.");

        bar.addAlcohal(alcohol10);

        Alcohol alcohol11=new Alcohol();
        alcohol11.setAlcoholId(11);
        alcohol11.setAlcoholName("Tequila Don Julio Añejo");
        alcohol11.setAroma("Wonderfully complex with expressions of vanilla and oaky butterscotch notes.");
        alcohol11.setAppearance("Clean, pale yellow.");
        alcohol11.setPalate("Bright and lightly spiced finish with the essence of wild honey in the back for a rewarding long finale.");
        alcohol11.setFinish("Light spice in the finish.");

        bar.addAlcohal(alcohol11);

        Alcohol alcohol12=new Alcohol();
        alcohol12.setAlcoholId(12);
        alcohol12.setAlcoholName("Smirnoff Mirchi Mango Vodka");
        alcohol12.setAroma("Ripe mango fruitiness with a subtle hint of warming spice");
        alcohol12.setAppearance("Yellow colour liquid.");
        alcohol12.setPalate("Rich mango sweetness upfront followed by a soft, warming chilli tingle that adds depth.");
        alcohol12.setFinish("Smooth and mildly spicy with a pleasant fruity aftertaste.");

        bar.addAlcohal(alcohol12);

        Alcohol alcohol13=new Alcohol();
        alcohol13.setAlcoholId(13);
        alcohol13.setAlcoholName("Smirnoff Minty Jamun Vodka");
        alcohol13.setAroma("Ripe dark berry notes layered with a fresh mint lift.");
        alcohol13.setAppearance("Pinkish-purple liquid.");
        alcohol13.setPalate("Smooth and fruity with juicy jamun sweetness balanced by a cooling mint freshness.");
        alcohol13.setFinish("Clean and refreshing with a lightly lingering berry note.");

        bar.addAlcohal(alcohol13);

        Alcohol alcohol14=new Alcohol();
        alcohol14.setAlcoholId(14);
        alcohol14.setAlcoholName("Tanqueray Malacca Gin");
        alcohol14.setAroma("Soft citrus layered with delicate florals and a hint of warm spice.");
        alcohol14.setAppearance("Crystal clear, reflecting its four-times distilled purity.");
        alcohol14.setPalate("A smoother, sweeter profile with notes of grapefruit, lime, and gentle spice, creating a rounded, exotic character.");
        alcohol14.setFinish("Silky and lingering, with subtle spice and a refined citrus warmth.");

        bar.addAlcohal(alcohol14);

        Alcohol alcohol16=new Alcohol();
        alcohol16.setAlcoholId(16);
        alcohol16.setAlcoholName("Tequila Don Julio Resposado");
        alcohol16.setAroma("A mellow, elegant flavour and aroma.");
        alcohol16.setAppearance("Golden amber.");
        alcohol16.setPalate("Hints of orange, apple, chocolate and vanilla.");
        alcohol16.setFinish("Rich, smooth finish.");

        bar.addAlcohal(alcohol16);

        Alcohol alcohol17=new Alcohol();
        alcohol17.setAlcoholId(17);
        alcohol17.setAlcoholName("Don Julio Blanco Tequila");
        alcohol17.setAroma("The classic tequila aroma: savoury, sage, and citrus.");
        alcohol17.setAppearance("Crystal clear. A high quality white tequila.");
        alcohol17.setPalate("Refreshing sweet start, with citrus notes.");
        alcohol17.setFinish("Smooth finish with freshly-ground black pepper notes.");

        bar.addAlcohal(alcohol17);

        Alcohol alcohol18=new Alcohol();
        alcohol18.setAlcoholId(18);
        alcohol18.setAlcoholName("Tequila Don Julio 1942");
        alcohol18.setAroma("Rich caramel, chocolate, roasted agave.");
        alcohol18.setAppearance("Warm amber with golden hues.");
        alcohol18.setPalate("Warm oak, silky caramel and vanilla.");
        alcohol18.setFinish("A lingering oak and rich vanilla finish");

        bar.addAlcohal(alcohol18);

        System.out.println(  "getallAlcohol : "+bar.getAllAlcohol());


    }
}

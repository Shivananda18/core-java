package com.xworkz;

import com.xworkz.card.Card;
import com.xworkz.card.cardbank.AxisBank;
import com.xworkz.card.cardbank.PNBBank;
import com.xworkz.card.cardbank.SbiBank;

public class CardRunner {

    public static void main(String[] args) {


        Card axisBank = new SbiBank();
        axisBank.insert();
        axisBank.helpPeople();

        Card pnbBank=new PNBBank();
        pnbBank.insert();
        pnbBank.helpPeople();
      //  pnbBank.CreditAmount();
    }
}

package com.xworkz.card.cardbank;

import com.xworkz.card.Card;

public class CardRunner {

    public static void main(String[] args) {

        Card pnbBank=new PNBBank();
        pnbBank.insert();
        pnbBank.helpPeople();
        pnbBank.creditAmount();

        Card sbi=new SbiBank();
        sbi.insert();
        sbi.helpPeople();
        sbi.creditAmount();

        Card bankOfBaroda=new BankOfBaroda();
        bankOfBaroda.insert();
        bankOfBaroda.helpPeople();
        bankOfBaroda.creditAmount();



    }
}

package com.xworkz.equalsmethodapp.vollyball;

public class VollyBallRunner {
    public static void main(String[] args) {

        VollyBall vollyBall=new VollyBall();
        vollyBall.ballName="Navia";
        vollyBall.material="Nova Soft PU";
        vollyBall.ageRange="youth";
        vollyBall.itemWeight="280 grams";
        vollyBall.color="Yellow/Blue";
        vollyBall.price=800;

        VollyBall vollyBall1=new VollyBall();
        vollyBall1.ballName="Navia";
        vollyBall1.material="Nova Soft PU";
        vollyBall1.ageRange="youth";
        vollyBall1.itemWeight="280 grams";
        vollyBall1.color="Yellow/Blue";
        vollyBall1.price=800;

        System.out.println("vollyBall and Vollyball1 are equal : "+vollyBall.equals(vollyBall1));
        System.out.println("hash vlaue of hash value : "+vollyBall.hashCode());
    }
}

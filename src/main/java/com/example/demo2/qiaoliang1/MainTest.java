package com.example.demo2.qiaoliang1;

public class MainTest {
    public static void main(String[] args) {
        House house = new House();
        HouseCorp houseCorp;
        houseCorp = new HouseCorp(house);
       // Corp corp = new Corp(houseCorp) ;
        houseCorp.makeMoney();
        System.out.println("\n");
        Clothes clothes = new Clothes();
        houseCorp = new HouseCorp(clothes);
        houseCorp.makeMoney();

    }
}

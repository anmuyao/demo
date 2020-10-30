package com.example.demo2.qiaoliang;

public class MianTest {
    public static void main(String[] args) {
        Corp corp ;
        corp = new ClothesCorp();
        corp.makeMoney();
        System.out.println("\n");
        corp = new HouseCorp();
        corp.makeMoney();

    }
}

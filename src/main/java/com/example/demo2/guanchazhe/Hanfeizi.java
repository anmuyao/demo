package com.example.demo2.guanchazhe;

public class Hanfeizi implements IhanFeiZi {
    private ILiSi iLiSi = new Lisi();
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.iLiSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.iLiSi.update("韩非子在娱乐");
    }
}

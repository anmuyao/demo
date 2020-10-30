package com.example.demo2.guanchazhe2;

public class MainTest {

    public static void main(String[] args) {
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
       // Observer liuSi = new LiuSi();
        HanFeiZiNew hanFeiZi = new HanFeiZiNew();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.deleteObserver(wangSi);
   //     hanFeiZi.addObserver(liuSi);
        hanFeiZi.haveBreakfast();


    }
}

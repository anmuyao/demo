package com.example.demo2.danli.d1;

import com.example.demo2.danli.Singleton;

public class BaoHan {
    private static final BaoHan instanll = new BaoHan();

    private BaoHan(){}

    public static BaoHan getInstanll() {
        return instanll;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
          //  new Thread()->{ System.out.println(BaoHan.getInstanll());};
         new Thread(){
                    @Override
                    public void run() {
                        System.out.println(BaoHan.getInstanll());
                    }
                }.start();
        }

    }

}


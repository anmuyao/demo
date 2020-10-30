package com.example.demo2.danli.dd2;

import com.example.demo2.danli.Singleton;

public class Ehan {

    private static Ehan instanll ;

    private Ehan(){};

    public static Ehan getInstanll(){
        if(instanll == null){
            instanll = new Ehan();
        }
        return instanll;
    }

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i = 0; i < 20; i++) {

                    System.out.println(new Thread().getName() +"+"+Ehan.getInstanll());
                }
            }
        }.start();
    }

}

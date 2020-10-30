package com.example.demo2.danli.d3;

public class Singleton {
    private static volatile Singleton instanll ;

    private Singleton(){}

    public static Singleton getInstanll() {
        if(instanll == null) {
            synchronized (Singleton.class) {
                if (instanll == null) {
                    instanll = new Singleton();
                }

            }
        }

        return instanll;
    }

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Singleton.getInstanll());

                }
            }
        }.start();

    }
}

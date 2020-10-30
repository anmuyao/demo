package com.example.demo2.moban;

public class MainTest {
    private static int i;
    public static void main(String[] args) {
        i= 1;
        Moban moban ;
        Bmw bwm = new Bmw();
        bwm.setAlarm(true);
        bwm.run();

        System.out.println("------------------------------");
        BenC benC = new BenC();
        benC.setAlarm(true);
        benC = new BenC();
        benC.run();

    }
}

package com.example.demo2.moban;

public class BenC extends Moban {
    @Override
    public void start() {
        System.out.println("我是奔驰哦，我要开始发动了！");
    }

    @Override
    public void stop() {
        System.out.println("我是奔驰哦，我要开始停车了！");
    }

    @Override
    public void alarm() {
        System.out.println("我是奔驰哦，我要开始按喇叭了！");
    }

    private static Boolean flag ;
    @Override
    public Boolean isAlarm() {
        return this.flag;
    }

    public void setAlarm(Boolean flag){
        this.flag = flag;
    }
}

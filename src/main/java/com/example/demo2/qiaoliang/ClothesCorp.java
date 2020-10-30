package com.example.demo2.qiaoliang;

public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }

}

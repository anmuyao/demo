package com.example.demo2.qiaoliang1;

public class House extends Product {
    @Override
    protected void beProducted() {
        System.out.println("生产出的房子是这个样子的...");
    }

    @Override
    protected void beSell() {
        System.out.println("生产出的房子卖出去了...");
    }
}

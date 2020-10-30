package com.example.demo2.qiaoliang1;


public class Clothes extends Product {
    @Override
    protected void beProducted() {
        System.out.println("生产出的衣服是这个样子的...");
    }

    @Override
    protected void beSell() {
        System.out.println("生产出的衣服卖出去了...");
    }
}

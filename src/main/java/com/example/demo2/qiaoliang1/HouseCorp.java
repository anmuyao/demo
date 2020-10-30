package com.example.demo2.qiaoliang1;

public class HouseCorp extends Corp {
    public HouseCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("公司赚大钱了...");
    }
}

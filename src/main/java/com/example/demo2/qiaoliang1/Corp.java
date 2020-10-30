package com.example.demo2.qiaoliang1;

public  class Corp {
    private Product product;
    public Corp(Product product){
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProducted();
        this.product.beSell();
    }
}

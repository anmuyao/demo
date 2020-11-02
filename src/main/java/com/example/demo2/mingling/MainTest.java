package com.example.demo2.mingling;

public class MainTest {
    public static void main(String[] args) {
       /* System.out.println("-------------客户要求增加一个需求-----------------");
        Group rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.plan();*/

        Invoker xiaoSan = new Invoker();
        System.out.println("-------------客户要求增加一项需求-----------------");
        Command command = new AddRequirementCommand();

       // Command command = new DeletePageCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}

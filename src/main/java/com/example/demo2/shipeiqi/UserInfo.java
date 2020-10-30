package com.example.demo2.shipeiqi;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("这是用户名称");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这是地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这是电话号码");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这是办公室电话");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这是职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这是我也不知道是什么");
        return null;
    }
}

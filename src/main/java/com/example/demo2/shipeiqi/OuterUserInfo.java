package com.example.demo2.shipeiqi;

import java.util.HashMap;
import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo{

    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();
    @Override
    public String getUserName() {
        System.out.println(baseInfo.get("userName"));
        return baseInfo.get("userName").toString();
    }

    @Override
    public String getHomeAddress() {
        return null;
    }

    @Override
    public String getMobileNumber() {
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}

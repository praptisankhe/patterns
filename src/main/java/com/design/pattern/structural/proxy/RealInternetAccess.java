package com.design.pattern.structural.proxy;

public class RealInternetAccess implements OfficeInternetAccess{

    String empType;
    public RealInternetAccess(String empType)
    {
        this.empType=empType;
    }
    @Override
    public void grantAccess() {
        System.out.println("Granting the access to .... "+empType);
    }
}

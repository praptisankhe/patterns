package com.design.pattern.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{
    String empType;
    RealInternetAccess realInternetAccess;
    public ProxyInternetAccess(String empType)
    {
        this.empType=empType;
    }

    @Override
    public void grantAccess() {
        if(empType.equalsIgnoreCase("Manager") || empType.equalsIgnoreCase("Admin"))
        {
            realInternetAccess=new RealInternetAccess(empType);
            realInternetAccess.grantAccess();
        }
        else {
            System.out.println("Access Denied ...."+empType);
        }
    }
}

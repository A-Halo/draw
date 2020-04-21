package com.java.structural.Proxy.Dynamic;

public class ClientClass {
    public static void main(String[] args) {
        IShowPic isp=new CRemoPic();
        CLocalPicShow cpic=new CLocalPicShow(isp);
        IShowPic localpic=(IShowPic)cpic.getProxyInstance();
        localpic.ShowPic("AAA");

        ITestInterface ipic=new CTest();
        IShowPic proxy=(IShowPic)new CLocalPicShow(ipic).getProxyInstance();
        proxy.ShowPic("AAA");
    }
}

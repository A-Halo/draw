package com.java.structural.Proxy.Static;

public class ClientClass {
    public static void main(String[] args) {
//        CLocalPicShow cls=new CLocalPicShow();?
        IShowPic cls=new CLocalPicShow();
        cls.ShowPic("photo");
    }
}

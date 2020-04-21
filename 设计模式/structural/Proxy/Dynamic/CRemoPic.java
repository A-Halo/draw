package com.java.structural.Proxy.Dynamic;

public class CRemoPic implements IShowPic {
    @Override
    public void ShowPic(String picname) {
        for (int i=0;i<3;i++){
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

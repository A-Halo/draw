package com.java.structural.Facade;

public class Light {
    private String postition;
    public Light(String postition) {
        this.postition=postition;
    }

    public void on() {
        System.out.println(this.postition+"灯打开");
    }

    public void off() {
        System.out.println(this.postition+"灯关闭");
    }
}

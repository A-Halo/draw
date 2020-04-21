package com.java.structural.Decorator;

public class Cake implements BirthdayCake {
    public Cake(){
        System.out.println("Cake blank was Creat");
    }
    @Override
    public void Show() {
        System.out.println("Cake Blank");
    }

}

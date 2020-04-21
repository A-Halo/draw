package com.java.behavioral.Observer;

public class ConcreteObserver2 implements ObserverO{
    @Override
    public void response() {
        System.out.println("目标变化。2反应");
    }
}
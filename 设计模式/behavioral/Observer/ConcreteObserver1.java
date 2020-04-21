package com.java.behavioral.Observer;

public class ConcreteObserver1 implements ObserverO{
    @Override
    public void response() {
        System.out.println("目标变化。1反应");
    }
}

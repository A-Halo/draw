package com.java.behavioral.Observer;

public class ConcreteSubjectB extends SubjectS {
    public ConcreteSubjectB() {
        super();
    }

    @Override
    public void notifyObserver() {
        System.out.println("B目标发生改变");
        for (ObserverO obs : observers) {
            obs.response();
        }
    }
}
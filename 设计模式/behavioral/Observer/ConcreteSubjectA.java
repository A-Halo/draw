package com.java.behavioral.Observer;

public class ConcreteSubjectA extends SubjectS {
    public ConcreteSubjectA(){
        super();
    }
    @Override
    public void notifyObserver() {
        System.out.println("A目标发生改变");
        for (ObserverO obs:observers){
            obs.response();
        }
    }
}

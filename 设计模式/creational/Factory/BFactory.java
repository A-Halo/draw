package com.java.creational.Factory;

public class BFactory extends Factory {
    public Fruit CreateFruit(){
        return new Banana();
    }
}

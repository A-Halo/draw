package com.java.creational.Factory;

public class AFactory extends Factory {
    public Fruit CreateFruit(){
        return new Apple();
    }
}

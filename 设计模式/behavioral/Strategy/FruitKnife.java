package com.java.behavioral.Strategy;

public class FruitKnife implements ICutFruit{
    @Override
    public void CustStrategy(String fruitname) {
        System.out.println(fruitname+"一次被切一片");
    }
}

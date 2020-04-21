package com.java.behavioral.Strategy;

public class HoriBlade implements ICutFruit {
    @Override
    public void CustStrategy(String fruitname) {
        System.out.println(fruitname+"一次被切几条");
    }
}

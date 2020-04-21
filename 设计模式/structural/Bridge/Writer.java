package com.java.structural.Bridge;

public class Writer implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+"白色的"+name+".");
    }
}

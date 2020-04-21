package com.java.behavioral.Command;

public class Operator {
    public void MarkFruit(Order order) {
        String str="";
        for (String key:order.getFruitmap().keySet()){
            str+=key+order.getFruitmap().get(key).toString();
        }
        System.out.println("混合汁"+str);
    }
}

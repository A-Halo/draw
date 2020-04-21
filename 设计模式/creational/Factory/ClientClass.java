package com.java.creational.Factory;

public class ClientClass {
    public static void main(String[] args) {
//        Factory factory=new Factory();
//        Fruit fruit=factory.CreateFruit("A");
//        fruit.eat();
        Factory factory=new BFactory();
        Fruit fruit=factory.CreateFruit();
        fruit.eat();
    }
    public String factory(String fruitname){
        if (fruitname.equals("Apple"))
            return "Apple";
        if (fruitname.equals("Banana"))
            return "Banana";
        return null;
    }
}

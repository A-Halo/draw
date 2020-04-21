package com.java.behavioral.Visitor;

public class Client {
    public static void main(String[] args) {
        IProduct b1=new Book();
        IProduct b2=new Book();
        IProduct a1=new Apple();


        BuyBasket basket=new BuyBasket();
        basket.addProduct(b1);
        basket.addProduct(b2);
        basket.addProduct(a1);

        AVisitor visitor = new Saler();
        visitor.setName("张三");
        basket.accept(visitor);
    }
}

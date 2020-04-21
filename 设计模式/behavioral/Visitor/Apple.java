package com.java.behavioral.Visitor;

public class Apple implements IProduct {
    @Override
    public void accept(AVisitor visitor) {
        visitor.visit(this);
    }
}

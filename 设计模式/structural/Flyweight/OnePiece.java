package com.java.structural.Flyweight;

public class OnePiece extends APiece {
    public OnePiece(String inkind){
        super(inkind);
    }
    @Override
    public void Play(int x, int y) {
        System.out.println("把"+inkind+"子放在("+x+","+y+")上");
    }
}

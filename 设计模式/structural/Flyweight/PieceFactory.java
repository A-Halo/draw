package com.java.structural.Flyweight;

import java.util.Hashtable;

public class PieceFactory {
    private Hashtable PiecePool=new Hashtable();
    public APiece GetPiece(String key){
        if (!PiecePool.containsKey(key)){
            APiece p=new OnePiece(key);
            PiecePool.put(key,p);
            return p;
        }
        return (APiece) PiecePool.get(key);
    }
    public int GetPieceCount(){
        return PiecePool.size();
    }
}

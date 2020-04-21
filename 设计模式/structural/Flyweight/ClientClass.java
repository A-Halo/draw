package com.java.structural.Flyweight;

import com.java.creational.singleton.Apple;
import com.java.creational.singleton.Banana;
import com.java.creational.singleton.MyFruit;
import com.java.creational.singleton.MyFruitStore;
import com.java.structural.Adapter.Adapter;
import com.java.structural.Adapter.NewJuicer;

import java.util.Random;

public class ClientClass {
    public static void main(String[] args) {
        Random rm=new Random();
        PieceFactory pFactory=new PieceFactory();
        for (int i=0;i<19;i++){
            for (int j=0;j<19;j++){
                APiece p;
                if (rm.nextInt()%2==0)
                    p=pFactory.GetPiece("白棋");
                else
                    p=pFactory.GetPiece("黑棋");
                p.Play(rm.nextInt(19),rm.nextInt(19));
            }
            System.out.println("总共棋子对象个数是："+pFactory.GetPieceCount());
        }
    }
}

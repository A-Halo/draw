package com.java.structural.Adapter;

import com.java.creational.singleton.Apple;
import com.java.creational.singleton.Banana;
import com.java.creational.singleton.MyFruit;
import com.java.creational.singleton.MyFruitStore;

public class ClientClass {
    public static void main(String[] args) {
        MyFruit fru1=new Apple();
        MyFruit fru2=new Banana();
        MyFruitStore mfs=MyFruitStore.GetFruitStore();
        mfs.Add(1,fru1);
        mfs.Add(2,fru2);
        mfs.Add(3,new Apple());
        mfs.Add(4,new Banana());
        MyFruitStore mfs2=MyFruitStore.GetFruitStore();
        MyFruit fru=(MyFruit) mfs2.Get(3);
        NewJuicer newJuicer=new Adapter();
//        System.out.println(newJuicer.newPort(mfs.Get(3),mfs.Get(4)));
    }
}

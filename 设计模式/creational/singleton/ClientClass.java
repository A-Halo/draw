package com.java.creational.singleton;

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
        fru.Display();
        System.out.println("mfs1:"+mfs.toString());
        System.out.println("mfs2:"+mfs2.toString());
    }
}

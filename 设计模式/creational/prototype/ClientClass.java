package com.java.creational.prototype;

public class ClientClass {
    public static void main(String[] args) {
        MyFruit fru1=new Apple();
        MyFruit fru2=new Banana();
//        MyFruit fru2=(Apple)fru1.clone();
//        fru1.Display();
//        fru2.Display();
//        System.out.println("fru1:"+fru1.hashCode());
//        System.out.println("fru2:"+fru2.hashCode());
//        System.out.println(fru1==fru2);
        MyFruitStore.Add(1,fru1);
        MyFruitStore.Add(2,fru2);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());
        MyFruit fru=(MyFruit)MyFruitStore.Get(3);
        fru.Display();

    }
}

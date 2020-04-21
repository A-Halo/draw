package com.java.creational.singleton;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable fruittable=null;
    private static MyFruitStore fruitStore=null;
    private MyFruitStore(){
        fruittable=new Hashtable<Integer,MyFruit>();
    }
    public static MyFruitStore GetFruitStore(){
        if(fruitStore==null){
            fruitStore=new MyFruitStore();
        }
        return fruitStore;
    }
    public  void Add(Integer key, MyFruit fruit){
        fruittable.put(key,fruit);
    }
    public  MyFruit Get(Integer key){
        MyFruit fruit=(MyFruit)fruittable.get(key);
        return (MyFruit) fruit.clone();
    }
}

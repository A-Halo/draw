package com.java.structural.Composite;

import com.java.structural.Adapter.OldJuicer;

import java.util.ArrayList;

public class Plate extends MyElement{
    @Override
    public void eat() {
        for (Object object:list){
            ((MyElement)object).eat();
        }
    }
    private ArrayList list=new ArrayList();
    public void add(MyElement element){
        list.add(element);
    }
    public void delete(MyElement element){
        list.remove(element);
    }

}

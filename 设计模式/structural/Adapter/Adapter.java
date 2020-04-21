package com.java.structural.Adapter;

import com.java.creational.prototype.MyFruit;

public class Adapter extends OldJuicer implements NewJuicer {
    private OldJuicer oldJuicer;
    @Override
    public String newPort(MyFruit fru1, MyFruit fru2) {
        oldJuicer=new OldJuicer();
        String str="混合果汁："+oldJuicer.oldPort(fru1);
        str+=oldJuicer.oldPort(fru2);
        return str;
    }
}

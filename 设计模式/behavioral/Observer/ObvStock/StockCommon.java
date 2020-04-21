package com.java.behavioral.Observer.ObvStock;

public class StockCommon extends AStockPrice {

    public StockCommon(String code){
        super(code);
    }
    @Override
    protected void notifyHolder() {
        System.out.println("普通股票更新-"+code+":");
        for (IStockHolder ish:stockHolderlist){
            ish.update(this);
        }
        price2=price;
    }
}

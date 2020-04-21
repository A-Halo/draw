package com.java.behavioral.Observer.ObvStock;

public class StockFutures extends AStockPrice {
    public StockFutures(String code){
        super(code);
    }
    @Override
    protected void notifyHolder() {
        System.out.println("期货更新-"+code+":");
        for (IStockHolder ish:stockHolderlist){
            ish.update(this);
        }
        price2=price;
    }
}

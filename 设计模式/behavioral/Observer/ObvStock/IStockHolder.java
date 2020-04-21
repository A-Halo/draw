package com.java.behavioral.Observer.ObvStock;

public interface IStockHolder {
    public void update(AStockPrice asp);
    public void AddHolder(AStockPrice asp);
}
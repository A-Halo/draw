package com.java.creational.Builder;

public class Meal {
    //food和drink是部件
    private String food;
    private String drink;
    public void setFood(String food){
        this.food=food;
    }
    public void setDrink(String drink){
        this.drink=drink;
    }

    public String getDrink() {
        return drink;
    }

    public String getFood() {
        return food;
    }
}

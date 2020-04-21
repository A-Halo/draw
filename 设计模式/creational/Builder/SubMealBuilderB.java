package com.java.creational.Builder;

public class SubMealBuilderB extends MealBuilder{
    public void builderFood(){
        meal.setFood("一个鸡肉卷");
    }
    public void builderDrink(){
        meal.setDrink("一杯果汁");
    }
}

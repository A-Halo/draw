package com.java.creational.Builder;

public class SubMealBuilderA extends MealBuilder{
    public void builderFood(){
        meal.setFood("一个鸡腿堡");
    }
    public void builderDrink(){
        meal.setDrink("一杯可乐");
    }
}

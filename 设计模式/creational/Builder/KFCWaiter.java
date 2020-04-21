package com.java.creational.Builder;

public class KFCWaiter {
    private MealBuilder mb;
    public void setMealBuilder(MealBuilder mb){
        this.mb=mb;
    }
    public Meal construct(){
        mb.builderFood();
        mb.builderDrink();
        return mb.getMeal();
    }
}

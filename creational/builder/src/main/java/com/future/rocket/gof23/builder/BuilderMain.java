package com.future.rocket.gof23.builder;

import com.future.rocket.gof23.builder.build.Meal;
import com.future.rocket.gof23.builder.build.MealBuilder;
import com.future.rocket.gof23.common.OtherTool;

public class BuilderMain {

    public static void main(String[] args) {
        System.out.println("hi, builder pattern, gof23 rocket launching now... seat well please.");
        OtherTool.printSplitLine();

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total cost:" + vegMeal.getCost());
        OtherTool.printSplitLine();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total cost:" + nonVegMeal.getCost());
    }
}

package com.future.rocket.gof23.builder.build;

import com.future.rocket.gof23.builder.impl.ChickenBurger;
import com.future.rocket.gof23.builder.impl.Coke;
import com.future.rocket.gof23.builder.impl.Pepsi;
import com.future.rocket.gof23.builder.impl.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }


    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}

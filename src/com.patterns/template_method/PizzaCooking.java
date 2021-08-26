package com.patterns.template_method;

public abstract class PizzaCooking {

    public void cook(){
        String pizza = "Pizza with " + addIngredients() +
                "is cooking at the temperature " +
                addCookingTemprature() +
                "in " +
                addPizzaCookingPlace();
        System.out.println(pizza);
    }

    protected abstract String addIngredients();

    protected abstract String addCookingTemprature();

    protected abstract String addPizzaCookingPlace();
}

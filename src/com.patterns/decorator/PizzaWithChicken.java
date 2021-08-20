package com.patterns.decorator;

public class PizzaWithChicken extends PizzaDecorator{

    public PizzaWithChicken(Pizza pizza){
        super(pizza);
    }

    @Override
    public String bake() {
        return super.pizza.bake() + "with chicken ";
    }

    @Override
    public int cost() {
        return super.pizza.cost() + 30;
    }
}

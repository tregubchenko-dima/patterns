package com.patterns.decorator;

public class PizzaWithСheese extends PizzaDecorator{
    public PizzaWithСheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.pizza.bake() + "with cheese ";
    }

    @Override
    public int cost() {
        return super.pizza.cost() + 10;
    }
}

package patterns.decorator;

public class DecoratorTest {

    public static void main(String[] args){

        Pizza pizza = new OrdinaryPizza();
        System.out.println("Baked: " + pizza.bake());
        System.out.println("Price: " + pizza.cost());

        Pizza pizzaWithChicken = new PizzaWithChicken(pizza);
        System.out.println("Baked: " + pizzaWithChicken.bake());
        System.out.println("Price: " + pizzaWithChicken.cost());

        Pizza pizzaWithCheese = new PizzaWithСheese(pizza);
        System.out.println("Baked: " + pizzaWithCheese.bake());
        System.out.println("Price: " + pizzaWithCheese.cost());

        Pizza pizzaWithChickenAndCheese = new PizzaWithChicken(new PizzaWithСheese(pizza));
        System.out.println("Baked: " + pizzaWithChickenAndCheese.bake());
        System.out.println("Price: " + pizzaWithChickenAndCheese.cost());
    }
}

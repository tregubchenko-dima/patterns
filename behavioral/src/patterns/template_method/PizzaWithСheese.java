package patterns.template_method;

public class PizzaWithСheese extends PizzaCooking{

    @Override
    protected String addIngredients() {
        return "cheese ";
    }

    @Override
    protected String addCookingTemprature() {
        return "120 ";
    }

    @Override
    protected String addPizzaCookingPlace() {
        return "wood-burning oven ";
    }
}

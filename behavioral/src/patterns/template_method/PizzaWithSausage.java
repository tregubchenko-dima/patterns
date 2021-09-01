package patterns.template_method;

public class PizzaWithSausage extends PizzaCooking{
    @Override
    protected String addIngredients() {
        return "sausage ";
    }

    @Override
    protected String addCookingTemprature() {
        return "100";
    }

    @Override
    protected String addPizzaCookingPlace() {
        return "ordinary home oven ";
    }
}

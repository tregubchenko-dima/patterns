package patterns.template_method;

public class TemplateMethodTest {

    public static void main(String[] args){
        PizzaCooking pizzaCooking = new PizzaWithSausage();
        pizzaCooking.cook();

        pizzaCooking = new PizzaWithСheese();
        pizzaCooking.cook();
    }
}

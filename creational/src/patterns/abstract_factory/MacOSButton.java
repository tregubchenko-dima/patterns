package patterns.abstract_factory;

public class MacOSButton implements Button{

    @Override
    public void print() {
        System.out.println("You have created Mac OS button!");
    }
}

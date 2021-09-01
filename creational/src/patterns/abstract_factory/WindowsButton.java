package patterns.abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void print() {
        System.out.println("You have created Windows button!");
    }
}

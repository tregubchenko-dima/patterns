package patterns.abstract_factory;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void print() {
        System.out.println("You have created Windows checkbox!");
    }
}

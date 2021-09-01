package patterns.abstract_factory;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void print() {
        System.out.println("You have created Mac OS checkbox!");
    }
}

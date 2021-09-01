package patterns.abstract_factory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory){
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.print();
        checkBox.print();
    }
}

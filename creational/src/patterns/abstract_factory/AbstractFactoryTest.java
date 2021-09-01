package patterns.abstract_factory;

import java.util.Locale;

public class AbstractFactoryTest {

    private static Application configure(){
        Application app;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
        }else{
            guiFactory = new WindowsFactory();
        }
        app = new Application(guiFactory);
        return app;
    }

    public static void main(String[] args){

        Application application = configure();
        application.paint();
    }
}

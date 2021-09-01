package patterns.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class NewsReader implements Observer {

    private List<String> articles;

    public NewsReader(){
        articles = new ArrayList<>();
    }

    @Override
    public void update(Observable o, Object arg) {
        articles.add(arg.toString());
        System.out.println(arg);
    }
}

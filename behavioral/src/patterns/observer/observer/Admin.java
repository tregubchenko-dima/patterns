package patterns.observer.observer;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Observer{
    private List<String> messages;

    public Admin(){
        messages = new ArrayList<>();
    }

    @Override
    public void updateChat(String message) {
        this.messages.add(message);
        System.out.println(message);
    }
}

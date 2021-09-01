package patterns.observer.observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer{
    private List<String> messages;

    public User(){
        this.messages = new ArrayList<>();
    }

    @Override
    public void updateChat(String message) {
        messages.add(message);
        System.out.println(message);
    }
}

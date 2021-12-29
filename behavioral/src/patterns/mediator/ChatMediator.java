package patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{

    private List<Person> people;

    public ChatMediator() {
        this.people = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Person person) {
        for(Person p : people){
            if(p != person){
                p.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(Person user) {
        people.add(user);
    }
}

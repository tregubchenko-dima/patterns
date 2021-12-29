package patterns.mediator;

public interface Mediator {

    void sendMessage(String message, Person person);
    void addUser(Person user);
}

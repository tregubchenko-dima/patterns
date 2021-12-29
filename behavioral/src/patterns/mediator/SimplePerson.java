package patterns.mediator;

public class SimplePerson extends Person{

    public SimplePerson(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}

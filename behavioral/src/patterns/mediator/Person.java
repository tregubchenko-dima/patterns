package patterns.mediator;

public abstract class Person {

    protected Mediator mediator;
    protected String name;

    public Person(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}

package patterns.mediator;

public class TestMediator {

    public static void main(String[] args){
        ChatMediator chat = new ChatMediator();

        Person person1 = new SimplePerson(chat,"Dima");
        Person person2 = new SimplePerson(chat, "Pavel");
        Person person3 = new SimplePerson(chat, "Vadim");

        chat.addUser(person1);
        chat.addUser(person2);
        chat.addUser(person3);

        person1.sendMessage("How is it going?");
    }
}

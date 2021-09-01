package patterns.observer;

import patterns.observer.observer.Admin;
import patterns.observer.observer.Observer;
import patterns.observer.observer.User;
import patterns.observer.subject.Chat;

public class ObserverTest {

    public static void main(String[] args){

        Chat chat = new Chat();
        Observer userDima = new User();
        Observer userPavel = new User();
        Observer admin = new Admin();

        chat.registerObserver(userDima);
        chat.registerObserver(userPavel);
        chat.registerObserver(admin);

        chat.addMessage("2021-08-19");
        chat.addMessage("Pattern Observer!");

        chat.removeObserver(admin);

        chat.addMessage("Admin left chat...");
    }
}

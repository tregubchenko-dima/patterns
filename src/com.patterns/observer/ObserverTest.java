package com.patterns.observer;

import com.patterns.observer.observer.Admin;
import com.patterns.observer.observer.Observer;
import com.patterns.observer.observer.User;
import com.patterns.observer.subject.Chat;

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

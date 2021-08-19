package com.patterns.observer.subject;

import com.patterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Chat implements Subject{
    private List<Observer> observers;
    private List<String> messages;

    public Chat(){
        observers = new ArrayList<>();
        messages = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index > 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.updateChat(message));
    }

    public void addMessage(String message){
        this.messages.add(message);
        notifyObservers(message);
    }
}

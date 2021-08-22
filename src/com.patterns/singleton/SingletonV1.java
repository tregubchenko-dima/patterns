package com.patterns.singleton;

public class SingletonV1 {

    private volatile static SingletonV1 singleton;

    private SingletonV1(){

    }

    public static SingletonV1 getInstance(){
        if(singleton == null){
            synchronized (SingletonV1.class){
                if(singleton == null){
                    singleton = new SingletonV1();
                }
            }
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Message");
    }
}

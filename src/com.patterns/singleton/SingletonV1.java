package com.patterns.singleton;

public class SingletonV1 {

    private volatile static SingletonV1 singleton;

    private String value;

    private SingletonV1(String value){
        this.value = value;
    }

    public static SingletonV1 getInstance(String value){
        if(singleton == null){
            synchronized (SingletonV1.class){
                if(singleton == null){
                    singleton = new SingletonV1(value);
                }
            }
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Message: " + value);
    }

    public String getValue(){
        return value;
    }
}

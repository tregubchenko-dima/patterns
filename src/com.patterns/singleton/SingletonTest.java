package com.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args){

        SingletonV1 singletonV1 = SingletonV1.getInstance();
        SingletonV1 singletonV11 = SingletonV1.getInstance();
        singletonV1.showMessage();
        System.out.println(singletonV1.hashCode());
        System.out.println(singletonV11.hashCode());

        SingletonV2 singletonV2 = SingletonV2.getInstance();
        SingletonV2 singletonV22 = SingletonV2.getInstance();
        singletonV2.showMessage();
        System.out.println(singletonV2.hashCode());
        System.out.println(singletonV22.hashCode());

    }
}

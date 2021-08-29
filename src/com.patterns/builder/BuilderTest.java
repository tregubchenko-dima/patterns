package com.patterns.builder;

public class BuilderTest {

    public static void main(String[] args){
        Person person = new Person.Builder()
                .withFirstName("Dima")
                .withLastName("Tregu")
                .withEmail("somegmail@some.com")
                .withPhoneNumber("+12345678910")
                .build();

        System.out.println(person.toString());
    }
}

package com.patterns.builder;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder{

        private Person person;

        public Builder(){
            this.person = new Person();
        }

        public Builder withFirstName(String firstName){
            this.person.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            this.person.lastName = lastName;
            return this;
        }

        public Builder withAge(int age){
            this.person.age = age;
            return this;
        }

        public Builder withEmail(String email){
            this.person.email = email;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber){
            this.person.phoneNumber = phoneNumber;
            return this;
        }

        public Person build(){
            return person;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
